package com.autoclipper.si.infra.db.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper= false)
@Entity
@Table(name = "set_video_processing")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SetVideoProcessing extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "process_id", nullable = false)
    private Integer processId;
    @OneToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false, insertable = false, updatable = false)
    private SetCustomer customerId;
    @Column(name = "url", nullable = false)
    private String url;
    @Column(name = "start_video", nullable = false)
    private Timestamp startVideo;
    @Column(name = "end_video", nullable = false)
    private Timestamp endVideo;
    @Column(name = "avg_clip_duration", nullable = false)
    private float avgClipDuration;
    @Column(name = "status_req", nullable = false)
    private Boolean statusReq;
}
