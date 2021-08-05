/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceprovidingsystem.MapAndAnimation;

import java.awt.*;

/**
 *
 * @author omer
 */
    /*A thread, in the context of Java, is the path followed when executing 
        a program. All Java programs have at least one thread, known as the main 
        thread, which is created by the Java Virtual Machine (JVM) at the program's 
        start, when the main() method is invoked with the main thread.*/
        
        /*Every java application has at least one thread – main thread. But from 
        application point of view – main is the first java thread and we can create 
        multiple threads from it. ... Multithreading refers to two or more threads 
        executing concurrently in a single program.*/
        
        
        /*first we have to pass object in a reference variable so that we can
        access it in Thread.
        then an override run function is created to run the bigger loops in gui*/


        /*
            Simple for loop is used to set size and opacity from 0 to the original
            and vice versa
        */
public class Animations {
    
    
    
    
    public static void windowAppearAnimation(javax.swing.JFrame window, float opty){
        Thread th = new Thread(){
            @Override
            public void run(){
                float op = 0;
                try{
                  for(int i=0; i<10; i++){
                      Thread.sleep(20);
                      window.setOpacity(op);
                      op = op + 0.1f;
                  }
                } catch(Exception e){     
                }
                window.setOpacity(opty);
            }
        };th.start();
    }

    public static void windowCloseAnimation(javax.swing.JFrame window, float opty){
        Thread th = new Thread(){
            @Override
            public void run(){
                float op = opty;
                try{
                  for(int i=0; i<10; i++){
                      Thread.sleep(20);
                      window.setOpacity(op);
                      op = op - 0.1f;
                  }
                } catch(Exception e){  
                }
                window.setOpacity(0f);
                window.dispose();
            }
        };th.start();
    }
    
    public static void windowExitAnimation(javax.swing.JFrame window, float opty){
        Thread th = new Thread(){
            @Override
            public void run(){
                float op = opty;
                try{
                  for(int i=0; i<10; i++){
                      Thread.sleep(20);
                      window.setOpacity(op);
                      op = op - 0.1f;
                  }
                } catch(Exception e){  
                }
                window.setOpacity(0f);
                System.exit(0);
            }
        };th.start();
    }
    
    public static void panelAppearAnimation(javax.swing.JPanel panel, int width, int height) {
        panel.setSize(new Dimension(0,0));
            Thread th = new Thread(){
                @Override
                public void run(){
                    int w=0;
                    for (int i = 0; i < 40; i++) {
                        try {
                            Thread.sleep(1);
                            w += 10;
                            panel.setSize(new Dimension(w,height));
                        } catch (Exception e) {
                        }
                    }
                    
                    panel.setSize(new Dimension(width,height));
                }
            };th.start();
            panel.setVisible(true);
    }
    
    public static void panelCloseAnimation(javax.swing.JPanel panel, int width, int height) {
        int tempWidth=panel.getWidth(),tempHeight=panel.getHeight();
        Thread th = new Thread(){
            @Override
            public void run(){
                panel.setVisible(true);
                int w = tempWidth;
                for (int i = 0; i < 40; i++) {
                    try {
                        Thread.sleep(1);
                        w -= 10;
                        panel.setSize(new Dimension(w,height));
                    } catch (Exception e) {
                    }
                }
                panel.setSize(new Dimension(0,0));
            }
        };th.start();
        panel.setVisible(false);
        panel.setSize(new Dimension(width, height));
    }
}
