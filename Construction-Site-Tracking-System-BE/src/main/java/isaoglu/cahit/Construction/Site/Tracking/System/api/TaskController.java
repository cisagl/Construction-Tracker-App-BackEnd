package isaoglu.cahit.Construction.Site.Tracking.System.api;

import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Task;
import isaoglu.cahit.Construction.Site.Tracking.System.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }

    @PostMapping("/save")
    public Task save(@RequestBody Task task){
        return taskService.createTask(task);
    }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @RequestBody Task taskDetails){
        return taskService.updateTask(id, taskDetails.getDescription());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        taskService.deleteTask(id);
    }
}
