import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class CCSchip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class CCSchip extends Actor
{
    World W = getWorld();
    private boolean ShipInHarbor;
    private boolean clicked1;
    private boolean clicked2;
    private boolean clicked3;
    private boolean clicked4;
    private boolean shipclick;
    private boolean back;
    private boolean taken;
    private Counter counter;
    private Lives liveCounter;
    private int Speed = 2;

    public CCSchip(Counter pointCounter, Lives hpCounter)
    {
        //Creates the counters.
        counter = pointCounter;
        liveCounter = hpCounter;
    }
    
   
    /**
     * Act - do whatever the CCSchip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
 
    public void act()
    {   
        //Calls the methods.
        move();     
        loseHP();
        checkIsAtEnd();
    } 
    

    public void checkIsAtEnd()
    {
        //Checks if the ship is at the end of the world.
        if(isAtEdge())  
        {  
            getWorld().removeObject(this);  
            counter.add(5);
        }    
    }
   
    public void loseHP()
    {
        //If ships hit eachother, a live is removed.
        Actor touching = getOneIntersectingObject(CCSchip.class);
    
        if(touching != null && getX() != 1200 && getY() != 200){liveCounter.add(-1); this.removeTouching(CCSchip.class);}
        else{liveCounter.add(0);}
    }
    
    public void move()
    {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
        int mouseY = mouse.getY();
        int mouseX = mouse.getX(); 
        
        int x = getX();
        int y = getY();

        
        Actor harbor = getOneIntersectingObject( CCplek.class );
        Actor end = getOneIntersectingObject( CCEind.class );
        
        

        
            if(Greenfoot.mouseClicked(this)){shipclick = true;}
        
            if(shipclick == true){

                if(!ShipInHarbor){
                    if(mouseX > 221 && mouseX < 341 && mouseY > 440 && mouseY < 725 && Greenfoot.mouseClicked(harbor) ){clicked1 = true;}
                    if(clicked1 == true){
                        if( x > 281) { setLocation(getX() -2, getY() );} 
                        if( x == 280 && y >= 200) { setRotation(270); setLocation(x, y+Speed ); }}}
    

                        if(x == 280 && y == 590){ShipInHarbor = true;}
 

                        if(!ShipInHarbor){
                            if(mouseX > 468 && mouseX < 588 && mouseY > 440 && mouseY < 725 && Greenfoot.mouseClicked(harbor) ){clicked2 = true;}
                            if(clicked2 == true){
                                if( x > 528) { setLocation(getX() -Speed, getY() );} 
                                if( x == 528 && y >= 200) { setRotation(270); setLocation(x, y+Speed ); }}}
    

                                if(x == 528 && y == 590){ShipInHarbor = true;}
            
    
                                if(!ShipInHarbor){   
                                    if(mouseX > 716 && mouseX < 836 && mouseY > 440 && mouseY < 725 && Greenfoot.mouseClicked(harbor) ){clicked3 = true;}
                                    if(clicked3 == true){
                                        if( x > 776) { setLocation(getX() -Speed, getY() );} 
                                        if( x == 776 && y >= 200) { setRotation(270); setLocation(x, y+Speed ); }}}
   
 
                                        if(x == 776 && y == 590){ShipInHarbor = true;}

            
                                        if(!ShipInHarbor){
                                            if(mouseX > 964 && mouseX < 1084 && mouseY > 440 && mouseY < 725 && Greenfoot.mouseClicked(harbor) ){clicked4 = true;}
                                            if(clicked4 == true){
                                                if( x > 1024) { setLocation(getX() -Speed, getY() );} 
                                                if( x == 1024 && y >= 200) { setRotation(270); setLocation(x, y+Speed ); }}}
   
    
    
    
                                                if(x == 1024 && y == 590){ShipInHarbor = true;}
                                                if(x == 776 && y == 590) { ShipInHarbor = true;}
                                                if(x == 528 && y == 590) { ShipInHarbor = true;}
                                                if(x == 280 && y == 590) { ShipInHarbor = true;}

                                                if(ShipInHarbor == true) {setLocation(x, y );} 
    

                                                if(ShipInHarbor == true){
                                                    if(mouseX > 76 && mouseX < 196 && mouseY > 162 && mouseY < 262 && Greenfoot.mouseClicked(end) ){back = true;}
                                                    if(back == true){ setLocation(getX(), getY()-2 );}
                                                    if((x <= 1024 && y == 200) || (x <= 776 && y == 200) || (x <= 528 && y == 200) || (x <= 280 && y == 200)){setRotation(0); setLocation(getX() -Speed, y );}}

             }
        }
    }
    }