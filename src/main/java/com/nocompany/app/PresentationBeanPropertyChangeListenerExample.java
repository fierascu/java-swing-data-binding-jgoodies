package com.nocompany.app;

import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.binding.PresentationModel;
import com.jgoodies.binding.adapter.BasicComponentFactory;
import com.jgoodies.binding.value.ValueModel;
import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class PresentationBeanPropertyChangeListenerExample extends JPanel {
  private PersonBean personBean;

  public PresentationBeanPropertyChangeListenerExample() {
    DefaultFormBuilder defaultFormBuilder = new DefaultFormBuilder(new FormLayout("p, 2dlu, p:g"));
    defaultFormBuilder.setDefaultDialogBorder();

    personBean = new PersonBean("Scott", "Delap");

    PresentationModel presentationModel = new PresentationModel(personBean);
    presentationModel.addBeanPropertyChangeListener(new NotifyingPropertyChangeListener());
    ValueModel firstNameAdapter = presentationModel.getModel("firstName");
    ValueModel lastNameAdapter = presentationModel.getModel("lastName");

    JTextField firstNameTextField = BasicComponentFactory.createTextField(firstNameAdapter);
    JTextField lastNameTextField = BasicComponentFactory.createTextField(lastNameAdapter);

    defaultFormBuilder.append("First Name: ", firstNameTextField);
    defaultFormBuilder.append("Last Name: ", lastNameTextField);
    defaultFormBuilder.append(new JButton(new ConvertValueToUpperCaseAction()), 3);
    defaultFormBuilder.append(new JButton(new ConvertValueToLowerCaseAction()), 3);
    defaultFormBuilder.append(new JButton(new ShowValueHolderValueAction()), 3);

    add(defaultFormBuilder.getPanel());
  }

  private class ConvertValueToUpperCaseAction extends AbstractAction {
    public ConvertValueToUpperCaseAction() {
      super("Convert Value To UpperCase");
    }

    public void actionPerformed(ActionEvent event) {
      personBean.setFirstName(personBean.getFirstName().toUpperCase());
      personBean.setLastName(personBean.getLastName().toUpperCase());
    }
  }

  private class ConvertValueToLowerCaseAction extends AbstractAction {
    public ConvertValueToLowerCaseAction() {
      super("Convert Value To LowerCase");
    }

    public void actionPerformed(ActionEvent event) {
      personBean.setFirstName(personBean.getFirstName().toLowerCase());
      personBean.setLastName(personBean.getLastName().toLowerCase());
    }
  }

  private class ShowValueHolderValueAction extends AbstractAction {
    public ShowValueHolderValueAction() {
      super("Show Value");
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

  private class NotifyingPropertyChangeListener implements PropertyChangeListener {
    public void propertyChange(PropertyChangeEvent evt) {
      JOptionPane
          .showMessageDialog(null, "Property " + evt.getPropertyName() + " was changed to " + evt.getNewValue());
    }
  }
}


