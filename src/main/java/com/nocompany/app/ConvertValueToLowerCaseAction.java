package com.nocompany.app;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ConvertValueToLowerCaseAction extends AbstractAction {

  private final PersonBean otherPersonBean;

  public ConvertValueToLowerCaseAction(PersonBean otherPersonBean) {
    super("Convert Value To LowerCase");
    this.otherPersonBean = otherPersonBean;
  }

  public void actionPerformed(ActionEvent event) {
    otherPersonBean.setFirstName(otherPersonBean.getFirstName().toLowerCase());
    otherPersonBean.setLastName(otherPersonBean.getLastName().toLowerCase());
  }
}