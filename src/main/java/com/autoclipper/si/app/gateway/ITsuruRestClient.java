package com.autoclipper.si.app.gateway;

import com.autoclipper.si.app.dto.client.ClipperHackerRequestDTO;
import com.autoclipper.si.app.dto.client.TsuruResponseDTO;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@Path("/api")
@RegisterRestClient(configKey = "tsuru-client")
public interface ITsuruRestClient {

    @POST
    @Transactional
    @Path("/v1/send/message/")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    TsuruResponseDTO requestClipsFromUrl(
            ClipperHackerRequestDTO clipperHackerRequestDTO,
            @HeaderParam("Authorization") String apiKeyTsuru);
}
