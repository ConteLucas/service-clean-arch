package com.autoclipper.si.app.gateway;

import com.autoclipper.si.app.dto.client.ClipperHackerResponseDTO;
import com.autoclipper.si.app.dto.client.TsuruRequestDTO;
import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import jakarta.ws.rs.core.MediaType;

@RegisterRestClient
public interface IClipperHackerClient {

    @POST
    @Path("/api/generate_clips_from_url")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    ClipperHackerResponseDTO generateClipsFromUrl(TsuruRequestDTO tsuruRequest);
}