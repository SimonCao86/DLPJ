package com.simon.dlpj;

import com.simon.dlpj.views.CustomLoadingView;
import com.simon.dlpj.views.MainView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DlpjApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
//        SpringApplication.run(DlpjApplication.class, args);
//        Application.launch(MainView.class);
        launch(DlpjApplication.class, MainView.class, new CustomLoadingView(), args);
    }


}
