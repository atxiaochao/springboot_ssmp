package com.xiaochao.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochao.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    public void testGetById(){

        System.out.println(bookDao.selectById(1));
    }


    /**
     * 保存
     */
    @Test
    public void save(){
        Book book = new Book();
        book.setName("测试");
        book.setType("测试");
        book.setDescription("还是测试测试");
        bookDao.insert(book);

    }

    @Test
    public void delete(){
        bookDao.deleteById(15);
    }

    @Test
    public void getAll(){

        System.out.println(bookDao.selectList(null));
    }

    /**
     * 分页
     */
    @Test
    public void page(){
        IPage page = new Page(1,5);

        bookDao.selectPage(page,null);
    }


    @Test
    public void testGetBy(){
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name","spring");
        bookDao.selectList(qw);
    }
}
