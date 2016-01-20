package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ikeya on 16/01/21.
 */
@Controller
public class SampleController {
    @ModelAttribute
    public TodoForm setUpTodoForm() {
        return new TodoForm();
    }

    @RequestMapping("todo/register")
    public String register() {
        return "hoge";
    }

    @RequestMapping("todo/create")
    public String create(@Validated TodoForm todoForm, BindingResult result) {
        return "hoge";
    }
}
