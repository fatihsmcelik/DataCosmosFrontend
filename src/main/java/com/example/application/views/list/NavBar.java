package com.example.application.views.list;

import com.example.application.security.SecurityService;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

import javax.annotation.security.PermitAll;

@PermitAll
@Route("Navbar")
public class NavBar extends AppLayout {
    private final SecurityService securityService;


    public NavBar(SecurityService securityService) {
        this.securityService = securityService;
        createHeader();


    }


    private void createHeader() {
        Button logout = new Button("Log out", e -> securityService.logout());
        H1 logo = new H1("Data Cosmos");
        logo.addClassNames("text-l", "m-m");

        HorizontalLayout hl = new HorizontalLayout();
        RouterLink search = new RouterLink("Search", Search.class);
        RouterLink about = new RouterLink("About-Us", AboutView.class);
        RouterLink dataset = new RouterLink("Datasets", DatasetView.class);
        RouterLink favDatasets = new RouterLink("Favorite Datasets", FavoritesView.class);
        // RouterLink fav = new RouterLink("favourites",FavoriteDatasets.class);
        hl.add(search, about, dataset, favDatasets);
        hl.getStyle().set("margin", "auto");

        search.setHighlightCondition(HighlightConditions.sameLocation());

        HorizontalLayout header = new HorizontalLayout(
                logo,
                hl,
                //Favorites
                logout
        );

        header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
        header.setWidth("100%");
        header.addClassNames("py-0", "px-m");
        header.getStyle().set("text-font", "italic");
        addToNavbar(header);

    }


}