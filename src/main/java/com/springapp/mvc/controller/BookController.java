package com.springapp.mvc.controller;

import com.springapp.mvc.entity.Book;
import com.springapp.mvc.entity.User;
import com.springapp.mvc.service.BookService;
import org.apache.logging.log4j.core.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by ZHANGJA4 on 8/19/2015.
 */
@Controller
public class BookController {

    BookService bookService;

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/book")
    public String BookList() {
        return "book";
    }

    @RequestMapping(value = {"/bookList"})
    @ResponseBody
    public List<Book> getUserList(HttpServletResponse response) {
        //①表示响应的内容区数据的媒体类型为html格式，且编码为utf-8(客户端应该以utf-8解码)
        List<Book> bookList = bookService.getBookList();
        System.out.printf("bookList :" + bookList);
        return bookList;

    }

}
