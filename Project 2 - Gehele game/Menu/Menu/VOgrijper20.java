import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOgrijper20 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOgrijper20 extends VOCrane2
{
    /**
     * Act - do whatever the VOgrijper20 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {   int A = 0;
        if (A == 0){
        if (getX() < 1000) {
            setLocation(getX() +3, getY());
        }
        if (A == 0) {
        if  (getY() > 80) {
            setLocation(getX(), getY()-3);
        }
        }
    } else {A++;}
        
    }    
}
