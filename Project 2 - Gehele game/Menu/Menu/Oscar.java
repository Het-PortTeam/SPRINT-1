import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Oscar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Oscar extends Actor
{
    int currentWorld;  
    long currentTime = System.currentTimeMillis();
    /**
     * Act - do whatever the Oscar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
           if(currentTime + 12000 < System.currentTimeMillis()){
               World world;
               world = getWorld();
               world.removeObjects(world.getObjects(Oscar.class));
               world.removeObjects(world.getObjects(Balloons.class));
           }
    }    
}
