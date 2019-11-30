package com.nocompany.app;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.binding.PresentationModel;
import com.jgoodies.binding.adapter.BasicComponentFactory;
import com.jgoodies.binding.value.ValueModel;
import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.factories.Borders;
import com.jgoodies.forms.layout.FormLayout;

class PresentationBeanPropertyChangeListenerExample extends JPanel {

  PresentationBeanPropertyChangeListenerExample() {
    DefaultFormBuilder defaultFormBuilder =
        new DefaultFormBuilder(new FormLayout("p, 2dlu, p:g")).border(Borders.DIALOG);

    PersonBean personBean = new PersonBean("Scott", "Delap");

    PresentationModel<PersonBean> presentationModel = new PresentationModel<>(personBean);
    presentationModel.addBeanPropertyChangeListener(new NotifyingPropertyChangeListener());
    ValueModel firstNameAdapter = presentationModel.getModel("firstName");
    ValueModel lastNameAdapter = presentationModel.getModel("lastName");

    JTextField firstNameTextField = BasicComponentFactory.createTextField(firstNameAdapter);
    JTextField lastNameTextField = BasicComponentFactory.createTextField(lastNameAdapter);

    defaultFormBuilder.append("First Name: ", firstNameTextField);
    defaultFormBuilder.append("Last Name: ", lastNameTextField);

    JButton toUpperBtn = new JButton("Convert Value To UpperCase");
    toUpperBtn.addActionListener(new ConvertValueToUpperCaseAction(personBean));
    defaultFormBuilder.append(toUpperBtn, 3);

    JButton toLowerBtn = new JButton("Convert Value To LowerCase");
    toLowerBtn.addActionListener(new ConvertValueToLowerCaseAction(personBean));
    defaultFormBuilder.append(toLowerBtn, 3);

    JButton showBtn = new JButton("Show Value");
    showBtn.addActionListener(new ShowValueHolderValueAction(personBean));
    defaultFormBuilder.append(showBtn, 3);

    add(defaultFormBuilder.getPanel());
  }

}


