package com.nocompany.app;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ConvertValueToUpperCaseAction extends AbstractAction {

  private final PersonBean otherPersonBean;

  public ConvertValueToUpperCaseAction(PersonBean otherPersonBean) {
    super("Convert Value To UpperCase");
    this.otherPersonBean = otherPersonBean;
  }

  public void actionPerformed(ActionEvent event) {
    otherPersonBean.setFirstName(otherPersonBean.getFirstName().toUpperCase());
    otherPersonBean.setLastName(otherPersonBean.getLastName().toUpperCase());
  }
}