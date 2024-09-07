package isaoglu.cahit.Construction.Site.Tracking.System.api;

import isaoglu.cahit.Construction.Site.Tracking.System.entitiy.Site;
import isaoglu.cahit.Construction.Site.Tracking.System.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sites")
public class SiteController {
    @Autowired
    private SiteService siteService;

    @GetMapping
    public List<Site> getAllSites(){
        return siteService.getAllSites();
    }

    @PostMapping("/save")
    public Site save(@RequestBody Site site){
        return siteService.createSite(site);
    }

    @PutMapping("/{id}")
    public Site update(@PathVariable Long id, @RequestBody Site siteDetails){
        return siteService.updateSite(id, siteDetails.getName());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        siteService.deleteSite(id);
    }
}
