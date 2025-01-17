package com.library.service;

import com.library.bean.Book;
import com.library.bean.RespPage;

import java.text.ParseException;

/**
 * @Author: Zilong Lin Ning zhang
 * @Date: 2022/4/5 18:49
 * @Version: v1.0
 * @Description: Book-related operations
 */
//图书馆里模块业务层的实现类
public interface BookService {

    public Integer insert(String isbn, String type, String racknum, Integer total) throws ParseException;
    public Book findBookByid(Integer bId);
    public Integer findBookCountByName(String bName);
    public RespPage findBookByname(String bName, Integer page, Integer size);
    public Book findBookByISBN (String ISBN );
    public RespPage findBooksByAuthor(String bauthor, Integer page, Integer size);
    public Integer changeBook(Book book);
    public Integer deleteBook(Integer bId );

    public RespPage findBooksByPublished(String published, Integer page,Integer limit);

    public RespPage findAllBooks(Integer page, Integer limit);
}
