import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class CCSchip extends Actor
{

    public void act() 
    {
        Actor plek = getOneIntersectingObject( CCplek.class );
        MouseInfo mouse = Greenfoot.getMouseInfo();
        int x = getX();
        int y = getY();

        if(Greenfoot.mouseClicked(CCplek.class)){
                int mX = mouse.getX();
                int mY = mouse.getY();
                if ( mouse != null && mX > 220 && mX < 340 && mY > 440 && mY < 725) {
                    if( x > 280)                { setLocation(getX() -1, getY() );}
                    if( x < 280)                { setLocation(getX() +1, getY() );}
                    if( x == 280)               { setRotation(270); setLocation(getX(), getY()+1 ); }
                    if( x == 280 && y == 590)   { setLocation(280, 590 ); }
                }
 
                else{if ( mouse != null && mX > 468 && mX < 588 && mY > 440 && mY < 725) {
                    if( x > 528)                { setLocation(getX() -1, getY() );}
                    if( x < 528)                { setLocation(getX() +1, getY() );}
                    if( x == 528)               { setRotation(270); setLocation(getX(), getY()+1 ); }
                    if( x == 528 && y == 590)   { setLocation(528, 590 ); }
                }
    
 
                else{if( mouse != null && mX > 716 && mX < 836 && mY > 440 && mY < 725) {
                    if( x > 776)                { setLocation(getX() -1, getY() );} 
                    if( x < 776)                { setLocation(getX() +1, getY() );}
                    if( x == 776)               { setRotation(270); setLocation(getX(), getY()+1 ); }
                    if( x == 776 && y == 590)   { setLocation(776, 590 ); }
                }
    
                else{if( mouse != null && mX > 964 && mX < 1084 && mY > 440 && mY < 725) {
                    if( x > 1024)               { setLocation(getX() -1, getY() );} 
                    if( x < 1024)               { setLocation(getX() +1, getY() );}
                    if( x == 1024)              { setRotation(270); setLocation(getX(), getY()+1 ); }
                    if( x == 1024 && y == 590)  { setLocation(1024, 590 ); }
                }
          }
         }
        }
       }
    }
}




