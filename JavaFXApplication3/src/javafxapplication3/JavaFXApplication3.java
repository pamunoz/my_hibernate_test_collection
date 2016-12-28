package javafxapplication3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author pablo
 */
public class JavaFXApplication3 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // HBox
        
                
        
        HBox hBox = configureHBox();
        VBox vBox = configureVBox();
        
        Scene scene = new Scene(vBox, 400, 400, Color.SILVER);
        
        
        primaryStage.setTitle("JavaFx 8 - HBox and VBox Layout");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    private HBox configureHBox() {
        HBox hBox = new HBox(10);// Space between child nodes
        hBox.setPadding(new Insets(5)); // Padding between hbox border and row
        
        Rectangle r1 = new Rectangle(30, 30); // Small rectangle
        Rectangle r2 = new Rectangle(70, 70); // Big rectangle
        Rectangle r3 = new Rectangle(20, 80); // Vertical rectangle
        Rectangle r4 = new Rectangle(80, 20); // Horizontal rectangle

        HBox.setMargin(r1, new Insets(2, 2, 2, 2));
       
        hBox.getChildren().addAll(r1, r2, r3, r4);
        return hBox;        
    }
    
        private VBox configureVBox() {
        VBox vBox = new VBox(10);// Space between child nodes
        vBox.setPadding(new Insets(5)); // Padding between hbox border and row
        
        Rectangle r1 = new Rectangle(30, 30); // Small rectangle
        Rectangle r2 = new Rectangle(70, 70); // Big rectangle
        Rectangle r3 = new Rectangle(20, 80); // Vertical rectangle
        Rectangle r4 = new Rectangle(80, 20); // Horizontal rectangle

        VBox.setMargin(r1, new Insets(2, 2, 2, 2));
       
        vBox.getChildren().addAll(r1, r2, r3, r4);
        return vBox;        
    }
   
    
}
