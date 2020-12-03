import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Question7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question7 extends Actor
{
    /**
     * Act - do whatever the Question7 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Question7()
    {
    GreenfootImage img = new GreenfootImage (500, 30); //new image object
    img.drawString ("Which is one of the smartest countries in the world?", 2, 30); //displays the question text
    setImage(img);
     }
    public void act() 
    {
        // Add your action code here.
    }    
}
