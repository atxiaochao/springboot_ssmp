package com.xiaochao.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xiaochao.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BookDao extends BaseMapper<Book> {
}
