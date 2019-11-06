package com.nocompany.app;

import com.jgoodies.binding.beans.Model;

public class PersonBean extends Model {
  // NOTE: need the class and getters to be public because of error:
  // Caused by: java.beans.IntrospectionException: Property 'firstName' not found in bean class com.nocompany.app.PersonBean

  private String firstName;

  private String lastName;

  private static final String FIRST_NAME_PROPERTY = "firstName";

  private static final String LAST_NAME_PROPERTY = "lastName";

  PersonBean(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    String oldValue = this.firstName;
    this.firstName = firstName;
    firePropertyChange(FIRST_NAME_PROPERTY, oldValue, this.firstName);
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    String oldValue = this.lastName;
    this.lastName = lastName;
    firePropertyChange(LAST_NAME_PROPERTY, oldValue, this.lastName);
  }
}