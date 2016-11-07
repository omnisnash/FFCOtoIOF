package me.omnisnash.ffcotomeos;

import javafx.scene.Parent;
import javafx.stage.Stage;
import me.omnisnash.ffcotomeos.logger.Logger;
import me.omnisnash.ffcotomeos.parser.ESupportedFormat;
import me.omnisnash.ffcotomeos.parser.OE2003.OE2003Parser;
import me.omnisnash.ffcotomeos.parser.OE2010.OE2010Parser;

import java.io.*;

import static me.omnisnash.ffcotomeos.parser.ESupportedFormat.OE2003;
import static me.omnisnash.ffcotomeos.parser.ESupportedFormat.OE2010;


public class FtmController implements FtmGui.IApplicationInteraction
{
    private static final String ERROR_UNKNOWN_HEADER = "Warn : Unknown CSV header.";

    private final FtmGui gui;

    public FtmController(Stage stage)
    {
        gui = new FtmGui(stage, this);
    }


    public Parent getGui()
    {
        return gui;
    }

    @Override
    public void onFileLoaded(String input)
    {
        File inputFile = new File(input);

        if (inputFile.exists() && inputFile.isFile())
        {
            FileInputStream fis = null;

            try
            {

                fis = new FileInputStream(inputFile);
                BufferedReader br = new BufferedReader(new InputStreamReader(fis, "ISO8859_1"));

                String line = br.readLine();

                if (line.equals(IConstant.OE2003_CSV_HEADER))
                {
                    gui.setFormat(ESupportedFormat.OE2003);
                    Logger.getInstance().log("Detected format: " + OE2003.toString());
                } else if (line.equals(IConstant.OE2010_CSV_HEADER))
                {
                    gui.setFormat(OE2010);
                    Logger.getInstance().log("Detected format: " + OE2010.toString());
                } else
                {
                    Logger.getInstance().log(ERROR_UNKNOWN_HEADER);
                }

            } catch (Exception e)
            {
                Logger.getInstance().log(ERROR_UNKNOWN_HEADER);
            } finally
            {
                if (fis != null)
                {
                    try
                    {
                        fis.close();
                    } catch (IOException e)
                    {
                        Logger.getInstance().log(ERROR_UNKNOWN_HEADER);
                    }
                }
            }
        }
    }

    @Override
    public void onButtonExtract(String input, String organisation, String competitor, ESupportedFormat format)
    {
        Thread t = new Thread(() -> {
            gui.setExportRunning(true);
            gui.setProgressVisible(true);
            gui.clearLogs();

            switch (format)
            {
                case OE2003:
                    new OE2003Parser().parse(input, organisation, competitor);
                    break;
                case OE2010:
                    new OE2010Parser().parse(input, organisation, competitor);
                    break;
            }

            gui.setProgressVisible(false);
            gui.setExportRunning(false);
        });

        t.start();




    }
}