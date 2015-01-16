import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Balloons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Balloons extends Actor
{
    int currentWorld;  
    long currentTime = System.currentTimeMillis();
    
    /*
     * 1 = Menu
     * 2 = ControleCentrum
     * 3 = VrachtOverslaan
     * 4 = Douane
     */
        
    public Balloons(int currentWorld)
    {       
        if(currentWorld == 1){
            setImage(new GreenfootImage("Textballon_M.png"));
            setCurrentWorld(1);           
        }
        
        if(currentWorld == 2){
            setImage(new GreenfootImage("Textballon_CC.png"));
            setCurrentWorld(2);
        }
        
        if(currentWorld == 3){          
            setImage(new GreenfootImage("Textballon_VO1.png"));
            setCurrentWorld(3);
        }
        
        if(currentWorld == 4){            
            setImage(new GreenfootImage("Textballon_D1.png"));
            setCurrentWorld(4);
        }
    }
    
    public void act()
    {
        if(currentTime + 4000 <  System.currentTimeMillis())
        {
            if(currentWorld == 3){
                setImage(new GreenfootImage("Textballon_VO2.png"));
            }
            
            if(currentWorld == 4){
                setImage(new GreenfootImage("Textballon_D2.png"));
            }
        }
        if(currentTime + 8000 < System.currentTimeMillis())
        {
            if(currentWorld == 3){
                setImage(new GreenfootImage("Textballon_VO3.png"));
            }
            
            if(currentWorld == 4){
                setImage(new GreenfootImage("Textballon_D3.png"));
            }
        }
        if(currentTime + 12000 < System.currentTimeMillis())
        {
            if(currentWorld == 3){
                setImage(new GreenfootImage("Textballon_VO4.png"));
            }
        }
    }    
    
    public void setCurrentWorld(int changeWorldId)
    {
        currentWorld = changeWorldId;
    }
}