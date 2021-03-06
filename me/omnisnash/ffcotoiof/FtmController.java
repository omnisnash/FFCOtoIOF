package me.omnisnash.ffcotoiof;

import javafx.scene.Parent;
import javafx.stage.Stage;
import me.omnisnash.ffcotoiof.gui.FtmGui;
import me.omnisnash.ffcotoiof.logger.Logger;
import me.omnisnash.ffcotoiof.parser.ESupportedFormat;
import me.omnisnash.ffcotoiof.parser.ExtractRequest;
import me.omnisnash.ffcotoiof.parser.OE.OEParser;

import java.io.*;

import static me.omnisnash.ffcotoiof.parser.ESupportedFormat.OE2003;
import static me.omnisnash.ffcotoiof.parser.ESupportedFormat.OE2010;


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
    public void onButtonExtract(ExtractRequest request)
    {
        Thread t = new Thread(() -> {
            gui.setExportRunning(true);
            gui.clearLogs();

            new OEParser().parse(request);


            gui.setExportRunning(false);
        });

        t.start();




    }
}
