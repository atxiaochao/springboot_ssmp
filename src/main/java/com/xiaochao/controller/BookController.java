package com.xiaochao.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xiaochao.controller.utils.R;
import com.xiaochao.domain.Book;
import com.xiaochao.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll(){

        return new R(true,bookService.list());
    }


    @PostMapping
    public R save(@RequestBody Book book){
        return new R(true,bookService.save(book));
    }

    @GetMapping("{id}")
    public R getById(@PathVariable Integer id){

        return new R(true,bookService.getById(id));
    }

//    @GetMapping("{currentPage}/{pageSize}")
//    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize){
//        return new R(true,bookService.getPage(currentPage,pageSize));
//    }

    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id){
        return new R(true,bookService.removeById(id));
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(true,bookService.updateById(book));
    }


    @GetMapping("{currentPage}/{pageSize}")
    public R getPage(@PathVariable int currentPage,@PathVariable int pageSize,Book book){
        return new R(true,bookService.getPage(currentPage,pageSize,book));
    }

}
