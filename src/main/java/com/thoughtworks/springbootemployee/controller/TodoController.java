package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.model.Todo;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Todo> getAllTodoList() {
        return null;
    }


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Todo addTodo(@RequestBody Todo todo) {
        return null;
    }

    @PutMapping("/{TodoID}")
    @ResponseStatus(HttpStatus.OK)
    public Todo updateTodo(@PathVariable int TodoID, @RequestBody Todo todo) {
        return null;
    }

    @DeleteMapping("/{TodoID}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTodo(@PathVariable int TodoID) {

    }
}
