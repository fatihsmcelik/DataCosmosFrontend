package com.example.application.views.list;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.*;
import com.vaadin.flow.server.auth.AnonymousAllowed;


@Route("login")
@PageTitle("Login | Data Cosmos")
@AnonymousAllowed
public class LoginView extends HorizontalLayout implements BeforeEnterObserver {
    /*                                                                                            //
          -Look at addClassName(); function to call specific css style for a component.          //
   Done   -Organize the login view.                                                             //
   Done   -Crate your own form for login and sign up                                          <==========================
   LATER! -Try to change the placeholder color, but it is not important                         \\
   DONE   -Connect form to spring security                                                       \\
          -Design link table to view in the page to test                                          \\
   DONE   -Create database
   DONE   -Connect to Database
     */

    Label header = new Label();
        LoginForm login = new LoginForm();

    public LoginView() {

        //---------------------------------HEADER---------------------------------\\
        header.setText("Data Cosmos");
        header.getStyle().set("font-size", "50px");
        header.getStyle().set("margin-bottom", "40px");
        header.getStyle().set("box-shadow", "0 5px 5px red");
        header.getStyle().set("color", "white");
        header.getStyle().set("width", "500px");
        //---------------------------------ADD-TO-MAIN-VIEW---------------------------------\\
        login.setAction("login");
      //  login.getStyle().set("width", "400px");
      //  login.getStyle().set("height", "350px");
        setAlignItems(Alignment.CENTER);


        RouterLink reg = new RouterLink("Register", RegisterView.class);


        VerticalLayout vl = new VerticalLayout();
        vl.add(login, reg);
        vl.getStyle().set("Alignment", "center");

        add(vl, header);

    }

    @Override
    public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
        // inform the user about an authentication error
        if (beforeEnterEvent.getLocation()
                .getQueryParameters()
                .getParameters()
                .containsKey("error")) {
            login.setError(true);
        }
    }
}