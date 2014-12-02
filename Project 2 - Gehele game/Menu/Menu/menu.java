import greenfoot.*; 

public class menu extends World
{
    public menu()
    {    
        super(1280, 720, 1); 
        addObject(new VOMenu(), 340, 360);
        addObject(new CCMenu(), 740, 520);
    }
}
