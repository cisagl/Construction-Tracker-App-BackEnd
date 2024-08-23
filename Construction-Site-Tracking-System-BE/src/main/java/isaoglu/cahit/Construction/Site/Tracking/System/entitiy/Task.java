package isaoglu.cahit.Construction.Site.Tracking.System.entitiy;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "task")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "task_id")
    private Long id;

    @Column(name = "task_name")
    private String name;

    @Column (name = "task_description")
    private String description;

    @ManyToOne
    @JoinColumn (name = "task_site_id", referencedColumnName = "site_id", nullable = false)
    private Site site;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Image> images = new ArrayList<>();
}
