import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Question4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question4 extends Actor
{
    /**
     * Act - do whatever the Question4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Question4()
    {
    GreenfootImage img = new GreenfootImage (500, 100); //new image object
    img.drawString ("Where was George Washington born?", 2, 30); //displays the question text
    setImage(img);
     }
    public void act() 
    {
        // Add your action code here.
    }    
}
