package me.omnisnash.ffcotomeos;

import javafx.application.Platform;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import me.omnisnash.ffcotomeos.logger.Logger;
import me.omnisnash.ffcotomeos.parser.ESupportedFormat;
import me.omnisnash.ffcotomeos.parser.ExtractRequest;

import java.io.File;

public class FtmGui extends VBox
{
    private final Stage stage;
    private final ObservableList<String> logs;
    private IApplicationInteraction callback;
    BooleanProperty running;
    private TextField txtInput;
    private TextField txtOrganisation;
    private TextField txtCompetitor;
    private ListView<String> lstLogs;
    private RadioButton rdbEo2003;
    private RadioButton rdbEo2010;
    private ProgressIndicator progressIndicator;
    private Button btnExtract;

    public FtmGui(Stage mainStage, IApplicationInteraction listener)
    {
        stage = mainStage;
        callback = listener;
        running = new SimpleBooleanProperty(false);
        logs = FXCollections.observableArrayList();

        listenLog();
        buildGui();

    }

    private void listenLog()
    {
        Logger.getInstance().addLogListener(log -> addLog(log));
    }

    public void clearLogs()
    {
        Platform.runLater(() -> logs.clear());
    }

    private void addLog(String log)
    {
        Platform.runLater(() -> logs.add(log));
    }

    private void buildGui()
    {
        getStylesheets().add("me/omnisnash/ffcotomeos/resources/screen.css");
        getStyleClass().add(IConstant.CSS.CLASS_BOX);

        getChildren().add(buildForm());

        HBox hbxExtract = new HBox();
        getChildren().add(hbxExtract);

        btnExtract = new Button("Extract");
        btnExtract.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(btnExtract, Priority.ALWAYS);
        btnExtract.setOnAction(event -> sendExtractRequest());
        btnExtract.disableProperty().bind(BooleanBinding.booleanExpression(new BooleanBinding()
        {
            @Override
            protected boolean computeValue()
            {
                bind(txtCompetitor.textProperty(), txtOrganisation.textProperty(), txtInput.textProperty(), running);
                return ((running.getValue() || txtOrganisation.getText().isEmpty() || txtInput.getText().isEmpty() || txtCompetitor.getText().isEmpty()));
            }
        }));

        progressIndicator = new ProgressIndicator();
        progressIndicator.setVisible(false);
        progressIndicator.prefHeightProperty().bind(btnExtract.heightProperty());

        Region rgnPadding = new Region();
        rgnPadding.prefWidthProperty().bind(progressIndicator.widthProperty());

        hbxExtract.getChildren().add(rgnPadding);
        hbxExtract.getChildren().add(btnExtract);
        hbxExtract.getChildren().add(progressIndicator);

        lstLogs = new ListView<>(logs);
        lstLogs.setMaxHeight(Double.MAX_VALUE);
        VBox.setVgrow(lstLogs, Priority.ALWAYS);
        getChildren().add(lstLogs);
    }

    private void sendExtractRequest()
    {
        ESupportedFormat format;
        if (rdbEo2003.isSelected())
        {
            format = ESupportedFormat.OE2003;
        } else
        {
            format = ESupportedFormat.OE2010;
        }

        ExtractRequest request = new ExtractRequest(format);
        request.setInputtedFilePath(txtInput.getText());
        request.setOrganisationsXmlPath(txtOrganisation.getText());
        request.setCompetitorsXmlPath(txtCompetitor.getText());
        //request.setInvertName();

        callback.onButtonExtract(request);
    }

    private Node buildForm()
    {
        GridPane gpForm = new GridPane();
        gpForm.getStyleClass().add(IConstant.CSS.CLASS_GRIDPANE);


        int line = 0;
        int column = 3;

        // Input CSV
        Label lblInput = new Label("FFCO CSV file:");
        gpForm.add(lblInput, 0, line);

        txtInput = new TextField();
        txtInput.setMaxWidth(Double.MAX_VALUE);
        GridPane.setHgrow(txtInput, Priority.ALWAYS);
        gpForm.add(txtInput, 1, line);

        Button btnInput = new Button("Browse...");
        btnInput.setOnAction(event ->
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select FFCO CSV file");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("CSV Files", "*.csv"),
                    new FileChooser.ExtensionFilter("All Files", "*.*"));

            File selectedFile = fileChooser.showOpenDialog(stage);

            if (selectedFile != null)
            {
                txtInput.setText(selectedFile.getAbsolutePath());
                callback.onFileLoaded(selectedFile.getAbsolutePath());

                if (txtCompetitor.getText().isEmpty())
                {
                    txtCompetitor.setText(selectedFile.getParent() + File.separator + IConstant.DEFAULT_COMPETITOR_FILENAME);
                }

                if (txtOrganisation.getText().isEmpty())
                {
                    txtOrganisation.setText(selectedFile.getParent() + File.separator + IConstant.DEFAULT_ORGANISATION_FILENAME);
                }
            }
        });
        gpForm.add(btnInput, 2, line);

        // OE format selection
        HBox hbxOeFormat = new HBox();
        hbxOeFormat.getStyleClass().add(IConstant.CSS.CLASS_RADIOBUTONS);

        ToggleGroup rdbGroup = new ToggleGroup();

        rdbEo2003 = new RadioButton(ESupportedFormat.OE2003.toString());
        hbxOeFormat.getChildren().add(rdbEo2003);
        rdbEo2003.setToggleGroup(rdbGroup);
        rdbEo2003.setSelected(true);

        rdbEo2010 = new RadioButton(ESupportedFormat.OE2010.toString());
        hbxOeFormat.getChildren().add(rdbEo2010);
        rdbEo2010.setToggleGroup(rdbGroup);

        gpForm.add(new Label("Format:"), 0, ++line);
        gpForm.add(hbxOeFormat, 1, line, column - 1, 1);


        gpForm.add(new Separator(Orientation.HORIZONTAL), 0, ++line, column, 1);

        // Organisation XML
        Label lblOrganisation = new Label("Organisation XML file:");
        gpForm.add(lblOrganisation, 0, ++line);

        txtOrganisation = new TextField();
        txtOrganisation.setMaxWidth(Double.MAX_VALUE);
        GridPane.setHgrow(txtOrganisation, Priority.ALWAYS);
        gpForm.add(txtOrganisation, 1, line);

        Button btnOrganisation = new Button("Browse...");
        btnOrganisation.setOnAction(event ->
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select XML organisation output");
            fileChooser.setInitialFileName(IConstant.DEFAULT_ORGANISATION_FILENAME);
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("XML Files", "*.xml"),
                    new FileChooser.ExtensionFilter("All Files", "*.*"));

            File selectedFile = fileChooser.showSaveDialog(stage);

            if (selectedFile != null)
            {
                txtOrganisation.setText(selectedFile.getAbsolutePath());
            }
        });
        gpForm.add(btnOrganisation, 2, line);

        // Competitor XML
        Label lblCompetitor = new Label("Competitor XML file:");
        gpForm.add(lblCompetitor, 0, ++line);

        txtCompetitor = new TextField();
        txtCompetitor.setMaxWidth(Double.MAX_VALUE);
        GridPane.setHgrow(txtCompetitor, Priority.ALWAYS);
        gpForm.add(txtCompetitor, 1, line);

        Button btnCompetitor = new Button("Browse...");
        btnCompetitor.setOnAction(event ->
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select XML competitor output");
            fileChooser.setInitialFileName(IConstant.DEFAULT_COMPETITOR_FILENAME);
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("XML Files", "*.xml"),
                    new FileChooser.ExtensionFilter("All Files", "*.*"));

            File selectedFile = fileChooser.showSaveDialog(stage);

            if (selectedFile != null)
            {
                txtCompetitor.setText(selectedFile.getAbsolutePath());
            }
        });
        gpForm.add(btnCompetitor, 2, line);

        return gpForm;
    }

    public void setFormat(ESupportedFormat format)
    {
        switch (format)
        {
            case OE2003:
                rdbEo2003.setSelected(true);
                break;
            case OE2010:
                rdbEo2010.setSelected(true);
                break;
        }
    }

    public void setProgressVisible(boolean visible)
    {

    }

    public void setExportRunning(boolean isRunning)
    {

        Platform.runLater(() -> {
            progressIndicator.setVisible(isRunning);
            running.setValue(isRunning);
        });
    }

    public interface IApplicationInteraction
    {
        void onFileLoaded(String input);

        void onButtonExtract(ExtractRequest request);
    }
}
