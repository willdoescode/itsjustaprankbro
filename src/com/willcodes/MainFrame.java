package com.willcodes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private final JButton button = new JButton("Press me");

    public MainFrame() {
        setTitle("Hi joshy!");
        setAlwaysOnTop(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(300, 300));
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                for (int i = 0; i < 300; i++) {
                    new FramePrank();
                }
            }
        });
    }
}
