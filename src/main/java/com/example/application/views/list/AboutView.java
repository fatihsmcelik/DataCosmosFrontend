package com.example.application.views.list;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@PermitAll
@PageTitle("About")
@Route(value = "About Us", layout = NavBar.class)
public class AboutView extends VerticalLayout {

    Label txtAbout = new Label();
    Label txtGroup = new Label();
    H2 title = new H2("DATA COSMOS");

    public AboutView() {

        setSizeFull();
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");
        VerticalLayout vl = new VerticalLayout();
        title.getStyle().set("color", "white");

        vl.add(title, getAboutText(), getGroupText(), getLinkText());
        vl.setWidth("auto");
        vl.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("padding-left","400px");

        add(vl);

    }


    private Component getAboutText() {
        txtAbout.setText("DataCosmos is a website that brings links of datasets that are related " +
                "to the keyword that the user is searching for. DataCosmos typically has a search" +
                " bar that allows the user to enter a keyword" +
                " or phrase, and then displays a list of relevant datasets that " +
                "match the query. It is a comprehensive resource" +
                " for finding datasets related to your research interests or business" +
                " needs because users do not have to visit every website to find the related dataset." +
                " DataCosmos search engine indexes thousands of datasets from" +
                " 10 most known sources. Our target users are data scientists and artificial intelligence" +
                " programmers. We are intending to release an Information Retrieval based project.");
        txtAbout.setWidth("500px");
        //txtAbout.setHeight("auto");

        txtAbout.getStyle().set("font-size", "14px");
        return txtAbout;
    }

    private Component getGroupText() {
        txtGroup.getElement().setProperty("innerHTML", "Group members:<br/>Fatih Sultan Mehmet Çelik<br/>Bensu Şeker<br/>Göktuğ Yılmaz<br/>Mehmet Anıl Akgül");
        txtGroup.getStyle().set("padding", "-30px");
        txtGroup.setWidth("500px");
        txtGroup.getStyle().set("font-size", "12px");
        return txtGroup;
    }


    private Component getLinkText() {
        Anchor anchor = new Anchor("https:/github.com/bensuseker/DataCosmos-CMPE491-",
                "https:/github.com/bensuseker/DataCosmos-CMPE491-");

        Paragraph link = new Paragraph(new Text("You can find documentation detail:\n"), anchor);
        link.getStyle().set("color", "white");
        link.setWidth("500px");
        link.getStyle().set("font-size", "14.3px");
        return link;
    }


}
