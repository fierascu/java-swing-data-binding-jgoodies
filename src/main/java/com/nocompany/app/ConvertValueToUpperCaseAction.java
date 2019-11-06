package com.nocompany.app;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ConvertValueToUpperCaseAction extends AbstractAction {

  private final PersonBean personBean;

  public ConvertValueToUpperCaseAction(PersonBean personBean) {
    this.personBean = personBean;
  }

  public void actionPerformed(ActionEvent event) {
    personBean.setFirstName(personBean.getFirstName().toUpperCase());
    personBean.setLastName(personBean.getLastName().toUpperCase());
  }
}