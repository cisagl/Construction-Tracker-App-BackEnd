package isaoglu.cahit.Construction.Site.Tracking.System.repository;


import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Image;
import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IImageRepository extends JpaRepository<Image, Long> {

    List<Image> findByTask(Task task);

}
