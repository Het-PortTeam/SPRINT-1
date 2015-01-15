import greenfoot.*; 

public class menu extends World
{ 
    public long currentTime = System.currentTimeMillis();
    public int timer = 0;
    public menu()
    {    
        super(1280, 720, 1); 
        /*
        Input namePrompt = new Input("Wat is uw naam?");
        String name = namePrompt.getStringInput();

        Input ageInput = new Input("Wat is uw leeftijd?");
        int age= ageInput.getIntInput();
         */
        addObject(new VOMenu(), 300, 320);
        addObject(new CCMenu(), 740, 270);
        addObject(new DMenu(), 500, 190);
        addObject(new HMenu(), 890, 500);
        addObject(new Oscar(), 1090, 469);
        addObject(new Balloons(1), 954, 319);

        prepare();
    }

    public void act(){
        if( timer == 500){
            removeObjects(getObjects(Oscar.class));
            removeObjects(getObjects(Balloons.class));
        }
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
    }
}
