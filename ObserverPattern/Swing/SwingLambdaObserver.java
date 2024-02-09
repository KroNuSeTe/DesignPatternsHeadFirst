package ObserverPattern.Swing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SwingLambdaObserver{

    JFrame frame;
    public static void main (String[] args){
        SwingLambdaObserver example = new SwingLambdaObserver();
        example.go();
    }

    public void go(){
        frame = new JFrame();

        JButton button = new JButton("Should i do it?");
        button.addActionListener(event-> System.out.println("Don't do it, you might regret it!"));
        button.addActionListener(event-> System.out.println("Come on, do it!"));
        frame.getContentPane().add(BorderLayout.CENTER, button);

		// Set frame properties 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.CENTER, button);
		frame.setSize(300,300);
		frame.setVisible(true);
    }
}