package com.example.TodoSpringBootRest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
//@Controller
//@ResponseBody
public class TodoController {
    private static List<Todo> todoList;

    public TodoController() {
        todoList = new ArrayList<>();
        todoList.add(new Todo(1, false, "Todo 1", 1));
        todoList.add(new Todo(2, true, "Todo 2", 1));
    }
    @GetMapping("/todos")
    public ResponseEntity<List<Todo>> getTodos() {
        return ResponseEntity.ok(todoList);
    }
  // 201
    @PostMapping("/todos")

    public ResponseEntity<Todo> createTodo(@RequestBody Todo newTodo){
        /**
         * @ResponseStatus(HttpStatus.CREATED) // 201 if created
         * qe can use above annotation to get status code
         */
        todoList.add(newTodo);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(newTodo);
    }


    }