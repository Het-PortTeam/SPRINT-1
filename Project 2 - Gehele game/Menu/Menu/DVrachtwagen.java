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
    int volg = 0;
    
    
    public void act() 
    {
        Actor door = getOneIntersectingObject(DDoorgaan.class);
        if(getX() < 850) {
            setLocation(getX() + 3, getY());
        }
        doorgaan();
        vrachtSpawn();
        controle();
    }    
    
    public void doorgaan(){
        Actor door = getOneIntersectingObject(DDoorgaan.class);
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
        int mouseY = mouse.getY();
        int mouseX = mouse.getX();
        
        if(mouseX > 156 && mouseX < 445 && mouseY > 556 && mouseY < 644 && Greenfoot.mouseClicked(door) && getX() >= 845){
            click = true;
            if (DVracht1.class != null) {
            getWorld().removeObjects(getWorld().getObjects(DVracht1.class));
        }
        }
        
        if(click == true && getX() <= 4000){
            setLocation(getX() + 3, getY());
        }
        
        if(isAtEdge()) {
            World world;
            world = getWorld();
            world.removeObjects(world.getObjects(DVrachtwagen.class));
            click = false;
            return;
        }
    }
}
    
public void controle() {
    Actor con = getOneIntersectingObject(DControle.class);
    MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
        int mouseY = mouse.getY();
        int mouseX = mouse.getX();
        
        if(mouseX > 855 && mouseX < 1145 && mouseY > 556 && mouseY < 644 && Greenfoot.mouseClicked(con) && getX() >= 845){
            click = true;
             if (DVracht1.class != null) {
            getWorld().removeObjects(getWorld().getObjects(DVracht1.class));
        }
        }
        
        if(click == true && getX() <= 4000){
            setLocation(getX() + 3, getY());
        }
        
        if(isAtEdge()) {
            World world;
            world = getWorld();
            world.removeObjects(world.getObjects(DVrachtwagen.class));
            click = false;
            return;
        }
    
}}

    public void vrachtSpawn() {
        if (getX() > 848 && getX() < 852 && volg == 0) {
         
         String [] avracht = {"new DVracht1()", "new DVracht2()"};
         
         double i = Math.floor(Math.random()*2);
         
         int x = (int) i;
         
         String cvracht = avracht[x];
         
         getWorld().addObject(avracht[x], 781, 308);
         volg = volg + 1;
        }
        }
    }


