package com.nocompany.app;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class ConvertValueToLowerCaseAction extends AbstractAction {

  private final PersonBean personBean;

  public ConvertValueToLowerCaseAction(PersonBean personBean) {
    this.personBean = personBean;
  }

  public void actionPerformed(ActionEvent event) {
    personBean.setFirstName(personBean.getFirstName().toLowerCase());
    personBean.setLastName(personBean.getLastName().toLowerCase());
  }
}