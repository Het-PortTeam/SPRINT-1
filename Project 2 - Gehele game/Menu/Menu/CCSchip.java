import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CCSchip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class CCSchip extends Actor
{
    /**
     * Act - do whatever the CCSchip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    MouseInfo pointer = Greenfoot.getMouseInfo();
if(pointer != null)
{
    int mouseX = pointer.getX();
    int mouseY = pointer.getY();
    //turnTowards(mouseX, mouseY);
    int button = pointer.getButton();
    if(button == 1)
    {
        setLocation(mouseX, mouseY);
   
    }
}

Actor plek = getOneIntersectingObject( CCplek.class );
 if ( plek != null )
 {
     
     setRotation(270);
    
 }

        
if ( getY() >= 0 && getY() <= 299) { setRotation(0); } 

if ( getY() == 300) { setRotation(270); }       

       }    
}
