
import java.awt.Color;
import java.awt.Graphics;

public class Ball {

    int xVel, yVel;
    int x, y;
    private final int MAX_SPEED = 8;  // limite velocità

    public Ball() {
        x = 350;
        y = 250;
        xVel = -3;
        yVel = 3;
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x - 10, y - 10, 20, 20);
    }

    public void move() {
        x += xVel;
        y += yVel;
        SoundPlayer.playSound("bounce.wav");

        if (y < 10 || y > 440) {
            yVel = -yVel;
        }
    }

    public void increaseSpeed() {
        if (Math.abs(xVel) < MAX_SPEED) {
            xVel += xVel > 0 ? 1 : -1;
        }
        if (Math.abs(yVel) < MAX_SPEED) {
            yVel += yVel > 0 ? 1 : -1;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
