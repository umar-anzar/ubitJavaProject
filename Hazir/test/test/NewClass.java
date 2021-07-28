/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/**
 *
 * @author omer
 */
public class NewClass {
    public static void main(String[] args) {
        final JFrame mapWindow=new JFrame("webview");//window bar name
        mapWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //This will end program if only map window is close
        mapWindow.setSize(1066,600);//resolution size
        mapWindow.setLocationRelativeTo(null);//open in center
        final JFXPanel fxpanel=new JFXPanel();
        mapWindow.add(fxpanel);
        

        Platform.runLater(new Runnable() {
        @Override
        public void run()
            {
            WebEngine engine;
            WebView wv=new WebView();
            engine=wv.getEngine();
            fxpanel.setScene(new Scene(wv));
            engine.load("https://www.google.com/maps/");
            }
            });
        mapWindow.setVisible(true);
    }
}
