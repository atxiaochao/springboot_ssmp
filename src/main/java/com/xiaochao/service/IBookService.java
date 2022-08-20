package com.xiaochao.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaochao.domain.Book;

import java.util.List;

public interface IBookService extends IService<Book> {

    IPage<Book> getPage(int currentPage, int pageSize);

    /**
     * 模糊查询
     * @param currentPage
     * @param pageSize
     * @return
     */
    IPage<Book> getPage(int currentPage, int pageSize,Book book);

}
