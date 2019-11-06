package com.nocompany.app;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

class ShowValueHolderValueAction extends AbstractAction {
  private final PersonBean personBean;

  ShowValueHolderValueAction(PersonBean personBean) {
    this.personBean = personBean;
  }

  public void actionPerformed(ActionEvent event) {
    StringBuffer message = new StringBuffer();
    message.append("<html>");
    message.append("<b>First Name:</b> ");
    message.append(personBean.getFirstName());
    message.append("<br><b>Last Name:</b> ");
    message.append(personBean.getLastName());
    message.append("</html>");

    JOptionPane.showMessageDialog(null, message.toString());
  }
}
