import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOConEB1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOConEB1 extends VOConEB
{
    World myWorld = getWorld();
    VrachtOverslaan vrachtOverslaan = (VrachtOverslaan)myWorld;
    private int xSpeed = 2;
    private int vSpeed = 2;
    
    /**
     * Act - do whatever the VOConEB1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected void addedToWorld(World w)
    {
        
        myWorld = w;
        vrachtOverslaan = (VrachtOverslaan)w;
        super.addedToWorld(w);
    }
    
    public void act() 
    {
            if(!getObjectsInRange(25, VOgrijper20.class).isEmpty() && !vrachtOverslaan.Grijper.grab){
            vrachtOverslaan.Grijper.grab = true; 
        }
        
        
        if(vrachtOverslaan.Grijper.grab == true && !getObjectsInRange(25, VOgrijper20.class).isEmpty() && vrachtOverslaan.Grijper.grab) {
            int xSpeed = ( (VOgrijper20)getWorld().getObjects(VOgrijper20.class).get(0)).getxSpeed();
            int vSpeed = ((VOgrijper20)getWorld().getObjects(VOgrijper20.class).get(0)).getvSpeed();
            setLocation(getX() +xSpeed, getY() +vSpeed);
            

        }
        
        
        
        if(getY() < 50 && vrachtOverslaan.Grijper.grab){
            vrachtOverslaan.Grijper.grab = false;
            myWorld.removeObject(this);
        }
        }
    }    

