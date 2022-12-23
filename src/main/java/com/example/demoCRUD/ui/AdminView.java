package com.example.demoCRUD.ui;

import com.example.demoCRUD.backend.Book;
import com.example.demoCRUD.backend.BookService;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.crudui.crud.impl.GridCrud;

import javax.annotation.security.RolesAllowed;

@Route("admin")
@RolesAllowed("ADMIN")
public class AdminView extends VerticalLayout {
    public AdminView(BookService service) {
        var crud = new GridCrud<>(Book.class, service);
        crud.getGrid().setColumns("title", "published", "rating");
        crud.getCrudFormFactory().setVisibleProperties("title", "published", "rating");
        crud.setAddOperationVisible(false);
        crud.getCrudLayout().addToolbarComponent(new RouterLink("New Book", NewView.class));
        add(
                new H1("Admin view"),
                crud
        );
    }
}
