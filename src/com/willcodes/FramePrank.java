package com.willcodes;

import javax.swing.*;
import java.awt.*;

public class FramePrank extends JFrame {
    private final JLabel label = new JLabel("Whats going on josh");

    public FramePrank() {
        setAlwaysOnTop(true);
        Dimension ss = Toolkit.getDefaultToolkit().getScreenSize();
        setVisible(true);
        setLocation((int)Math.round(Math.random() * ss.width), (int)Math.round(Math.random() * ss.height));
        add(label);
        pack();
    }
}
