import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JPanel implements ActionListener, KeyListener {
    Timer timer = new Timer(5, this);
    Ball b;
    Racket r1, r2;
    boolean setCpuMode = false;
    boolean gameOver = false;
    boolean showMenu = true;
    String winner = "";
    boolean wPressed = false;
    boolean sPressed = false;
    boolean upPressed = false;
    boolean downPressed = false;

    public Main() {
        b = new Ball();
        r1 = new Racket(1);
        r2 = new Racket(2);
        timer.stop(); // Start solo dopo Enter
    }

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        Main game = new Main();
        jf.setSize(720, 550);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
        jf.add(game);
        jf.addKeyListener(game);
        jf.setTitle("Ping Pong Game");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        if (showMenu) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("default", Font.BOLD, 32));
            g.drawString("Ping Pong Game", 240, 200);
            g.setFont(new Font("default", Font.PLAIN, 20));
            g.drawString("Press ENTER to Start", 260, 250);
            return;
        }

        g.drawRect(35, 0, 634, 450);
        b.paint(g);
        r1.paint(g);
        r2.paint(g);

        g.setColor(Color.black);
        g.drawString("[Player 1: W/S] [Player 2: Up/Down] [CPU Mode: C]", 200, 500);

        if (gameOver) {
            g.setColor(Color.RED);
            g.setFont(new Font("default", Font.BOLD, 36));
            g.drawString(winner, 240, 225);
            g.setFont(new Font("default", Font.PLAIN, 20));
            g.drawString("Press R to Restart", 260, 260);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            b.move();
            checkCollision();
            checkWin();
            if (setCpuMode) {
                r1.cpuMode(b);
            }
            repaint();
        }
        // Movimento continuo
        if (wPressed)
            r1.setAccel(-1);
        if (sPressed)
            r1.setAccel(1);
        if (upPressed)
            r2.setAccel(-1);
        if (downPressed)
            r2.setAccel(1);

    }

    private void checkCollision() {
        if (b.getX() < 45 && r1.y < b.getY() && r1.y + 80 > b.getY()) {
            b.xVel = -b.xVel;
            int offset = b.getY() - (r1.y + 40);
            b.yVel = offset / 5;
            b.increaseSpeed(); // <-- aggiungi qui
            SoundPlayer.playSound("bounce.wav");
        }

        if (b.getX() > 660 && r2.y < b.getY() && r2.y + 80 > b.getY()) {
            b.xVel = -b.xVel;
            int offset = b.getY() - (r2.y + 40);
            b.yVel = offset / 5;
            b.increaseSpeed(); // <-- e qui
            SoundPlayer.playSound("bounce.wav");
        }
    }

    private void checkWin() {
        if (b.getX() < 30) {
            r2.score++;
            SoundPlayer.playSound("score.wav");
            checkWinner();
            b = new Ball();
        } else if (b.getX() > 675) {
            r1.score++;
            SoundPlayer.playSound("score.wav");
            checkWinner();
            b = new Ball();
        }
    }

    private void checkWinner() {
        if (r1.score >= 5) {
            gameOver = true;
            winner = "Player 1 Wins!";
            timer.stop();
        } else if (r2.score >= 5) {
            gameOver = true;
            winner = "Player 2 Wins!";
            timer.stop();
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (showMenu && e.getKeyCode() == KeyEvent.VK_ENTER) {
            showMenu = false;
            timer.start();
            return;
        }

        if (gameOver && e.getKeyCode() == KeyEvent.VK_R) {
            b = new Ball();
            r1.score = 0;
            r2.score = 0;
            gameOver = false;
            winner = "";
            timer.start();
            repaint();
            return;
        }

        if (!showMenu && !gameOver) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_W -> wPressed = true;
                case KeyEvent.VK_S -> sPressed = true;
                case KeyEvent.VK_UP -> upPressed = true;
                case KeyEvent.VK_DOWN -> downPressed = true;
                case KeyEvent.VK_C -> setCpuMode = true;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W -> wPressed = false;
            case KeyEvent.VK_S -> sPressed = false;
            case KeyEvent.VK_UP -> upPressed = false;
            case KeyEvent.VK_DOWN -> downPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}