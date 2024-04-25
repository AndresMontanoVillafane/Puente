package es.babel;

import es.babel.Application.PuenteApp;
import es.babel.Config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        PuenteApp puenteApp = context.getBean(PuenteApp.class);

        puenteApp.run();
    }
}