import javax.swing.*;
import java.awt.*;

    public class Window extends JFrame {
        final int SIZE = 600;

        public Window (){
            this.setPreferredSize(new Dimension(SIZE,SIZE));
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);

            Food food = new Food();
            add(food);

            this.pack();
            this.setVisible(true);
        }
    }
