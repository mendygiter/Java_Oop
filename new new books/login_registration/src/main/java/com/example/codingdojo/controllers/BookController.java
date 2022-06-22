package com.example.codingdojo.controllers;

import com.example.codingdojo.models.Book;
import com.example.codingdojo.models.User;
import com.example.codingdojo.services.BookService;
import com.example.codingdojo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    UserService userService;

    @GetMapping("/books")
    public String books(@ModelAttribute("book") Book book, Model model, HttpSession session) {
        List<Book> allBooks = bookService.allBooks();
        model.addAttribute("allBooks", allBooks);

        // If no userId is found, redirect to logout
        if(session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        return "welcome";
    }
    //    Routes us to the create new book page
    @GetMapping("/new")
    public String newBook(@ModelAttribute("book") Book book, HttpSession session) {

        // If no userId is found, redirect to logout
        if(session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        return "/new";
    }

    //    Routing with error validation to create a new book
    @PostMapping("/newbook")
    public String create(@Valid @ModelAttribute("book")Book book, BindingResult result, HttpSession session) {

        // If no userId is found, redirect to logout
        if(session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }

        if (result.hasErrors()) {
            return "new";
        }
        else {
//            add user id to posted by
            User user = userService.findById((Long) session.getAttribute("userId"));
            book.setPostedBy(user);
            bookService.createBook(book);
            return "redirect:/books";
        }
    }

    @RequestMapping("/edit/{id}")
    public String edit(@PathVariable("id")Long id, Model model, HttpSession session) {
        Book book = bookService.getOne(id);
        model.addAttribute("oneBook", book);

        // If no userId is found, redirect to logout
        if(session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        return "edit";
    }

    @PostMapping("/editbook")
    public String editBook(@Valid @ModelAttribute("oneBook")Book book, BindingResult result, HttpSession session) {
        // If no userId is found, redirect to logout
        if(session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }

        if (result.hasErrors()) {
            return "edit";
        }
        else {
            User user = userService.findById((Long) session.getAttribute("userId"));
            book.setPostedBy(user);
            bookService.updateBook(book);
            return "redirect:/books";
        }
    }

    @RequestMapping("/show/{id}")
    public String showBook(@PathVariable("id")Long id, Model model, HttpSession session) {
        model.addAttribute("oneBook", bookService.getOne(id));

        if(session.getAttribute("userId") == null) {
            return "redirect:/logout";
        }
        return "show";
    }
    //another edit route
//    @RequestMapping("/edit/{id}")
//    public String edit(@PathVariable("id")Long id, Model model) {
//        model.addAttribute("editBook", bookService.getOne(id));
//        return "show";
//    }
}
