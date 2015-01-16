import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Douane here.
 * 
 * @author Oscar Veldman, Roy van den HeuveL
 * @version (a version number or a date)w
 */
public class Douane extends World
{

    public long currentTime = System.currentTimeMillis();  
    private int timer = 0;
    private int moeilijk = 0;
    Counter Counter = new Counter();
    private int wagenNummer = 0;
    //Alle voorwerpen die weergeven op de wereld
    public Douane()
    {    
        super(1280, 720, 1); 
        addObject(new BackButton(), 75, 50);
        addObject(new DDoorgaan(), 300, 600);
        addObject(new DControle(), 1000, 600);
        addObject(new DScanner(), 850, 310);
        addObject(new DVrachtwagen(), 200, 350);
        addObject(new Oscar(), 727, 613);
        addObject(new Balloons(4), 593, 462);
        Counter = new Counter("Punten: ");
        addObject(Counter, 850, 155);
    }
    
    public void act()
    {
        int CounterValue = Counter.getValue();
        //Tijd
        if( currentTime + 1000 <  System.currentTimeMillis() )
        {
            timer += 1;
        }
        //De wagen die steeds spawnen tot 20
        if(wagenNummer < 20){
        if( timer == 400)
        {
            addObject(new DVrachtwagen(), 200, 350);
            removeObjects(getObjects(Oscar.class));
            removeObjects(getObjects(Balloons.class));
            //Gaat steeds sneller
            if(moeilijk < 150){
            moeilijk += 15;
        } else {moeilijk = 150;}
            timer = 0 + moeilijk;
            wagenNummer += 1;
        }
    }
    }
    //Puntne telling
    public Counter getCounter()
    {
        return Counter;
    }
    
}



