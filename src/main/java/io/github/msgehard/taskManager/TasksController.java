package io.github.msgehard.taskManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TasksController {
    @RequestMapping(value = "/tasks", method = RequestMethod.GET)
    public String index() {
        return "tasks/index";
    }
}
