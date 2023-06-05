package com.example.application.form;

import com.vaadin.flow.component.HasValueAndElement;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;

import java.util.stream.Stream;

public class RegistrationForm extends VerticalLayout {

    private H3 title;

    private TextField userName = new TextField("Username");

    private PasswordField password = new PasswordField("Password");
    private PasswordField passwordConfirm = new PasswordField("Password Confirm");
    private Span errorMessageField;

    private Button submitButton=new Button("Register");


    public RegistrationForm() {
    }

    public FormLayout getLayout() {


        FormLayout register = new FormLayout();

        title = new H3("Registration Form");

        setRequiredIndicatorVisible(userName, password, passwordConfirm);

        errorMessageField = new Span();

        register.add(title, userName, password,
                passwordConfirm, errorMessageField,
                submitButton);

        // Max width of the Form
        register.setMaxWidth("360px");
        register.setMaxHeight("500px");
        register.getStyle().set("background-color", "rgba(255, 255, 255, 0.2)");
        return register;
    }

    public PasswordField getPasswordField() {
        return password;
    }

    public PasswordField getPasswordConfirmField() {
        return passwordConfirm;
    }

    public Span getErrorMessageField() {
        return errorMessageField;
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    private void setRequiredIndicatorVisible(HasValueAndElement<?, ?>... components) {
        Stream.of(components).forEach(comp -> comp.setRequiredIndicatorVisible(true));
    }

}