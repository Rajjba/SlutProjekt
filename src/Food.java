import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.concurrent.ThreadLocalRandom;

public class Food extends JPanel implements MouseListener {
    int size = 40;

    public Food() {
        addMouseListener(this);
    }

    /*
    This method paints the components on a canvas
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        addFood(g);
    }

    /*
    this method paints ONE green rectangle
     */
    protected void addFood(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(randomNumber1*50, randomNumber2*50, size, size);
    }
    int randomNumber1 = ThreadLocalRandom.current().nextInt(1, 10 + 1);
    int randomNumber2 = ThreadLocalRandom.current().nextInt(1, 10 + 1);

    int playerScore = 0;

    @Override
    public void mouseClicked(MouseEvent e) {
        playerScore += 1;
        System.out.println(playerScore);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
