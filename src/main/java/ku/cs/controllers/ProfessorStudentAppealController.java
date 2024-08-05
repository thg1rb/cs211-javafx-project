package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class ProfessorStudentAppealController {

    // ไปที่หน้านิสิตในที่ปรึกษา
    @FXML
    public void onStudentListButtonClick() {
        try {
            FXRouter.goTo("professor-student-list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // ไปที่หน้าคำร้องจากนิสิต
    @FXML
    public void onStudentAppealButtonClick() {
        try {
            FXRouter.goTo("professor-student-appeal");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
