import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;

/**
 * Write a description of class input here.
 * 
 * @author Kevin Verweij 
 * @version 1.0
 */

/**
     * Act - do whatever the input wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */
  
  public class Input{
      private String input;
       
      public Input(String _input){
          this.input = JOptionPane.showInputDialog(_input);
        }
        
        public String getStringInput(){
            return this.input;
        }
        
        public int getIntInput(){
            return Integer.parseInt(this.input);
        }
        
    }
        