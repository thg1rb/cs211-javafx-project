package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class StudentCreateAppealController {

    // ไปที่หน้าติดตามคำร้อง
    @FXML
    private void onTrackAppealButtonClick() {
        try {
            FXRouter.goTo("student-track-appeal");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ไปที่หน้าสร้างใบคำร้อง
    @FXML
    private void onCreateAppealButtonClick() {
        try {
            FXRouter.goTo("student-create-appeal");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
