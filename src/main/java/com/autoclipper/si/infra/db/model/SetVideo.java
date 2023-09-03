package com.autoclipper.si.infra.db.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@EqualsAndHashCode(callSuper= false)
@Entity
@Table(name = "set_video")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SetVideo extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_id", nullable = false)
    private Integer videoId;
    @OneToOne
    @JoinColumn(name = "process_id", referencedColumnName = "process_id", nullable = false, insertable = false, updatable = false)
    private SetVideoProcessing processId;
    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id", nullable = false, insertable = false, updatable = false)
    private SetCustomer customerId;
    @Column(name = "video_creation_date", nullable = false)
    private Timestamp videoCreationDate;
    @Column(name = "transcription_srt", nullable = false)
    private String transcriptionSrt;
    @Column(name = "transcription_txt", nullable = false)
    private String transcriptionTxt;
}