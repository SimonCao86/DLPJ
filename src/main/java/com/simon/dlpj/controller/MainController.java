package com.simon.dlpj.controller;

import com.simon.dlpj.DlpjApplication;
import com.simon.dlpj.service.MainService;
import com.simon.dlpj.views.MainView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by caoyang on 2022-08-24
 **/
@FXMLController
public class MainController implements Initializable {

    @Autowired
    private MainView mainView;

    @Autowired
    private MainService mainService;

    @FXML // 可忽略
    public Button button;// 注意必须为public修饰符

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        primaryStage = DlpjApplication.getStage();
//        button.setOnAction(event -> {
//            Alert alert = new Alert(Alert.AlertType.INFORMATION, "hello world");
//            alert.initOwner(primaryStage);
//            alert.showAndWait();
//        });
    }
}

