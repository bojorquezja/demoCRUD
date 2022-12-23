package com.example.demoCRUD.ui;

import com.example.demoCRUD.backend.Book;
import com.example.demoCRUD.backend.BookService;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.vaadin.reports.PrintPreviewReport;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@Route("report")
@RolesAllowed("ADMIN")
public class ReportView extends VerticalLayout {
    public ReportView(BookService service) {
        var report = new PrintPreviewReport<>(Book.class, "title", "published", "rating");
        report.setItems(service.findAll());
        add(
            report
        );
    }
}
