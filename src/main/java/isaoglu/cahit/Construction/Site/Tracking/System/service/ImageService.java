package isaoglu.cahit.Construction.Site.Tracking.System.service;

import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Image;
import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Task;
import isaoglu.cahit.Construction.Site.Tracking.System.repository.IImageRepository;
import isaoglu.cahit.Construction.Site.Tracking.System.repository.ITaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {

    @Autowired
    private ITaskRepository taskRepository;
    @Autowired
    private IImageRepository imageRepository;

    public List<Image> getAllTasks() {
        return imageRepository.findAll();
    }

    public List<Image> findByTask(long taskId) {
        Task task = taskRepository.findById(taskId);
        return imageRepository.findByTask(task);
    }

    public Image createImage(Image image) {
        return imageRepository.save(image);
    }

    public void deleteImage(Long id){
        imageRepository.deleteById(id);
    }

    public Image updateImage(Long id, String newImageUrl) {
        Image image = imageRepository.findById(id).orElseThrow();
        image.setImageUrl(newImageUrl);
        return imageRepository.save(image);
    }
}
