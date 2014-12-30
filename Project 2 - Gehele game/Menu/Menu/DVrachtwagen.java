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
    boolean ready = true;
    public static int x;
    public void act() 
    {
        Actor door = getOneIntersectingObject(DDoorgaan.class);
        if(getX() < 850) {
            setLocation(getX() + 3, getY());
            if(getX() >= 845) {
            }
        }
        
        if(Greenfoot.mouseClicked(door) && getX() >= 845){
            click = true;
        }
        
        if(click == true && getX() <= 4000){
            setLocation(getX() + 3, getY());
        }
        
        if(getX() > 1200) {
            World world;
            world = getWorld();
            world.removeObjects(world.getObjects(DVrachtwagen.class));
        }
    }    
    

   
    }
