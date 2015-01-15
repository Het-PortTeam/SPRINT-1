import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class can save scores.
 * 
 * @author Sven van Nigtevecht
 */
public class Saver
{
    private UserInfo player;
    /**
     * Constructor for objects of class Saver
     */
    public Saver()
    {
        if (UserInfo.isStorageAvailable()) {
            if (UserInfo.getMyInfo() != null) {
                player = UserInfo.getMyInfo();
            }
        }
    }
    
    public void saveHighscore(int score)
    {
        if (UserInfo.isStorageAvailable()) {
            if (player != null) {
                if (score > player.getScore()) {
                    player.setScore(score);
                    player.store();
                }
            }
        }
    }
}