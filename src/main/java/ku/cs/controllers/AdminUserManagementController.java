package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class AdminUserManagementController {
    @FXML
    public void onDashboardButtonClicked() {
        try {
            FXRouter.goTo("admin-dashboard");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    public void onFacultyButtonClicked() {
        try {
            FXRouter.goTo("admin-faculty-manage");
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
