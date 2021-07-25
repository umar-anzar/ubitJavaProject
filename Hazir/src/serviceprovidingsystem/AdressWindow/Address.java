/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.AdressWindow;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javax.swing.*;
/**
 *
 * @author omer
 */
public class Address {
    
    private static WebEngine engineLink;
    private static String address;
    private static String coordinate;
    

    public static void showServiceArea() {
        final JFrame mapWindow=new JFrame("Google Map");//window bar name
        mapWindow.setIconImage(new ImageIcon("src\\serviceprovidingsystem\\images\\MapWindow\\mapIcon.png").getImage());//window Icon
        //mapWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //This will end program if only map window is close
        mapWindow.setSize(1000,800);//resolution size
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
            engine.load("https://www.google.com/maps/d/u/4/edit?mid=1ArreBDhYZ5ewKR92m8vWKfNJU_wfNqxf&usp=sharing");
            }
            });
        mapWindow.setVisible(true);
    }
    
    public static void setPinLocation() {
        final JFrame mapWindow=new JFrame("Google Map");//window bar name
        mapWindow.setIconImage(new ImageIcon("src\\serviceprovidingsystem\\images\\MapWindow\\mapIcon.png").getImage());//window Icon
        //mapWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //This will end program if only map window is close
        mapWindow.setSize(1000,800);//resolution size
        mapWindow.setLocationRelativeTo(null);//open in center
        final JFXPanel fxpanel=new JFXPanel();
        mapWindow.add(fxpanel);
        

        Platform.runLater(new Runnable() {
        @Override
        public void run()
            {
            
            WebView wv=new WebView();
            engineLink=wv.getEngine();
            fxpanel.setScene(new Scene(wv));
            engineLink.load("https://www.google.com/maps/");
            }
            });
        mapWindow.setVisible(true);
    }

    private static void sliceLink() throws StringIndexOutOfBoundsException{
        if (engineLink != null) {
            try {
                String location = engineLink.getLocation(); //get the current http link where we pinPoint on map
                //for ex "www.google.com/maps/place/South+City+Hospital/@24.8142385,67.0049286,14z/data=!4m5!3m4!1s0x3eb33d"

                int intialIndex = location.indexOf("place/") + 6;/*get location of p so we add 6 because "place/" are 6 characters 
                                                                so we get the first element of Address*/
                int finalIndex = location.indexOf("/data");

                String slicedLink = location.substring(intialIndex, finalIndex); //slices example from South to 14z in example link
                int finalAdressIndex = slicedLink.indexOf("/@"); // index of last element of address
                address = slicedLink.substring(0, finalAdressIndex); //slices from South to Hospital
                coordinate = slicedLink.substring(finalAdressIndex + 2); //slices from /@ till the end (2 is added because /@ are 2 char)

                address = address.replace("+", ", ");//removes + from ,
                address = address.replace(",,", ",");//sometimes there are two commas so we replace it from only one
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("You haven't pin your location yet");
            }
            
        }
        
    }
    
    public static String getAddress() {
        sliceLink();
        return address;
    }

    public static String getCoordinate() {
        sliceLink();
        return coordinate;
    }
    
    
    
}
