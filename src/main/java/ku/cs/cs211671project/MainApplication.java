package ku.cs.cs211671project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "CS211 Project", 1440, 832);
        configRoutes();
        FXRouter.goTo("major-approver-manage");
    }

    private void configRoutes() {
        String viewPath = "ku/cs/views/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");
        FXRouter.when("major-appeal-manage", viewPath + "major-appeal-manage.fxml");
        FXRouter.when("major-approver-manage", viewPath + "major-approver-manage.fxml");
        FXRouter.when("major-nisit-manage", viewPath + "major-nisit-manage.fxml");


    }

    public static void main(String[] args) {
        launch();
    }
}