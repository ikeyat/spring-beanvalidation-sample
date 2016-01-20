package com.example;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

/**
 * Created by ikeya on 16/01/21.
 */
@Confirm(field = "todoTitle", message = "Cross Field Validation Error at \"{0}\"")
public class TodoForm {
    private static final long serialVersionUID = 1L;

    private String todoTitle;

    private String confirmTodoTitle;

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getConfirmTodoTitle() {
        return confirmTodoTitle;
    }

    public void setConfirmTodoTitle(String confirmTodoTitle) {
        this.confirmTodoTitle = confirmTodoTitle;
    }
}
