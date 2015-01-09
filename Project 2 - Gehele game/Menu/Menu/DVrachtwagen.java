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
    int Spul;
    boolean ready = true;
    public static int x;
    
    
    public void act() 
    {
        Actor door = getOneIntersectingObject(DDoorgaan.class);
        if(getX() < 850) {
            setLocation(getX() + 3, getY());
        }
        
        if(getX() > 850 && Greenfoot.mouseClicked(this)) {
            Spul = Greenfoot.getRandomNumber(90);
            System.out.println(Spul);
        }
        
        doorgaan();
    }    
    
    public void doorgaan(){
        Actor door = getOneIntersectingObject(DDoorgaan.class);
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
        int mouseY = mouse.getY();
        int mouseX = mouse.getX();
        
        if(mouseX > 156 && mouseX < 445 && mouseY > 556 && mouseY < 644 && Greenfoot.mouseClicked(door) && getX() >= 845){
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
    
    }


