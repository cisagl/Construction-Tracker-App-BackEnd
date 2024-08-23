package isaoglu.cahit.Construction.Site.Tracking.System.api;

import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Image;
import isaoglu.cahit.Construction.Site.Tracking.System.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping
    public List<Image> getAllImages() {
        return imageService.getAllTasks();
    }

    @GetMapping("/task/{taskId}")
    public List<Image> findByTask(@PathVariable long taskId) {
        return imageService.findByTask(taskId);
    }

    @PostMapping("/save")
    public Image save(@RequestBody Image image) {
        return imageService.createImage(image);
    }

    @PutMapping("/{id}")
    public Image update(@PathVariable Long id, @RequestBody Image imageDetails){
        return imageService.updateImage(id, imageDetails.getImageUrl());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        imageService.deleteImage(id);
    }

}
