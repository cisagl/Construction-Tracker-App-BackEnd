package isaoglu.cahit.Construction.Site.Tracking.System.repository;

import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Site;
import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITaskRepository extends JpaRepository<Task, Long> {

    Task findById(long id);

    List<Task> findBySite(Site site);
}
