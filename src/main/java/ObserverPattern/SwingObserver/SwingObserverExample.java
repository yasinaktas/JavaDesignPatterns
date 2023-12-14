package ObserverPattern.SwingObserver;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample swingObserverExample = new SwingObserverExample();
        swingObserverExample.start();
    }

    public void start(){
        frame = new JFrame();
        JButton jButton = new JButton("Should I do it?");
        jButton.addActionListener(new AngelListener());
        jButton.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, jButton);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}

class AngelListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Don’t do it, you might regret it!");
    }
}

class DevilListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Come on, do it!");
    }
}
