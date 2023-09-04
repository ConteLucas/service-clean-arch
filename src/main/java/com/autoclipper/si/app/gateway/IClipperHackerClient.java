package com.autoclipper.si.app.gateway;

import com.autoclipper.si.app.dto.client.ClipperHackerResponseDTO;
import com.autoclipper.si.app.dto.client.TsuruRequestDTO;
import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
@RegisterRestClient(configKey = "clipper-hacker", baseUri = "http://127.0.0.1:80")
public interface IClipperHackerClient {
    @POST
    @Path("/generate_clips_from_url")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    ClipperHackerResponseDTO generateClipsFromUrl(
            TsuruRequestDTO tsuruRequest,
            @HeaderParam("x-api-key") String apiKey
    );
}

