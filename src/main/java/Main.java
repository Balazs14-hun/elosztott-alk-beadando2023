import game.Jatek;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.sql.Time;

public class Main extends Application {
    private Stage primaryStage;
    private Scene scene1;
    private Scene scene2;
    private boolean jatekVege = false;

    public static void main(String[] args) {
        launch(args);
    }

    public Scene getScene(Jatek jatek, String jatekter) {
        ImageView warrior = new ImageView(new Image("D:\\_prog\\elosztott-alk-beadando2023\\src\\main\\resources\\warrior_idle.png"));
        ImageView warrior_attack = new ImageView(new Image("D:\\_prog\\elosztott-alk-beadando2023\\src\\main\\resources\\warrior_attack.png"));
        ImageView warrior_dead = new ImageView(new Image("D:\\_prog\\elosztott-alk-beadando2023\\src\\main\\resources\\warrior_dead.png"));
        ImageView empty = new ImageView(new Image("D:\\_prog\\elosztott-alk-beadando2023\\src\\main\\resources\\empty.png"));
        ImageView wizard = new ImageView(new Image("D:\\_prog\\elosztott-alk-beadando2023\\src\\main\\resources\\wizard_idle.png"));
        ImageView wizard_attack = new ImageView(new Image("D:\\_prog\\elosztott-alk-beadando2023\\src\\main\\resources\\wizard_attack.png"));
        ImageView wizard_dead = new ImageView(new Image("D:\\_prog\\elosztott-alk-beadando2023\\src\\main\\resources\\wizard_dead.png"));

        Text title = new Text("The game shows a round for 2 seconds.");
        title.setFont(Font.font("Arial", 18));
        HBox pictureBox = new HBox(10);
        BorderPane root = new BorderPane();
        BorderPane borderPane1 = new BorderPane();
        borderPane1.setMaxHeight(100);
        BorderPane borderPane2 = new BorderPane();
        borderPane2.setMaxHeight(100);
        Scene scene;
        Text text1;
        Text text2;

        if (jatek.harcos.getEletero() <= 0 && jatek.varazslo.getEletero() <= 0) {
            text1 = new Text("HP: " + Integer.toString(jatek.harcos.getEletero()));
            text1.setFont(Font.font("Arial", 18));
            text2 = new Text("HP: " + Integer.toString(jatek.varazslo.getEletero()));
            text2.setFont(Font.font("Arial", 18));
            borderPane1.setCenter(warrior_dead);
            borderPane1.setTop(text1);
            borderPane2.setCenter(wizard_dead);
            borderPane2.setTop(text2);
            pictureBox.getChildren().addAll(borderPane1, empty, borderPane2);
            root.setTop(title);
            root.setCenter(pictureBox);

            scene = new Scene(root, 800, 600);
            jatekVege = true;
            return scene;
        } else if (jatek.harcos.getEletero() <= 0) {
            text1 = new Text("HP: " + Integer.toString(jatek.harcos.getEletero()));
            text1.setFont(Font.font("Arial", 18));
            text2 = new Text("HP: " + Integer.toString(jatek.varazslo.getEletero()));
            text2.setFont(Font.font("Arial", 18));
            borderPane1.setCenter(warrior_dead);
            borderPane1.setTop(text1);
            borderPane2.setCenter(wizard);
            borderPane2.setTop(text2);
            pictureBox.getChildren().addAll(borderPane1, empty, borderPane2);
            root.setTop(title);
            root.setCenter(pictureBox);

            scene = new Scene(root, 800, 600);
            jatekVege = true;
            return scene;
        } else if (jatek.varazslo.getEletero() <= 0) {
            text1 = new Text("HP: " + Integer.toString(jatek.harcos.getEletero()));
            text1.setFont(Font.font("Arial", 18));
            text2 = new Text("HP: " + Integer.toString(jatek.varazslo.getEletero()));
            text2.setFont(Font.font("Arial", 18));
            borderPane1.setCenter(warrior);
            borderPane1.setTop(text1);
            borderPane2.setCenter(wizard_dead);
            borderPane2.setTop(text2);
            pictureBox.getChildren().addAll(borderPane1, empty, borderPane2);
            root.setTop(title);
            root.setCenter(pictureBox);

            scene = new Scene(root, 800, 600);
            jatekVege = true;
            return scene;
        }

        switch (jatekter) {
            case "H_V":
                text1 = new Text("HP: " + Integer.toString(jatek.harcos.getEletero()));
                text1.setFont(Font.font("Arial", 18));
                text2 = new Text("HP: " + Integer.toString(jatek.varazslo.getEletero()));
                text2.setFont(Font.font("Arial", 18));
                borderPane1.setCenter(warrior);
                borderPane1.setTop(text1);
                borderPane2.setCenter(wizard);
                borderPane2.setTop(text2);
                pictureBox.getChildren().addAll(borderPane1, empty, borderPane2);
                root.setTop(title);
                root.setCenter(pictureBox);

                scene = new Scene(root, 800, 600);
                return scene;

            case "HV_":
                text1 = new Text("HP: " + Integer.toString(jatek.harcos.getEletero()));
                text1.setFont(Font.font("Arial", 18));
                text2 = new Text("HP: " + Integer.toString(jatek.varazslo.getEletero()));
                text2.setFont(Font.font("Arial", 18));
                borderPane1.setCenter(warrior);
                borderPane1.setTop(text1);
                borderPane2.setCenter(wizard);
                borderPane2.setTop(text2);
                pictureBox.getChildren().addAll(borderPane1, borderPane2, empty);
                root.setTop(title);
                root.setCenter(pictureBox);

                scene = new Scene(root, 800, 600);
                return scene;

            case "VH_":
                text1 = new Text("HP: " + Integer.toString(jatek.harcos.getEletero()));
                text1.setFont(Font.font("Arial", 18));
                text2 = new Text("HP: " + Integer.toString(jatek.varazslo.getEletero()));
                text2.setFont(Font.font("Arial", 18));
                borderPane1.setCenter(warrior);
                borderPane1.setTop(text1);
                borderPane2.setCenter(wizard);
                borderPane2.setTop(text2);
                pictureBox.getChildren().addAll(borderPane2, borderPane1, empty);
                root.setTop(title);
                root.setCenter(pictureBox);

                scene = new Scene(root, 800, 600);
                return scene;

            case "V_H":
                text1 = new Text("HP: " + Integer.toString(jatek.harcos.getEletero()));
                text1.setFont(Font.font("Arial", 18));
                text2 = new Text("HP: " + Integer.toString(jatek.varazslo.getEletero()));
                text2.setFont(Font.font("Arial", 18));
                borderPane1.setCenter(warrior);
                borderPane1.setTop(text1);
                borderPane2.setCenter(wizard);
                borderPane2.setTop(text2);
                pictureBox.getChildren().addAll(borderPane2, empty, borderPane1);
                root.setTop(title);
                root.setCenter(pictureBox);

                scene = new Scene(root, 800, 600);
                return scene;

            case "_VH":
                text1 = new Text("HP: " + Integer.toString(jatek.harcos.getEletero()));
                text1.setFont(Font.font("Arial", 18));
                text2 = new Text("HP: " + Integer.toString(jatek.varazslo.getEletero()));
                text2.setFont(Font.font("Arial", 18));
                borderPane1.setCenter(warrior);
                borderPane1.setTop(text1);
                borderPane2.setCenter(wizard);
                borderPane2.setTop(text2);
                pictureBox.getChildren().addAll(empty, borderPane2, borderPane1);
                root.setTop(title);
                root.setCenter(pictureBox);

                scene = new Scene(root, 800, 600);
                return scene;

            case "_HV":
                text1 = new Text("HP: " + Integer.toString(jatek.harcos.getEletero()));
                text1.setFont(Font.font("Arial", 18));
                text2 = new Text("HP: " + Integer.toString(jatek.varazslo.getEletero()));
                text2.setFont(Font.font("Arial", 18));
                borderPane1.setCenter(warrior);
                borderPane1.setTop(text1);
                borderPane2.setCenter(wizard);
                borderPane2.setTop(text2);
                pictureBox.getChildren().addAll(empty, borderPane1, borderPane2);
                root.setTop(title);
                root.setCenter(pictureBox);

                scene = new Scene(root, 800, 600);
                return scene;

            default:
                text1 = new Text("HP: " + Integer.toString(jatek.harcos.getEletero()));
                text1.setFont(Font.font("Arial", 18));
                text2 = new Text("HP: " + Integer.toString(jatek.varazslo.getEletero()));
                text2.setFont(Font.font("Arial", 18));
                borderPane1.setCenter(warrior_attack);
                borderPane1.setTop(text1);
                borderPane2.setCenter(wizard_attack);
                borderPane2.setTop(text2);
                pictureBox.getChildren().addAll(borderPane1, empty, borderPane2);
                root.setTop(title);
                root.setCenter(pictureBox);

                scene = new Scene(root, 800, 600);
                return scene;
        }
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        Jatek jatek = new Jatek();

        Scene scene = getScene(jatek, "");

        primaryStage.setScene(scene);
        primaryStage.setTitle("Game");
        primaryStage.show();

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(2000), event -> {
            if (!jatekVege) {
                jatek.jatekKor();
                System.out.println(jatek.toString());
                Scene newScene = getScene(jatek, jatek.getJatekter().toString());
                primaryStage.setScene(newScene);
            }

        }));

        timeline.setCycleCount(20);

        timeline.play();
    }
}
