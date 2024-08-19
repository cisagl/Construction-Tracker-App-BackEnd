package isaoglu.cahit.Construction.Site.Tracking.System.service;

import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Site;
import isaoglu.cahit.Construction.Site.Tracking.System.repository.ISiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SiteService {

    @Autowired
    private ISiteRepository siteRepository;

    public List<Site> getAllSites(){
        return siteRepository.findAll();
    }

    public Site createSite(Site site) {
        return siteRepository.save(site);
    }

    public void deleteSite(Long id) {
        siteRepository.deleteById(id);
    }

    public Site updateSite(Long id, String newName) {
        Site site = siteRepository.findById(id).orElseThrow();
        site.setName(newName);
        return siteRepository.save(site);
    }
}
