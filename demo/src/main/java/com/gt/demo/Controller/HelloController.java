package com.gt.demo.Controller;

import com.gt.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    Book book;

    @RequestMapping("/hello")
    public String index(){
        return book.getAuthor();
    }
}
