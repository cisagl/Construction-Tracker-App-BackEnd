package isaoglu.cahit.Construction.Site.Tracking.System.entitiy;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "image")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "image_id")
    private Long id;

    @Column (name = "image_url")
    private String imageUrl;

    @ManyToOne
    @JoinColumn (name = "image_task_id", referencedColumnName = "task_id", nullable = false)
    private Task task;
}
