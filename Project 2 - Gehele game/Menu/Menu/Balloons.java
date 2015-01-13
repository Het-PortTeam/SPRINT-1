import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloons extends Actor
{
    /**
     * Act - do whatever the Balloons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void Balooons(){
        World myWorld = getWorld();
        VrachtOverslaan VrachtOverslaan = (VrachtOverslaan)myWorld;
        if(myWorld == VrachtOverslaan){
            System.out.println("TEST");
        }
    }
    
    
    public void act() 
    {
        // Add your action code here.
    }    
}
