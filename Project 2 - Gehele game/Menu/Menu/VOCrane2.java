import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOCrane2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOCrane2 extends Actor
{
    /**
     * Act - do whatever the VOCrane2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int A = 0;
        if (A == 0) {
        if (getX() < 1000) {
            setLocation(getX() +3, getY());
            if (getX() == 1000) {A = 1; }
        }
    }
        if(A == 1) {
        if (getX() > 0) {
            setLocation(getX() -3, getY());
        }
        
    } }   
    
    public void ai()
    {

    }
    
}
