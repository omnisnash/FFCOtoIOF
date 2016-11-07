package me.omnisnash.ffcotomeos;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
        stage.getIcons().add(new Image("me/omnisnash/ffcotomeos/resources/img/icon.png"));
        stage.setTitle(IConstant.APPLICATION_NAME + " - v." + IConstant.APPLICATION_VERSION);

        stage.show();
    }
}
