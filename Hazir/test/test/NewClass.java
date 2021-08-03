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
        A c = new A();
        System.out.println(c.a);
        A d = c;
        c = null;
        System.out.println(d.a);
        try {
            System.out.println(c.a);
        } catch (Exception e) {
            c = d;
            System.out.println(c.a);
        }
        
    
    
    }
}
class A{
    public int a=5;
}