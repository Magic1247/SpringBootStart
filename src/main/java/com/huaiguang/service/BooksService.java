package com.huaiguang.service;

import com.huaiguang.pojo.Books;

import java.util.List;

public interface BooksService {
    /**
     * 查询所有书
     *
     * @return
     */
    List<Books> getAll();

    /**
     * 根据id查询书
     *
     * @param bookID
     * @return
     */
    Books getBookById(Integer bookID);

    /**
     * 新增一本书
     *
     * @param books
     * @return
     */
    void addBooks(Books books);

    /**
     * 更新一本书
     *
     * @param books
     */
    void updateBooks(Books books);

    /**
     * 根据id删除一本书
     *
     * @param bookID
     */
    void deleteBooksById(Integer bookID);
}
