import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Window extends JFrame {
        final int SIZE = 600;

        public Window () throws InterruptedException {
            this.setPreferredSize(new Dimension(SIZE,SIZE));
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            while(true) {
                    Food food = new Food();
                    add(food);
                    this.pack();
                    this.setVisible(true);

                TimeUnit.SECONDS.sleep(1);

            }
        }
}
