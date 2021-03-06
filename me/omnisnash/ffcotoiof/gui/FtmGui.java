package me.omnisnash.ffcotoiof.gui;

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
import me.omnisnash.ffcotoiof.IConstant;
import me.omnisnash.ffcotoiof.logger.Logger;
import me.omnisnash.ffcotoiof.parser.ESupportedFormat;
import me.omnisnash.ffcotoiof.parser.ExtractRequest;

import java.io.File;
import java.util.Locale;
import java.util.ResourceBundle;

public class FtmGui extends VBox
{
    private String TEXT_BROWSE;
    private final Stage stage;
    private final ObservableList<String> logs;
    private final ResourceBundle resource;
    private IApplicationInteraction callback;
    BooleanProperty running;
    private TextField txtInput;
    private TextField txtOrganisation;
    private TextField txtCompetitor;
    private ListView<String> lstLogs;
    private RadioButton rdbEo2003;
    private RadioButton rdbEo2010;
    private Button btnExtract;
    private CheckBox ckbInvertName;
    private GridPane gpForm;
    private ProgressIndicator pgiRunning;
    private StackPane spFormContainer;

    public FtmGui(Stage mainStage, IApplicationInteraction listener)
    {

        stage = mainStage;
        callback = listener;
        running = new SimpleBooleanProperty(false);
        logs = FXCollections.observableArrayList();

        resource = ResourceBundle.getBundle(IConstant.BUNDLE_GUI, Locale.getDefault());
        TEXT_BROWSE = resource.getString("BUTTON_BROWSE");

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
        Platform.runLater(() -> {
            logs.add(log);
            lstLogs.scrollTo(log);
        });
    }

    private void buildGui()
    {
        getStylesheets().add("me/omnisnash/ffcotoiof/resources/screen.css");
        getStyleClass().add(IConstant.CSS.CLASS_BOX);

        getChildren().add(buildForm());

        HBox hbxExtract = new HBox();
        getChildren().add(hbxExtract);

        btnExtract = new Button(resource.getString("BUTTON_EXTRACT"));
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

        hbxExtract.getChildren().add(btnExtract);

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
        request.setInvertName(ckbInvertName.isSelected());

        callback.onButtonExtract(request);
    }

    private Node buildForm()
    {
        spFormContainer = new StackPane();

        gpForm = new GridPane();
        gpForm.getStyleClass().add(IConstant.CSS.CLASS_GRIDPANE);
        spFormContainer.getChildren().add(gpForm);

        int line = 0;
        int column = 3;

        // Input CSV
        Label lblInput = new Label(resource.getString("LABEL_INPUT_CSV"));
        gpForm.add(lblInput, 0, line);

        txtInput = new TextField();
        txtInput.setMaxWidth(Double.MAX_VALUE);
        GridPane.setHgrow(txtInput, Priority.ALWAYS);
        gpForm.add(txtInput, 1, line);

        Button btnInput = new Button(TEXT_BROWSE);
        btnInput.setOnAction(event ->
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle(resource.getString("FILE_CHOOSER_INPUT_CSV"));
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("CSV Files", "*.csv"),
                    new FileChooser.ExtensionFilter("All Files", "*.*"));

            File file = new File(txtInput.getText());
            if(!txtInput.getText().isEmpty() && file.getParentFile().exists())
            {
                fileChooser.setInitialFileName(file.getName());
                fileChooser.setInitialDirectory(file.getParentFile());
            }

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

        gpForm.add(new Label(resource.getString("LABEL_FORMAT")), 0, ++line);
        gpForm.add(hbxOeFormat, 1, line, column - 1, 1);

        // Name invert
        ckbInvertName = new CheckBox(resource.getString("CHECKBOX_INVERT_NAME"));
        ckbInvertName.setSelected(false);
        gpForm.add(ckbInvertName, 1, ++line, column - 1, 1);

        gpForm.add(new Separator(Orientation.HORIZONTAL), 0, ++line, column, 1);

        // Organisation XML
        Label lblOrganisation = new Label(resource.getString("LABEL_OUTPUT_ORGANISATION"));
        gpForm.add(lblOrganisation, 0, ++line);

        txtOrganisation = new TextField();
        txtOrganisation.setMaxWidth(Double.MAX_VALUE);
        GridPane.setHgrow(txtOrganisation, Priority.ALWAYS);
        gpForm.add(txtOrganisation, 1, line);

        Button btnOrganisation = new Button(TEXT_BROWSE);
        btnOrganisation.setOnAction(event ->
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle(resource.getString("FILE_CHOOSER_OUTPUT_ORGANISATION"));
            fileChooser.setInitialFileName(IConstant.DEFAULT_ORGANISATION_FILENAME);
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("XML Files", "*.xml"),
                    new FileChooser.ExtensionFilter("All Files", "*.*"));

            File file = new File(txtOrganisation.getText());
            if(!txtInput.getText().isEmpty() && file.getParentFile().exists())
            {
                fileChooser.setInitialFileName(file.getName());
                fileChooser.setInitialDirectory(file.getParentFile());
            }

            File selectedFile = fileChooser.showSaveDialog(stage);

            if (selectedFile != null)
            {
                txtOrganisation.setText(selectedFile.getAbsolutePath());
            }
        });
        gpForm.add(btnOrganisation, 2, line);

        // Competitor XML
        Label lblCompetitor = new Label(resource.getString("LABEL_OUTPUT_COMPETITOR"));
        gpForm.add(lblCompetitor, 0, ++line);

        txtCompetitor = new TextField();
        txtCompetitor.setMaxWidth(Double.MAX_VALUE);
        GridPane.setHgrow(txtCompetitor, Priority.ALWAYS);
        gpForm.add(txtCompetitor, 1, line);

        Button btnCompetitor = new Button(TEXT_BROWSE);
        btnCompetitor.setOnAction(event ->
        {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle(resource.getString("FILE_CHOOSER_OUTPUT_COMPETITOR"));
            fileChooser.setInitialFileName(IConstant.DEFAULT_COMPETITOR_FILENAME);
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("XML Files", "*.xml"),
                    new FileChooser.ExtensionFilter("All Files", "*.*"));

            File file = new File(txtCompetitor.getText());
            if(!txtInput.getText().isEmpty() && file.getParentFile().exists())
            {
                fileChooser.setInitialFileName(file.getName());
                fileChooser.setInitialDirectory(file.getParentFile());
            }

            File selectedFile = fileChooser.showSaveDialog(stage);

            if (selectedFile != null)
            {
                txtCompetitor.setText(selectedFile.getAbsolutePath());
            }
        });
        gpForm.add(btnCompetitor, 2, line);


        return spFormContainer;
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

    public void setExportRunning(boolean isRunning)
    {
        Platform.runLater(() -> {

            running.setValue(isRunning);

            if(isRunning)
            {
                gpForm.setDisable(true);

                pgiRunning = new ProgressIndicator();
                spFormContainer.getChildren().add(pgiRunning);
            }
            else
            {
                gpForm.setDisable(false);

                spFormContainer.getChildren().remove(pgiRunning);
            }
        });
    }

    public interface IApplicationInteraction
    {
        void onFileLoaded(String input);

        void onButtonExtract(ExtractRequest request);
    }
}
