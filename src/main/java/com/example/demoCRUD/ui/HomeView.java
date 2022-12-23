package com.example.demoCRUD.ui;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@Route("")
@PermitAll
public class HomeView extends VerticalLayout {

    public HomeView() {
        add(
                new H1("Home view")
        );
    }
}
