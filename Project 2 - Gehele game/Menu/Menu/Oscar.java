import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Oscar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oscar extends Actor
{
    public int timer = 0;
    /**
     * Act - do whatever the Oscar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
           if(timer == 1000){
            World world;
            world = getWorld();
            world.removeObjects(world.getObjects(Oscar.class));
           }
    }    
}
