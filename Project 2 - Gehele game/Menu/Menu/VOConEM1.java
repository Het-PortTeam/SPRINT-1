import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOConEM1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOConEM1 extends VOConEM
{
    World myWorld = getWorld();
    VrachtOverslaan vrachtOverslaan = (VrachtOverslaan)myWorld;
    private int xSpeed = 2;
    private int vSpeed = 2;
    private int ad = 0;
    
    /**
     * Act - do whatever the VOConEM1 wants to do. This method is called whenever
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
            ad = 2;
        }
        
        
        if(ad == 2 && vrachtOverslaan.Grijper.grab == true && !getObjectsInRange(25, VOgrijper20.class).isEmpty() && vrachtOverslaan.Grijper.grab) {
            int xSpeed = ( (VOgrijper20)getWorld().getObjects(VOgrijper20.class).get(0)).getxSpeed();
            int vSpeed = ((VOgrijper20)getWorld().getObjects(VOgrijper20.class).get(0)).getvSpeed();
            setLocation(getX() +xSpeed, getY() +vSpeed);
            
         /**   if(getX() == 298){
                xSpeed = -xSpeed;
            }
            
            if (getY() >= 303){
                vSpeed = -vSpeed;
            }**/
        }
        
        
        
        if(getY() < 5 && vrachtOverslaan.Grijper.grab){
            vrachtOverslaan.Grijper.grab = false;
            myWorld.removeObject(this);
            ad = 0;
        }
        }
    }    

