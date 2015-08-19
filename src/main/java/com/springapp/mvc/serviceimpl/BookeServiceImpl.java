package com.springapp.mvc.serviceimpl;

import com.springapp.mvc.dao.BookDao;
import com.springapp.mvc.entity.Book;
import com.springapp.mvc.service.BookService;

import java.util.List;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public class BookeServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public List<Book> getBookList() {
        return null;
    }

    @Override
    public Book findBook(Book book) {
        return null;
    }

    @Override
    public String addBook(Book newBook) {
        return null;
    }

    @Override
    public String changeBookInfo(String bookId) {
        return null;
    }

    @Override
    public String deleteBook() {
        return null;
    }
}
