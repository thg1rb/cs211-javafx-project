package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class ProfessorStudentListController {
    @FXML
    public void onStudentListButtonClick() {
        try {
            FXRouter.goTo("professor-student-list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    public void onStudentAppealButtonClick() {
        try {
            FXRouter.goTo("professor-student-appeal");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
