package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class AdminFacultyManagementController {
    @FXML
    public void onUserButtonClicked() {
        try {
            FXRouter.goTo("admin-user-manage");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void onDashboardButtonClicked() {
        try {
            FXRouter.goTo("admin-dashboard");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    public void onStaffButtonClicked() {
        try {
            FXRouter.goTo("admin-staff-manage");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
