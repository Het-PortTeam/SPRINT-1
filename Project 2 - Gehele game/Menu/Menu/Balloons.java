import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloons extends Actor
{
        // wereld inlaaden
        World myWorld = getWorld();
        VrachtOverslaan VrachtOverslaan = (VrachtOverslaan)myWorld;
        menu menu = (menu)myWorld;
        Douane Douane = (Douane)myWorld;
        ControleCentrum ControleCentrum = (ControleCentrum)myWorld;
        
        
    /**
     * Act - do whatever the Balloons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    static void setImagesM(){
       GreenfootImage drawedImage = new GreenfootImage("Textballon_M.png");
    }
    
    
   
    
    public void act() 
    {
        if(myWorld == VrachtOverslaan){
            //System.out.println("TEST");
        }else{
           return;
        }
        
        if(myWorld == menu){
            setImagesM();
        }else{
           return;
        }
        
        if(myWorld == Douane){
            // System.out.println("TEST");
        }else{
           return;
        }
        
        if(myWorld == ControleCentrum){
            // System.out.println("TEST");
        }else{
           return;
        }
    }    
}
