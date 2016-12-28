package javafxapplication2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
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
        root.getChildren().add(line1);
        
        // Second Line
        Line line2 = new Line(200, 20, 180, 100);
        line2.setStroke(Color.BLACK);
        root.getChildren().add(line2);
        // Third Line
        Line line3 = new Line(300, 20, 320, 100);
        line3.setStroke(Color.BLACK);
        root.getChildren().add(line3);
        
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
        root.getChildren().add(curve);

        // Ellipse Face
        Ellipse face = new Ellipse(250, 115, 55, 45);
        face.setStroke(Color.BLACK);
        face.setFill(Color.YELLOW);
//        face.setCenterX(250);
//        face.setCenterY(115);
//        face.setRadiusX(55);
//        face.setRadiusY(45);
        root.getChildren().add(face);
        
        // Ellipses Eyes
        Ellipse eye1 = new Ellipse(230, 105, 8, 4);
        eye1.setStroke(Color.BLACK);
        eye1.setFill(Color.FLORALWHITE);
        root.getChildren().add(eye1);
        Ellipse eye2 = new Ellipse(270, 105, 8, 4);
        eye2.setStroke(Color.BLACK);
        eye2.setFill(Color.FLORALWHITE);
        root.getChildren().add(eye2);
        
        // Quadcurve Smile
        QuadCurve smile = new QuadCurve(230, 140, 250, 150, 270, 140);
        smile.setStroke(Color.BLACK);
        smile.setFill(Color.FLORALWHITE);
        root.getChildren().add(smile);
        
        // Rectangle Hands
        Rectangle hand1 = new Rectangle(20, 150);
        hand1.setStroke(Color.BLACK);
        hand1.setFill(Color.FLORALWHITE);
//        hand1.setWidth(20);
//        hand1.setHeight(150);
        hand1.setX(100);
        hand1.setY(220);
        hand1.setRotate(40);
        hand1.setArcHeight(30);
        hand1.setArcWidth(20);
        root.getChildren().add(hand1);
        
        Rectangle hand2= new Rectangle(20, 150);
        hand2.setStroke(Color.BLACK);
        hand2.setFill(Color.FLORALWHITE);
//        hand1.setWidth(20);
//        hand1.setHeight(150);
        hand2.setX(380);
        hand2.setY(220);
        hand2.setRotate(320);
        hand2.setArcHeight(30);
        hand2.setArcWidth(20);
        root.getChildren().add(hand2);
        
        // Rectangles Legs
        Rectangle leg1 = new Rectangle(20, 150);
        leg1.setStroke(Color.BLACK);
        leg1.setFill(Color.FLORALWHITE);
        leg1.setX(200);
        leg1.setY(380);
        leg1.setArcHeight(30);
        leg1.setArcWidth(20);
        root.getChildren().add(leg1);
        
        Rectangle leg2 = new Rectangle(20, 150);
        leg2.setStroke(Color.BLACK);
        leg2.setFill(Color.FLORALWHITE);
        leg2.setX(280);
        leg2.setY(380);
        leg2.setArcHeight(30);
        leg2.setArcWidth(20);
        root.getChildren().add(leg2);
        
       
        
        // Ellipse Body
        Ellipse body = new Ellipse(250, 282, 120, 120);
        body.setStroke(Color.BLACK);
               
        // Linear Gradien Property
        LinearGradient color = new LinearGradient(
        250, 282, 120, 120, false, CycleMethod.REFLECT, 
        new Stop(0, Color.rgb(120, 55, 80, 0.97)),
        new Stop(1, Color.rgb(90, 150, 60, 0.97)));
        body.setFill(color);
        root.getChildren().add(body);
        
         // Rectangle Tie
        Rectangle tie = new Rectangle(20, 235);
        tie.setStroke(Color.BLACK);
        tie.setFill(Color.RED);
        tie.setX(240);
        tie.setY(163);
        tie.setArcHeight(30);
        tie.setArcWidth(20);
        root.getChildren().add(tie);
        
        
        
        
        //root.getChildren().addAll(line1, line2, line3, curve, face);
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
