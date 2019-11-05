package com.nocompany.app;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

public class ShowValueHolderValueAction extends AbstractAction {
  private final PersonBean otherPersonBean;

  public ShowValueHolderValueAction(PersonBean personBean) {
    super("Show Value");
    this.otherPersonBean = personBean;
  }

  public void actionPerformed(ActionEvent event) {
    StringBuffer message = new StringBuffer();
    message.append("<html>");
    message.append("<b>First Name:</b> ");
    message.append(otherPersonBean.getFirstName());
    message.append("<br><b>Last Name:</b> ");
    message.append(otherPersonBean.getLastName());
    message.append("</html>");

    JOptionPane.showMessageDialog(null, message.toString());
  }
}
