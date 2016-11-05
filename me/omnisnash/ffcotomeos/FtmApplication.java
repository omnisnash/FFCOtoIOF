package me.omnisnash.ffcotomeos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FtmApplication extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage)
    {
        FtmController controller = new FtmController(stage);

        Scene scene = new Scene(controller.getGui());

        stage.setScene(scene);
        stage.setTitle(IConstant.APPLICATION_NAME);

        stage.show();
    }
}
