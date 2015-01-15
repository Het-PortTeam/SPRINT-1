import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DVrachtwagen here.
 * 
 * @author Oscar Veldman, Roy van den Heuvel 
 * @version (a version number or a date)
 */
public class DVrachtwagen extends Actor
{
        
    boolean click;
    int Spul;
    boolean ready = true;
    public static int x;
    int volg = 0;
    boolean isDocked;
    int goed = 0;
    
    private Counter counter;
    World myWorld = getWorld();
    Douane Douane = (Douane)myWorld;
    
    
    public void act() 
    {       
        Actor door = getOneIntersectingObject(DDoorgaan.class);
        Actor con = getOneIntersectingObject(DControle.class);
        //Rijdt de vrachtwagen naar de goede plek
        if(getX() < 850) {
            setLocation(getX() + 3, getY());
        }
        vrachtSpawn();
        //Bij controleren moet de vrachtwagen doorrijden maar er zit iets verdacht in.
        if(Greenfoot.mouseClicked(con)){
            controle();
        }
        //Als je op doorgaan klikt moet de vrachtwagen zonder problemen doorrijden
        if(Greenfoot.mouseClicked(door)){
            doorgaan();
        }
        //Rijdt naar de einde van de wereld
        moveToEdge();  
        //Kijkt om de vrachtwagens elkaar aanraken zoja. Rijdt er 1 weg en min punten
        if(click == false && getX() < 900){
            touch();
        }
        //Checkt of hij al in de scanner is.
        checkDockStatus();
        //Checkt of de vrachtwagen aan de einde van de wereld is.
        checkAtEdge();
    }    
        
    public void checkDockStatus()
    {
        if(getX() > 848 && getX() < 852)
        {
            isDocked = true;
        }
        else
        {
            isDocked = false;
        }
    }
    
    public void doorgaan(){    
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(mouse != null){
            int mouseY = mouse.getY();
            int mouseX = mouse.getX();
            
            if(mouseX > 156 && mouseX < 445 && mouseY > 556 && mouseY < 644 && getX() >= 845){
                if (DVracht.class != null) {
                    World myWorld = getWorld();
                    Douane Douane = (Douane)myWorld;
                    Counter counter = Douane.getCounter();
                    if(goed == 2 || goed == 5 || goed == 8){
                    counter.add(-10); } else {counter.add(10); }
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
                    if (DVracht.class != null) {
                    World myWorld = getWorld();
                    Douane Douane = (Douane)myWorld;
                    Counter counter = Douane.getCounter();
                    if(goed == 2 || goed == 5 || goed == 8){
                    counter.add(10); } else {counter.add(-10); }
                        getWorld().removeObjects(getWorld().getObjects(DVracht.class));
                        click = true;
                    }
                }
            }
    }
    //Hier spawnt random vracht maar wel dat de programma weet welk fout of goed vracht.
    public void vrachtSpawn() {
        if (getX() > 848 && getX() < 852 && volg == 0) {
            DVracht[] DVracht;
            DVracht = new DVracht[10];
            DVracht[0] = new DVracht(false, 10);
            DVracht[1] = new DVracht(false, 10);
            DVracht[2] = new DVracht(true, 10);
            DVracht[3] = new DVracht(false, 10);
            DVracht[4] = new DVracht(false, 10);
            DVracht[5] = new DVracht(true, 10);
            DVracht[6] = new DVracht(false, 10);
            DVracht[7] = new DVracht(false, 10);
            DVracht[8] = new DVracht(true, 10);
            DVracht[9] = new DVracht(false, 10);
           
            double i = Math.floor(Math.random()*10);         
            int x = (int) i;
            goed = x;
                 
            getWorld().addObject(DVracht[x], 781, 308);
            volg = 1;
            
        }
    }
    
    public void moveToEdge()
    {
        if(click == true && getX() > 848){
            setLocation(getX() + 3, getY());
        }
    }
    
    public void checkAtEdge()
    {
        if(isAtEdge()){
            click = false;
            volg = 0;
            World world;
            world = getWorld();
            world.removeObject(this);
        }
    }

    public void touch()
    {
        if(isDocked == true)
        {
            if(getIntersectingObjects(DVrachtwagen.class).size() != 0){
                 if (DVracht.class != null) {
                     
                     World myWorld = getWorld();
                     Douane Douane = (Douane)myWorld;
                     Counter counter = Douane.getCounter(); 
                    counter.add(-20);
                     
                     getWorld().removeObjects(getWorld().getObjects(DVracht.class));
                     click = true;
                 }    
            }
        }
    }

}


