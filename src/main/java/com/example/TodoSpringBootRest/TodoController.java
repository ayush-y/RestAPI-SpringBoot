package com.example.TodoSpringBootRest;

import com.sun.net.httpserver.HttpsServer;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return ResponseEntity.status(HttpStatus.OK)
                .body(todoList);
    }
    @GetMapping("/todos/{todoId}")
    public ResponseEntity<Todo> getTodoById(@PathVariable Long todoId) {
            for(Todo todo : todoList){
                if(todo.getId() == todoId){
                    return ResponseEntity.status(HttpStatus.OK)
                            .body(todo);
                }
            }
        return ResponseEntity.notFound().build();
    }
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
    @DeleteMapping("/todos/{todoId}")
    public ResponseEntity<Todo> deleteTodoById(@PathVariable Long todoId){
        for(Todo todo : todoList){
            if(todo.getId() == todoId) {
                todoList.remove(todo);
                return ResponseEntity.status(HttpStatus.OK)
                        .body(todo);
            }

        }
        return ResponseEntity.badRequest().build();
    }
    @PatchMapping("/todos/{todoId}")
    public ResponseEntity<?> updateTodoById(@PathVariable Long todoId, @RequestBody Todo updatedTodo){
        for(Todo todo : todoList){
            if(todo.getId() == todoId) {
                todo.setCompleted(updatedTodo.isCompleted());
                todo.setTitle(updatedTodo.getTitle());
                return ResponseEntity.status(HttpStatus.OK)
                        .body(todo);
            }
        }
        Map<String, String> error = new HashMap<>();
        error.put("message", "No todo found to be updated");
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(error);
    }
}