import java.awt.*;
import java.awt.event.*;

class Anonymous {
    public static void main(String[] args) {
        Button b = new Button("Start");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred");
            }
        });

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred");
            }
        });
    }
}