package com.springapp.mvc.entity;

import java.io.Serializable;

/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
public class Book implements Serializable {
    Double price;
    String bookName;
    String bookId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (price != null ? !price.equals(book.price) : book.price != null) return false;
        if (bookName != null ? !bookName.equals(book.bookName) : book.bookName != null) return false;
        return !(bookId != null ? !bookId.equals(book.bookId) : book.bookId != null);

    }

    @Override
    public int hashCode() {
        int result = price != null ? price.hashCode() : 0;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        return result;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}
