package com.example.application.views.list;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.auth.AnonymousAllowed;

@Route("register")
@AnonymousAllowed
public class RegisterView extends Composite {
    H2 header = new H2("Register");
    TextField username = new TextField("Username");
    EmailField email = new EmailField("E-mail");
    PasswordField password1 = new PasswordField("Password");
    PasswordField password2 = new PasswordField("Confirm Password");
RouterLink login = new RouterLink("Login",LoginView.class);

    protected Component initContent() {

        //header.getStyle().set("color","white");
        email.getStyle().set("background-color", "rgba(0, 0, 0, 0.2)");
        email.getStyle().set("box-shadow", "0 5px 30px white");
        email.getStyle().set("border-radius", "20px");

        VerticalLayout reg = new VerticalLayout(
                header,
                username,
                email,
                password1,
                password2,
                new Button("Send", event -> register(
                        username.getValue(),
                        email.getValue(),
                        password1.getValue(),
                        password2.getValue()
                )),
                login
        );
        reg.getStyle().set("background-color", "rgba(0, 0, 0, 0.2)");
        reg.getStyle().set("box-shadow", "0 5px 30px white");
        reg.getStyle().set("border-radius", "20px");
        reg.getStyle().set("width", "500px");
        reg.setAlignItems(FlexComponent.Alignment.STRETCH);

        return reg;
    }

    private void register(String username, String email, String password1, String password2) {
    }

}
