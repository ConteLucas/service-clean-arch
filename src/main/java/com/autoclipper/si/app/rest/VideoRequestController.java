package com.autoclipper.si.app.rest;

import com.autoclipper.si.app.dto.client.VideoRequestDTO;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/api/generate_clips")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VideoRequestController {

    @POST
    public Response generateClips(VideoRequestDTO videoRequest) {
        return Response.ok().entity("Pedido recebido com sucesso").build();
    }
}


