import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Question10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Question10 extends Actor
{
    /**
     * Act - do whatever the Question10 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Question10()
    {
    GreenfootImage img = new GreenfootImage (900, 40);
    img.drawString ("What is the most desnsely populated country in Europe?", 2, 30);
    setImage(img);
     }
    public void act() 
    {
        // Add your action code here.
    }    
}
