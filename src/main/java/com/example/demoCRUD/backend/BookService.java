package com.example.demoCRUD.backend;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService implements CrudListener<Book> {

    private final BookRepository repo;

    @Override
    public List<Book> findAll() {
        return repo.findAll();
    }

    @Override
    public Book add(Book book) {
        return repo.save(book);
    }

    @Override
    public Book update(Book book) {
        return repo.save(book);
    }

    @Override
    public void delete(Book book) {
        repo.delete(book);
    }
}
