package isaoglu.cahit.Construction.Site.Tracking.System.entitiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @Column (name = "task_image")
    private String image;

    @ManyToOne
    @JoinColumn (name = "task_site_id", referencedColumnName = "site_id", nullable = false)
    private Site site;
}
