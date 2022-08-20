package com.xiaochao.service;

import com.xiaochao.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService bookService;

    @Test
    public void getById(){

        System.out.println(bookService.getById(1));
    }

    @Test
    public void testSave(){
        Book book = new Book();
        book.setName("白帝城一日游");
        book.setType("奉节旅游网");
        book.setDescription("很好玩的哦");
        bookService.save(book);
    }
}
