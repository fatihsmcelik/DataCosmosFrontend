package com.example.application.views.list;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Key;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@Route(value = "", layout = NavBar.class)
@PermitAll
@PageTitle("DC | Search")
public class Search extends VerticalLayout {
    VerticalLayout verticalLayout = new VerticalLayout();
    H2 title = new H2("DATA COSMOS");
    TextField txtSearch = new TextField();
    Button btnSearch = new Button("Search");

    public Search() {
        title.getStyle().set("color", "white").set("font-size", "54px");
        verticalLayout.add(title, getSearch());

        getStyle().set("padding-bottom", "100px").set("padding-left", "550px");
        add(verticalLayout);

        btnSearch.addClickListener(click -> btnSearch.getUI().ifPresent(ui ->
                ui.navigate("Datasets")));
    }

    private Component getSearch() {
        HorizontalLayout hlo = new HorizontalLayout();
        txtSearch.setPlaceholder("");
        txtSearch.setPrefixComponent(VaadinIcon.SEARCH.create());
        txtSearch.setClearButtonVisible(true);
        txtSearch.setValueChangeMode(ValueChangeMode.LAZY);
        txtSearch.addFocusShortcut(Key.ENTER);
        txtSearch.setWidth("395px");
        txtSearch.setHeight("auto");
        txtSearch.getStyle().set("alignment", "center");
        txtSearch.getStyle().set("border-radius", "20px");
        btnSearch.setWidth("90px");

        hlo.add(txtSearch, btnSearch);
        return hlo;
    }
    public String search(){
        return txtSearch.getValue();
    }
}
