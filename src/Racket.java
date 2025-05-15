import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class Racket {
    int x, y;
    int w = 20, h = 80;
    int player;
    int score = 0;
    Random rand = new Random();

    public Racket(int player) {
        this.player = player;
        x = (player == 1) ? 15 : 670;
        y = 250;
    }

    public void paint(Graphics g) {
        g.setColor(Color.pink);
        g.fillRect(x, y, w, h);
        g.setColor(Color.white);
        g.setFont(new Font("default", Font.PLAIN, 20));
        g.drawString(score + "", x + 5, y + 45);
    }

    public void setAccel(int direction) {
        int newY = y + (direction * 4);
        if (newY > 370) { // limiti più coerenti
            y = 370;
        } else if (newY < 10) {
            y = 10;
        } else {
            y = newY;
        }
    }

    public void cpuMode(Ball b) {
        y = b.getY() - 40;
    }
}
