package isaoglu.cahit.Construction.Site.Tracking.System.repository;

import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISiteRepository extends JpaRepository<Site, Long> {
    Site findById(long id);
}
