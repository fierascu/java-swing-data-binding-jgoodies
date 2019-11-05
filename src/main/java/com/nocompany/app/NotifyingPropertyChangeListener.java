package com.nocompany.app;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JOptionPane;

public class NotifyingPropertyChangeListener implements PropertyChangeListener {
  public void propertyChange(PropertyChangeEvent evt) {
    JOptionPane.showMessageDialog(null,
        "Property " + evt.getPropertyName() + " was changed to " + evt.getNewValue());
  }

}
