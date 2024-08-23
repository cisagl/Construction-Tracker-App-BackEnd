package isaoglu.cahit.Construction.Site.Tracking.System.service;

import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Site;
import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Task;
import isaoglu.cahit.Construction.Site.Tracking.System.repository.ISiteRepository;
import isaoglu.cahit.Construction.Site.Tracking.System.repository.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private ITaskRepository taskRepository;
    @Autowired
    private ISiteRepository siteRepository;

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public List<Task> findBySite(long siteId){
        Site site = siteRepository.findById(siteId);
        return taskRepository.findBySite(site);
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public Task updateTask(Long id, String newDescription) {
        Task task = taskRepository.findById(id).orElseThrow();
        task.setDescription(newDescription);
        return taskRepository.save(task);
    }
}
