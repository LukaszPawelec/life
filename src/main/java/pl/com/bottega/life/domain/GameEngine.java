package pl.com.bottega.life.domain;

/**
 * Created by Nizari on 18.11.2016.
 */
public class GameEngine {

    private int width, height;
    private int lifeExpectancy;
    private boolean[][] currentState;
    private boolean[][] newState;

    public GameEngine(int width, int height, int lifeExpectancy) {
        this.width = width;
        this.height = height;
        this.lifeExpectancy = lifeExpectancy;
        currentState = new boolean[width][height];
        newState = new boolean[width][height];
    }




}
