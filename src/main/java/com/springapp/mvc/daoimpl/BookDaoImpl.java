package com.springapp.mvc.daoimpl;

import com.springapp.mvc.dao.BookDao;
import com.springapp.mvc.entity.Book;
import com.springapp.mvc.util.DBTableNameUtil;

import java.util.List;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public class BookDaoImpl extends BaseDaoImpl implements BookDao {

    private final static String tableName = (DBTableNameUtil.getTableNameMap()).get("FoodEntity");

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
