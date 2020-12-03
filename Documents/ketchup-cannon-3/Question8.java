import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Question8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question8 extends Actor
{
    /**
     * Act - do whatever the Question8 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Question8()
    {
    GreenfootImage img = new GreenfootImage (500, 40); //new image object
    img.drawString ("Where was Marie Curie from?", 2, 30); //displays the question text
    setImage(img);
     }
    public void act() 
    {
        // Add your action code here.
    }    
}
