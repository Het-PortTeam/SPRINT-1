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
public boolean otherClicked;
    
public void act() 
{
    Actor door = getOneIntersectingObject(DDoorgaan.class);
    Actor con = getOneIntersectingObject(DControle.class);
    if(getX() < 850) {
        setLocation(getX() + 3, getY());
    }
    vrachtSpawn();
    if(Greenfoot.mouseClicked(con)){
        controle();
    }
    if(Greenfoot.mouseClicked(door)){
        doorgaan();
    }
    moveToEdge();
    checkAtEdge();
}    
    
public void doorgaan(){    
    MouseInfo mouse = Greenfoot.getMouseInfo();
    if(mouse != null){
        int mouseY = mouse.getY();
        int mouseX = mouse.getX();
        
        if(mouseX > 156 && mouseX < 445 && mouseY > 556 && mouseY < 644 && getX() >= 845){
            if (DVracht1.class != null) {
                getWorld().removeObjects(getWorld().getObjects(DVracht.class));
                click = true;
            }
        }
    }
}

    
public void controle() {
    
    MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
            int mouseY = mouse.getY();
            int mouseX = mouse.getX();
        
            if(mouseX > 855 && mouseX < 1145 && mouseY > 556 && mouseY < 644 && getX() >= 845){            
                if (DVracht1.class != null) {
                    getWorld().removeObjects(getWorld().getObjects(DVracht.class));
                    click = true;
                }
            }
        }
}

public void vrachtSpawn() {
    if (getX() > 848 && getX() < 852 && volg == 0) {
        DVracht[] DVracht;
        DVracht = new DVracht[10];
        DVracht[0] = new DVracht1();
        DVracht[1] = new DVracht2();
         
        double i = Math.floor(Math.random()*2);         
        int x = (int) i;
             
        getWorld().addObject(DVracht[x], 781, 308);
        volg = 1;
    }
}

public void moveToEdge()
{
    if(click == true && !isAtEdge()){
        setLocation(getX() + 3, getY());
    }
}

public void checkAtEdge()
{
    if(click == true && isAtEdge()){
        click = false;
        volg = 0;
        World world;
        world = getWorld();
        world.removeObject(this);
    }
}
}


