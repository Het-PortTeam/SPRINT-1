import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloons extends Actor
{
    int currentWorld;  
    
    /*
     * 1 = Menu
     * 2 = ControleCentrum
     * 3 = VrachtOverslaan
     * 4 = Douane
     */
        
    public Balloons(int currentWorld)
    {       
        if(currentWorld == 1){
            //System.out.println("TEST menu");
            setImage(new GreenfootImage("Textballon_M.png"));
        }
        
        if(currentWorld == 2){
            setImage(new GreenfootImage("Textballon_CC1.png"));
            //System.out.println("TEST cc");
        }
        
        if(currentWorld == 3){          
            setImage(new GreenfootImage("Textballon_VO1.png"));
            //System.out.println("TEST vo");
        }
        
        if(currentWorld == 4){            
            setImage(new GreenfootImage("Textballon_D1.png"));
            //System.out.println("TEST d");
        }
    }
}

