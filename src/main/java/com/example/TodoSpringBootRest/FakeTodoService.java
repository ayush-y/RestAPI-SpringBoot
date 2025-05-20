package com.example.TodoSpringBootRest;

import com.example.TodoSpringBootRest.TodoService;
import org.springframework.stereotype.Service;

@Service("fakeTodoService")
public class FakeTodoService implements TodoService {
    @TimeMonitor
    public String doSomething() {
        return "FakeTodoService logic";
    }
}
