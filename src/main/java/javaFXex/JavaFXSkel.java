package javaFXex;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class JavaFXSkel extends Application {
    public static void main(String[] args) {
        System.out.println("Зaпycк JаvаFХ-приложения.");
        //запустить JаvаFХ-приложение, вызвав метод launch()
        launch(args);
    }

    //переопределить метод init()
    public void init() {
        System.out.println("B теле метода init() .");
    }

    //ереопределить метод start()
    public void start(Stage myStage) {
        System.out.println("B теле метода start() .");
//присвоить заголовок подмосткам
        myStage.setTitle("JavaFX Skeleton.");
        //Скелет JаvаFХ-приложения
        // Создать корневой узел. В данном случае используется
        // панель поточной компоновки, хотя возможны и другие
        // варианты компоновки
        FlowPane rootNode = new FlowPane();
        //  создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);
        //установить сцену на подмостках
        myStage.setScene(myScene);
        // показать подмостки и сцену на них
        myStage.show();
    }

    // переопределить метод stop()
    public void stop() {
        System.out.println("B теле метода stop() .");
    }
}