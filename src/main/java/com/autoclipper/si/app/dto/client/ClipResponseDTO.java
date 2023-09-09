package com.autoclipper.si.app.dto.client;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClipResponseDTO {

    @JsonbProperty("video_info")
    private VideoInfoDTO videoInfo;
    @JsonbProperty("clip_info")
    private List<ClipInfoDTO> clipInfo;
    @JsonbProperty("customer_info")
    private CustomerInfoDTO customerInfo;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class VideoInfoDTO {
        @JsonbProperty("video_url_create_clip")
        private String videoUrlCreateClip;
        @JsonbProperty("transcription_srt")
        private String transcriptionSrt;
        @JsonbProperty("transcription_txt")
        private String transcriptionTxt;
        @JsonbProperty("video_creation_date")
        private Timestamp videoCreationDate;
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class ClipInfoDTO {
        @JsonbProperty("video_url_create_clip")
        private String videoUrlCreateClip;
        @JsonbProperty("title")
        private String title;
        @JsonbProperty("thumb")
        private String thumb;
        @JsonbProperty("score")
        private Double score;
        @JsonbProperty("transcript_clip")
        private String transcriptClip;
    }
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class CustomerInfoDTO {
        @JsonbProperty("customer_phone")
        private String customerPhone;
    }
}
