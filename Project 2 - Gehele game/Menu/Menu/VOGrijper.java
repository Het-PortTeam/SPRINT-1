import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VOGrijper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VOGrijper extends Actor
{
    /**
     * Act - do whatever the VOGrijper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private VOConB container;
    
    public void act() 
    {
        int Xspeed = 3;   
       if(Greenfoot.isKeyDown("a")){
            setLocation(getX() -Xspeed, getY());
    } 
     if(Greenfoot.isKeyDown("d")){
            setLocation(getX() +Xspeed, getY());
    }
    if(Greenfoot.isKeyDown("w")){
        if(getY() <= 245){} else {
        setLocation(getX(), getY() -Xspeed);
    }
    }
    if(Greenfoot.isKeyDown("s")){
        if(getY() >= 575){}  else {
        setLocation(getX(), getY() +Xspeed);
    }
    }
    if(Greenfoot.isKeyDown("left")){
        setLocation(getX() -Xspeed, getY());
    }
    if(Greenfoot.isKeyDown("right")){
        setLocation(getX() +Xspeed, getY());
    }
    if(Greenfoot.isKeyDown("up")){
        if(getY() <= 245){} else {
        setLocation(getX(), getY() -Xspeed);
    }
    }
    if(Greenfoot.isKeyDown("down")){
        if(getY() >= 575){}  else {
        setLocation(getX(), getY() +Xspeed);
    }
    } 
    
            //some other stuff for moving etc.
        if (container == null && Greenfoot.isKeyDown("q") && !getObjectsInRange(25, VOConB.class).isEmpty()) {
            //"p" for pick up; you can use any other key if you want;
            //25 is the radius in which a container needs to be to pick it up; You can also use any other value;
            container = (VOConB) getObjectsInRange(25, VOConB.class).get(0);
        }
        if (container != null && Greenfoot.isKeyDown("e")) {//"d" for drop;
            //drop the container;
            //you should add a method in the container that does something when it's droped;
            container = null;
        }

}

    public void setLocation(int x, int y) {
        //by overriding this method you move the container when you have picked up one;
        super.setLocation(x, y);
        if (container != null) {
            container.setLocation(x, y);
            //the +5 makes the container stay five fields underneath the crane; You can again use any value you want here;
        }
    }
}
