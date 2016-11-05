package me.omnisnash.ffcotomeos;

import javafx.application.Platform;
import javafx.beans.binding.BooleanBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class FtmGui extends VBox
{
    private final Stage stage;
    private final ObservableList<String> logs;
    private IApplicationInteraction callback;
    private TextField txtInput;
    private TextField txtOrganisation;
    private TextField txtCompetitor;

    public FtmGui(Stage mainStage, IApplicationInteraction listener)
    {
        stage = mainStage;
        callback = listener;

        logs = FXCollections.observableArrayList();

        buildGui();
    }

    public void addLog(String log)
    {
        Platform.runLater(() -> logs.add(log));
    }

    public void clearLogs()
    {
        Platform.runLater(() -> logs.clear());
    }

    private void buildGui()
    {
        getStylesheets().add("me/omnisnash/ffcotomeos/resources/screen.css");
        getStyleClass().add(IConstant.CSS.CLASS_BOX);

        getChildren().add(buildForm());

        HBox hbxExtract = new HBox();
        getChildren().add(hbxExtract);

        Button btnExtract = new Button("Extract");
        btnExtract.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(btnExtract, Priority.ALWAYS);
        btnExtract.setOnAction(event -> callback.onButtonExtract(txtInput.getText(), txtOrganisation.getText(), txtCompetitor.getText()));
        btnExtract.disableProperty().bind(BooleanBinding.booleanExpression(new BooleanBinding()
        {
            @Override
            protected boolean computeValue()
            {
                bind(txtCompetitor.textProperty(), txtOrganisation.textProperty(), txtInput.textProperty());
                return (txtOrganisation.getText().isEmpty() || txtInput.getText().isEmpty() || txtCompetitor.getText().isEmpty());
            }
        }));
        hbxExtract.getChildren().add(btnExtract);

        ListView<String> lstLogs = new ListView<>(logs);
        lstLogs.setMaxHeight(Double.MAX_VALUE);
        VBox.setVgrow(lstLogs, Priority.ALWAYS);
        getChildren().add(lstLogs);
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
        btnInput.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select FFCO CSV file");
            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("CSV Files", "*.csv"),
                    new FileChooser.ExtensionFilter("All Files", "*.*"));

            File selectedFile = fileChooser.showOpenDialog(stage);

            if (selectedFile != null)
            {
                txtInput.setText(selectedFile.getAbsolutePath());

                if(txtCompetitor.getText().isEmpty())
                {
                    txtCompetitor.setText(selectedFile.getParent() + File.separator + IConstant.DEFAULT_COMPETITOR_FILENAME);
                }

                if(txtOrganisation.getText().isEmpty())
                {
                    txtOrganisation.setText(selectedFile.getParent() + File.separator + IConstant.DEFAULT_ORGANISATION_FILENAME);
                }
            }
        });
        gpForm.add(btnInput, 2, line);

        gpForm.add(new Separator(Orientation.HORIZONTAL), 0, ++line, column, 1);

        // Organisation XML
        Label lblOrganisation = new Label("Organisation XML file:");
        gpForm.add(lblOrganisation, 0, ++line);

        txtOrganisation = new TextField();
        txtOrganisation.setMaxWidth(Double.MAX_VALUE);
        GridPane.setHgrow(txtOrganisation, Priority.ALWAYS);
        gpForm.add(txtOrganisation, 1, line);

        Button btnOrganisation = new Button("Browse...");
        btnOrganisation.setOnAction(event -> {
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
        btnCompetitor.setOnAction(event -> {
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

    public interface IApplicationInteraction
    {
        void onButtonExtract(String input, String organisation, String competitor);
    }
}
