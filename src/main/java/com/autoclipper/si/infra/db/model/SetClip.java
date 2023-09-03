package com.autoclipper.si.infra.db.model;
import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.model.SetVideo;
import com.autoclipper.si.infra.db.model.SetVideoProcessing;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper= false)
@Entity
@Table(name = "set_clip")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SetClip extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clip_id" , nullable = false)
    private Integer clipId;
    @OneToOne
    @JoinColumn(name = "process_id", referencedColumnName = "process_id", nullable = false, insertable=false, updatable = false)
    private SetVideoProcessing processId;
    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false, insertable=false, updatable = false)
    private SetCustomer customerId;
    @OneToOne
    @JoinColumn(name = "video_id", referencedColumnName = "video_id", nullable = false, insertable=false, updatable = false)
    private SetVideo videoId;
    @Column(name = "video_url_create_clip", nullable = false)
    private String videoUrlCreateClip;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "thumb", nullable = false)
    private String thumb;
    @Column(name = "score", nullable = false)
    private Integer score;
    @Column(name = "transcript_clip", nullable = false)
    private String transcriptClip;
}