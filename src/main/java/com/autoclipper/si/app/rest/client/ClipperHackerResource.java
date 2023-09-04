package com.autoclipper.si.app.rest.client;

import com.autoclipper.si.app.dto.client.ClipperHackerRequestDTO;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
@Path("api/clip_message")
public class ClipperHackerResource {

    @POST
    public Response sendClipperHackerMessage(ClipperHackerRequestDTO clipperHackerRequestDTO) {
        return Response.status(Response.Status.CREATED)
                .entity(clipperHackerRequestDTO)
                .build();
    }


}
