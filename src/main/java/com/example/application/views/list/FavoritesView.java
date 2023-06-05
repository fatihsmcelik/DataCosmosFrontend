package com.example.application.views.list;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@PermitAll
@Route(value = "Favorite Datasets", layout = NavBar.class)
public class FavoritesView extends VerticalLayout {
    Grid<Integer> favDatasets = new Grid<>();

    public FavoritesView() {
       // configureGrid();
    }

    private void configureGrid() {
        favDatasets.setSizeFull();
        favDatasets.setColumns("image", "name", "link", "average-rating", "rate","");
        favDatasets.addComponentColumn(UserDetails -> new Button());
    }
}
