package com.autoclipper.si.app.gateway;

import com.autoclipper.si.app.dto.client.VideoRequestDTO;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient
@Path("/api")
@Consumes("application/json")
@Produces("application/json")
public interface TsuruClient {

    @POST
    @Path("/generate_clips_from_url")
    List<VideoRequestDTO> generateClipsFromUrl(VideoRequestDTO videoRequestDTO);
}
