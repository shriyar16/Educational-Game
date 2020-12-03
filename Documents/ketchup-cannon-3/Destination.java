import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;


/**
 * Destination is a World class that represents a location 
 * around the world, with several different options.
 */
public class Destination extends World
{    
    private Map map;
    private GreenfootImage image;
    public String currentLocation; //intialize string variable that stores the current location
    public static ArrayList<String> locations = new ArrayList<String>(Arrays.asList("Beijing, China", "London, UK", "New York, USA", "San Francisco, USA", 
    "Paris, France", "Tokyo, Japan", "Moscow, Russia","Amsterdam, Netherlands", "Toronto, Canada", "Melbourne, Australia")); //list containing all the countries
    /**);
     * Constructor for objects of class MyWorld.
     * 
     */
    
   
    public Destination()
    {    
        super(600, 400, 1);
       
        
        //At the very beginning, print the story
        if (locations.size() == 10) {
            System.out.println("Last summer, your eccentric, bibliophile great grandfather died a suspicious death.");
            System.out.println("Now, your entire family has congregated at your great grandfather's old estate ");
            System.out.println("to attend the reading of his will, hoping to claim a silver of his vast inheritance.");
            System.out.println("To your shock, the great grandfather you barely know leaves everything to you -- ");
            System.out.println("including his large estate, successful business, and a mysterious machine hidden away ");
            System.out.println("in the basement of his mansion. For the full spooky story, please visit our documentation! ");
        }
        
        
        int location_number = 0; //Greenfoot.getRandomNumber(locations.size()+1);
        //Generates a random location out of the current locations unvisited
        if (locations.size() == 0) {
            //GreenfootImage ending = new GreenfootImage (200, 30);
            //ending.drawString ("You've completed your Grandfather's mission!",2, 20);
            //setImage(ending);
            Greenfoot.stop();
        }
        
        if (locations.size() == 1) { //once the list of locations reaches only 1 item, stop all code and end the game
            Greenfoot.stop();
        }
        currentLocation = locations.get(location_number);
        //String stores current location
        
        locations.remove(location_number);
        //Removes location from ArrayList so there are no repeats
        
        Map map = new Map(currentLocation); //create a new map with the correct location
        image = map.getImage();
        setBackground(image);
        Machine timeMachine = new Machine();
        addObject(timeMachine,50,320); //add the time machine image to bottom left of the screen
        
        
        //All of the locations have similar code
        if (currentLocation == "London, UK") //checks if the location is London
        {
            Question1 question1 = new Question1(); //create new question object to display on screen
            addObject(question1, 400, 60); //adds the text to the screen
            Pin pin = new Pin(540,223,false); //creates a Pin object that is incorrect
            addObject(pin,540,223); //adds the pin object to the world
            Pin pin2 = new Pin(366,325,false);
            addObject(pin2,366,325);
            Pin pin3 = new Pin(277,143,true); //only one Pin object is valid (contains the correct answer to the question)
            addObject(pin3,277,143); //this pin object is also added to the world
            Pin pin4 = new Pin(121,120,false);
            addObject(pin4,121,120);
            Pin pin5 = new Pin(521,71,false);
            addObject(pin5,521,71);
            Pin pin6 = new Pin(107,279,false);
            addObject(pin6,107,279);
        }
        if (currentLocation == "Tokyo, Japan") //checks if the location is Tokyo
        {
            Question2 question2 = new Question2();
            addObject(question2, 400, 60);
            Pin pin = new Pin(300,170,true);
            addObject(pin,300,170);
            Pin pin2 = new Pin(15,112,false);
            addObject(pin2,15,112);
            Pin pin3 = new Pin(515,235,false);
            addObject(pin3,515,235);
            Pin pin4 = new Pin(99,293,false);
            addObject(pin4,99,293);
        }
        if (currentLocation == "San Francisco, USA") //checks if the location is San Francisco
        {
            Question3 question3 = new Question3();
            addObject(question3, 270, 60);
            Pin pin = new Pin(330,204,true);
            addObject(pin,330,204);
            Pin pin2 = new Pin(460,237,false);
            addObject(pin2,480,237);
            Pin pin3 = new Pin(441,331,false);
            addObject(pin3,441,331);
            Pin pin4 = new Pin(549,321,false);
            addObject(pin4,549,321);
            Pin pin5 = new Pin(548,381,false);
            addObject(pin5,548,381);
            Pin pin6 = new Pin(449,138,false);
            addObject(pin6,449,138);
            Pin pin7 = new Pin(371,46,false);
            addObject(pin7,371,46);
            Pin pin8 = new Pin(540,184,false);
            addObject(pin8,540,184);
            Pin pin9 = new Pin(91,202,false);
            addObject(pin9,91,202);

        }
        if (currentLocation == "New York, USA") //checks if the location is New York
        {
            Question4 question4 = new Question4();
            addObject(question4, 550, 300);
            Pin pin = new Pin(208,296,true);
            addObject(pin,208,296);
            Pin pin2 = new Pin(25,224,false);
            addObject(pin2,25,224);
            Pin pin3 = new Pin(79,350,false);
            addObject(pin3,79,350);
            Pin pin4 = new Pin(247,242,false);
            addObject(pin4,247,242);
            Pin pin5 = new Pin(325,101,false);
            addObject(pin5,325,101);
            Pin pin6 = new Pin(425,46,false);
            addObject(pin6,425,46);
            Pin pin7 = new Pin(211,46,false);
            addObject(pin7,211,46);
            Pin pin8 = new Pin(204,168,false);
            addObject(pin8,204,168);
            removeObject(pin4);
        }
        if (currentLocation == "Melbourne, Australia") //checks if the location is Melbourne
        {
            Question5 question5 = new Question5();
            addObject(question5, 400, 250);
            Pin pin = new Pin(337,324,false);
            addObject(pin,337,324);
            Pin pin2 = new Pin(408,78,false);
            addObject(pin2,408,78);
            Pin pin3 = new Pin(85,38,false);
            addObject(pin3,85,38);
            Pin pin4 = new Pin(270,70,true);
            addObject(pin4,270,79);
            Pin pin5 = new Pin(68,241,false);
            addObject(pin5,68,241);
            Pin pin6 = new Pin(512,246,false);
            addObject(pin6,512,246);
        }
        if (currentLocation == "Toronto, Canada") //checks if the location is Toronto
        {
            Question6 question6 = new Question6();
            addObject(question6, 400, 60);
            Pin pin = new Pin(506,86,true);
            addObject(pin,506,86);
            Pin pin2 = new Pin(370,160,false);
            addObject(pin2,370,160);
            Pin pin3 = new Pin(257,200,false);
            addObject(pin3,257,200);
            Pin pin4 = new Pin(138,334,false);
            addObject(pin4,138,334);
            Pin pin5 = new Pin(382,323,false);
            addObject(pin5,382,323);
            Pin pin6 = new Pin(335,370,false);
            addObject(pin6,335,370);
            Pin pin7 = new Pin(96,269,false);
            addObject(pin7,96,269);
            Pin pin8 = new Pin(450,262,false);
            addObject(pin8,450,262);
            pin5.setLocation(391,335);
            removeObject(pin5);
        }
        if (currentLocation == "Beijing, China") //checks if the location is Beijing
        {
            Question7 question7 = new Question7();
            addObject(question7, 400, 60);
            Pin pin = new Pin(560,270,true);
            addObject(pin,560,270);
            Pin pin2 = new Pin(562,158,false);
            addObject(pin2,562,158);
            Pin pin3 = new Pin(469,61,false);
            addObject(pin3,469,61);
            Pin pin4 = new Pin(160,217,false);
            addObject(pin4,160,217);
            Pin pin5 = new Pin(74,57,false);
            addObject(pin5,74,57);
        }
        if (currentLocation == "Paris, France") //checks if the location is Paris
        {
            Question8 question8 = new Question8();
            addObject(question8, 280, 150);
            Pin pin = new Pin(272,300,true);
            addObject(pin,272,300);
            Pin pin2 = new Pin(188,79,false);
            addObject(pin2,188,79);
            Pin pin3 = new Pin(47,69,false);
            addObject(pin3,47,69);
            Pin pin4 = new Pin(524,90,false);
            addObject(pin4,524,90);

        }
        if (currentLocation == "Moscow, Russia") //checks if the location is Moscow
        {
            Question9 question9 = new Question9();
            addObject(question9, 500, 60);
            Pin pin = new Pin(293,186,true);
            addObject(pin,293,186);
            Pin pin2 = new Pin(499,73,false);
            addObject(pin2,499,73);
            Pin pin3 = new Pin(483,198,false);
            addObject(pin3,483,198);
            Pin pin4 = new Pin(80,282,false);
            addObject(pin4,80,282);
            Pin pin5 = new Pin(39,148,false);
            addObject(pin5,39,148);
            Pin pin6 = new Pin(33,76,false);
            addObject(pin6,33,76);
            Pin pin7 = new Pin(338,349,false);
            addObject(pin7,338,349);
            Pin pin8 = new Pin(491,350,false);
            addObject(pin8,491,350);
            Pin pin9 = new Pin(567,281,false);
            addObject(pin9,567,281);
            Pin pin10 = new Pin(567,153,false);
            addObject(pin10,567,153);
            Pin pin11 = new Pin(189,103,false);
            addObject(pin11,189,103);
        }
        if (currentLocation == "Amsterdam, Netherlands") //checks if the location is Amsterdam
        {
            Question10 question10 = new Question10();
            addObject(question10, 460, 350);
            Pin pin = new Pin(309,207,true);
            addObject(pin,309,207);
            Pin pin2 = new Pin(556,344,false);
            addObject(pin2,556,344);
            Pin pin3 = new Pin(449,339,false);
            addObject(pin3,449,339);
            Pin pin4 = new Pin(204,331,false);
            addObject(pin4,204,331);
            Pin pin5 = new Pin(519,180,false);
            addObject(pin5,519,180);
            Pin pin6 = new Pin(503,44,false);
            addObject(pin6,503,44);
            Pin pin7 = new Pin(89,51,false);
            addObject(pin7,89,51);
            Pin pin8 = new Pin(137,223,false);
            addObject(pin8,137,223);
            Pin pin9 = new Pin(319,307,false);
            addObject(pin9,319,307);
            Pin pin10 = new Pin(431,237,false);
            addObject(pin10,431,237);
        }

        prepare(); //this calls the prepare method which adds one pin to the map
    }

    //public String getLocation()
    //{   
        //return currentLocation; 
    //}

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pin pin = new Pin(); //creates a new pin object
        addObject(pin,295,203); //adds it to the given coordinates on the world
    }
}
