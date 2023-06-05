package com.example.application.views.list;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@PermitAll
@Route(value = "Datasets", layout = NavBar.class)
@PageTitle("DC | Datasets")
public class DatasetView extends VerticalLayout {
Search search = new Search();
   // Grid<Datasets> grid = new Grid<Datasets>(Datasets.class);
    public DatasetView() {

       // grid.setItems(c, d);

        //grid.setItems(Datasets.getDatasets(filterSearch));   // Add this function to Datasets class to get a list of data sets related with the filter
        /*
        grid.addComponentColumn(Datasets -> {
            Button fav = new Button("Add to Fav!");
            fav.addClickListener(click ->
                    Notification.show("Clicked!" + Contact.toString()));
            return fav;
        });
        grid.addComponentColumn(Datasets -> {
            StarsRating rating = new StarsRating();
            rating.addValueChangeListener(e -> {
                Notification.show(rating.getValue().toString());
            });
        });


        add(grid);
*/

    }

}