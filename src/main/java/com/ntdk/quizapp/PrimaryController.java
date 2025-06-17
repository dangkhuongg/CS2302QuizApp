package com.ntdk.quizapp;

import com.ntdk.utils.MyAlert;
import javafx.event.ActionEvent;

public class PrimaryController {
    public void handleQuestionManagement(ActionEvent event){
        MyAlert.getInstance().showMsg("QuestionManagement: Coming soon ...");
        
    }
    public void handlePractice(ActionEvent evnet){
        MyAlert.getInstance().showMsg("Practice: Coming soon ...");
    }
}
