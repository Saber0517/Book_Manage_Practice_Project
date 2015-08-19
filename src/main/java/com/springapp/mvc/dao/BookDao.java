package com.springapp.mvc.dao;

import com.springapp.mvc.entity.Book;

import java.util.List;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public interface BookDao extends BaseDao {

    public List<Book> getBookList();

    public Book findBook(Book book);

    public String addBook(Book newBook);

    public String changeBookInfo(String bookId);

    public String deleteBook();
}
