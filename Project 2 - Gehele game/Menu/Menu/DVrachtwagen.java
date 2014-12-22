import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DVrachtwagen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DVrachtwagen extends Actor
{
    
    boolean click = false;
    boolean ready = true;
    public static int x;
    public void act() 
    {
        if(getX() < 850 && ready == true) {
            setLocation(getX() + 3, getY());
            if(getX() >= 845) {
                ready = false;
            }
        }
        
        if(Greenfoot.mouseClicked(DDoorgaan.class)){
            click = true;
        }
        
        if(click == true){
            setLocation(getX() + 3, getY());
        }
    }    
    
    public static int driveAway(){
            return x;
        }
    }
