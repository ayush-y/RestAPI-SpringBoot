package com.example.TodoSpringBootRest;

import com.example.TodoSpringBootRest.TodoService;
import org.springframework.stereotype.Service;

@Service("anotherTodoService")
public class AnotherTodoService implements TodoService {
    @Override
    public String doSomething() {
        return "AnotherTodoService logic";
    }
}
