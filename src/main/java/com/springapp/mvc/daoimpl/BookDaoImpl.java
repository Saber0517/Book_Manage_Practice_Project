package com.springapp.mvc.daoimpl;

import com.springapp.mvc.dao.BookDao;
import com.springapp.mvc.entity.Book;
import com.springapp.mvc.util.DBTableNameUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public class BookDaoImpl extends BaseDaoImpl implements BookDao {

    private final static String tableName = (DBTableNameUtil.getTableNameMap()).get("BOOK");
    private Connection con = null;

    @Override
    public List<Book> getBookList() {
        List<Book> bookLinkedList = new LinkedList<Book>();
        String sql = "select * from " + tableName;
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = this.getConnection();
            pst = con.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = null;
        try {
            con = this.getConnection();
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setBookId(rs.getString("BOOKID"));
                book.setBookName(rs.getString("BOOKNAME"));
                book.setPrice(rs.getDouble("PRICE"));
                bookLinkedList.add(book);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            this.free(con, pst, rs);
        }
        return bookLinkedList;
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
    public Integer changeBookInfo(Book book) {
        String sql = "UPDATE " + tableName + " SET BOOKNAME=?,PRICE=? WHERE BOOKID=?";
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        int result = 0;
        try {
            con = this.getConnection();
            pst = con.prepareStatement(sql);
            pst.setString(1, book.getBookName());
            pst.setDouble(2, book.getPrice());
            result = pst.executeUpdate();
        } catch (SQLException e) {
            this.free(con, pst, rs);
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String deleteBook() {
        return null;
    }
}
