package javafxapplication2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

/**
 *
 * @author pablo
 */
public class JavaFXApplication2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("JavaFx 8 App - Drawing Line and Quadcurve ");
        
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.FLORALWHITE);
        
        // First Line
        Line line1 = new Line(200, 20, 300, 20);
//        line1.setStartX(200);
//        line1.setStartY(20);
//        line1.setEndX(300);
//        line1.setEndY(20);
        line1.setStroke(Color.BLACK); // set color of the line
        
        // Second Line
        Line line2 = new Line(200, 20, 180, 100);
        line2.setStroke(Color.BLACK);
        // Third Line
        Line line3 = new Line(300, 20, 320, 100);
        line3.setStroke(Color.BLACK);
        
        //QuadCurve
        QuadCurve curve = new QuadCurve(180, 100, 245, 50, 320, 100);
        curve.setStroke(Color.BLACK);
        curve.setFill(Color.FLORALWHITE);
//        curve.setStartX(180);
//        curve.setStartY(100);
//        curve.setControlX(245);
//        curve.setControlY(50);
//        curve.setEndX(320);
//        curve.setEndY(100);
        
        root.getChildren().addAll(line1, line2, line3, curve);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
