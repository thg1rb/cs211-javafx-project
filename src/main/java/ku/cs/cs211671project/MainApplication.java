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
        FXRouter.goTo("login");
    }

    private void configRoutes() {
        String viewPath = "ku/cs/views/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");

        // Major
        FXRouter.when("major-appeal-manage", viewPath + "major-appeal-manage.fxml");
        FXRouter.when("major-approver-manage", viewPath + "major-approver-manage.fxml");
        FXRouter.when("major-nisit-manage", viewPath + "major-nisit-manage.fxml");

        // Admin
        FXRouter.when("admin-user-manage", viewPath + "admin-user-management.fxml");
        FXRouter.when("admin-faculty-manage", viewPath + "admin-faculty-management.fxml");
        FXRouter.when("admin-staff-manage", viewPath + "admin-staff-management.fxml");
        FXRouter.when("admin-dashboard", viewPath + "admin-dashboard.fxml");

        // Professor
        FXRouter.when("professor-student-appeal" , viewPath + "professor-student-appeal.fxml");
        FXRouter.when("professor-student-list", viewPath + "professor-student-list.fxml");
        FXRouter.when("professor-account", viewPath+ "professor-account.fxml");

        // Student
        FXRouter.when("student-create-appeal" , viewPath + "student-create-appeal.fxml");
        FXRouter.when("student-track-appeal" , viewPath + "student-track-appeal.fxml");

        // General
        FXRouter.when("login", viewPath + "login.fxml");
        FXRouter.when("register-personal-data", viewPath + "register-personal-data.fxml");
        FXRouter.when("register-username-password", viewPath + "register-username-password.fxml");

        // Faculty
        FXRouter.when("faculty-appeal-manage", viewPath + "faculty-appeal-manage.fxml");
        FXRouter.when("faculty-approver-manage", viewPath + "faculty-approver-manage.fxml");




    }

    public static void main(String[] args) {
        launch();
    }
}