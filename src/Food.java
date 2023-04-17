import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.concurrent.ThreadLocalRandom;

public class Food extends JPanel implements MouseListener {
    int size = 10;
    double spawnRate;

    public Food() {
        this.size = size;
        this.spawnRate = spawnRate;
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
    this method paint ONE green rectangle
     */
    protected void addFood(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(randomNumber1*50, randomNumber2*50, size, size);
    }
    int randomNumber1 = ThreadLocalRandom.current().nextInt(1, 10 + 1);
    int randomNumber2 = ThreadLocalRandom.current().nextInt(1, 10 + 1);

    @Override
    public void mouseClicked(MouseEvent e) {

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
