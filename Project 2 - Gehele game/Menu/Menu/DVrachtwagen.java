import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DVrachtwagen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DVrachtwagen extends Actor
{
    
    boolean click;
    public void act() 
    {
        if(getX() < 850) {
            setLocation(getX() + 3, getY());
        }
        
        if(Greenfoot.mouseClicked(DDoorgaan.class)){
            click = true;
        }
        
        if(click == true){
            setLocation(getX() + 3, getY());
        }
    }    
    
    public void driveAway(){
        if(getX() < 1000) {
            setLocation(getX() + 3, getY());
        }
    }
}