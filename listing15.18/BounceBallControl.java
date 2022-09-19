import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;

public class BounceBallControl extends application {
    @Overide 
    public void start(Stage PrimaryStage) {
        BallPane ballPane = new BallPane();
        ballPane.setOnMousePressed(e -> ballpane.pause());
        ballPane.setOnMouseReleased(e -> ballpane.play());
        
        ballPane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP) {
                ballPane.increaseSpeed();
            }
            else if (e.getCode() == KeyCode.DOWN) {
                ballPane.decreaseSpeed();
            }
        });

        Scene scene = new Scene(ballPane, 250, 150);
        PrimaryStage.setTitle("BounceBallControl");
        PrimaryStage.setScene(scene);
        PrimaryStage.show();

        ballPane.requestFocus();
    }
}

