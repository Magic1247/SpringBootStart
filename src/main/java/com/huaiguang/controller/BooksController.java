package com.huaiguang.controller;

import com.huaiguang.pojo.Books;
import com.huaiguang.service.impl.BooksServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BooksServiceImpl booksService;

    @GetMapping("/books/getAll")
    public List<Books> getAll() {
        return booksService.getAll();
    }

    @RequestMapping("/books/getBookById")
    public Books getBookById(Integer id) {
        return booksService.getBookById(id);
    }

    @RequestMapping("/books/addBooks")
    public String addBooks(@RequestBody Books books) {
        try {
            booksService.addBooks(books);
            return "新增成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "新增失败";
    }

    @RequestMapping("/books/updateBooks")
    public String updateBooks(@RequestBody Books books) {
        try {
            booksService.updateBooks(books);
            return "更新成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "更新失败";
    }

    @RequestMapping("/books/deleteBooksById")
    public String deleteBooksById(Integer id) {
        try {
            booksService.deleteBooksById(id);
            return "删除成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "删除失败";
    }

}
