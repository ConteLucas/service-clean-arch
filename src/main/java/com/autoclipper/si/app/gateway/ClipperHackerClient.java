package com.autoclipper.si.app.service.interfaces.client;

import com.autoclipper.si.app.dto.client.VideoRequestDTO;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.annotation.RegisterClientHeaders;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/api/generate_clips_from_url")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@RegisterClientHeaders
public interface ClipperHackerClient {

    @POST
    @ClientHeaderParam(name = "Content-Type", value = "application/json")
    void generateClipsFromUrl(VideoRequestDTO videoRequest);
}
