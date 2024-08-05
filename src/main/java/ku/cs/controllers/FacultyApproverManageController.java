package ku.cs.controllers;

import javafx.fxml.FXML;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class FacultyApproverManageController {



    @FXML
    public void onAppealButton() {
        try {
            FXRouter.goTo("faculty-appeal-manage");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
