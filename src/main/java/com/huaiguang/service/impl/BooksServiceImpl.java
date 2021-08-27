package com.huaiguang.service.impl;

import com.huaiguang.mapper.BooksMapper;
import com.huaiguang.pojo.Books;
import com.huaiguang.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {

    @Autowired
    private BooksMapper booksMapper;

    @Override
    public List<Books> getAll() {
        return booksMapper.getAll();
    }

    @Override
    public Books getBookById(Integer bookID) {
        return booksMapper.getBookById(bookID);
    }

    @Override
    public void addBooks(Books books) {
        booksMapper.addBooks(books);
    }

    @Override
    public void updateBooks(Books books) {
        booksMapper.updateBooks(books);
    }

    @Override
    public void deleteBooksById(Integer bookID) {
        booksMapper.deleteBooksById(bookID);
    }
}
