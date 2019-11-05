package com.nocompany.app;

import javax.swing.JFrame;

class MainFrame extends JFrame {

  MainFrame() {
    super("JGoodies Binding");
    setDefaultCloseOperation(2);
    add(new PresentationBeanPropertyChangeListenerExample());
    pack();
    setVisible(true);
  }
}
