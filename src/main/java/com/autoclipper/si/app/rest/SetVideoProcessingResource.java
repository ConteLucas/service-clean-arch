package com.autoclipper.si.app.rest;

import com.autoclipper.si.app.dto.SetVideoRequestDto;
import com.autoclipper.si.app.dto.SetVideoResponseDto;
import com.autoclipper.si.app.mapper.SetVideoDtoEntityMapper;
import com.autoclipper.si.app.service.interfaces.IDeleteSetVideoService;
import com.autoclipper.si.app.service.interfaces.IGetSetVideoService;
import com.autoclipper.si.app.service.interfaces.ISaveSetVideoService;
import com.autoclipper.si.app.service.interfaces.IUpdateSetVideoService;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoRequest;
import com.autoclipper.si.domain.entities.setvideoentities.ESetVideoResponse;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.stream.Collectors;

@Path("/videoProcessing")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SetVideoProcessingResource {

    @Inject
    private ISaveSetVideoService saveSetVideoService;

    @Inject
    private IGetSetVideoService getSetVideoService;

    @Inject
    private IUpdateSetVideoService updateSetVideoService;

    @Inject
    private IDeleteSetVideoService deleteSetVideoService;

    @Inject
    private SetVideoDtoEntityMapper mapper;

    @POST
    public Response createSetVideo(SetVideoRequestDto requestDto) {
        ESetVideoRequest eSetVideoRequest = mapper.dtoToEntity(requestDto);
        ESetVideoResponse createdSetVideo = saveSetVideoService.saveSetVideo(eSetVideoRequest);
        return Response.status(Response.Status.CREATED)
                .entity(createdSetVideo)
                .build();
    }

    @GET
    public List<SetVideoResponseDto> getAllSetVideos() {
        List<ESetVideoResponse> allSetVideos = getSetVideoService.getAllSetVideos();
        return allSetVideos.stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    public Response getSetVideoById(@PathParam("id") Integer id) {
        ESetVideoResponse setVideo = getSetVideoService.getSetVideoById(id);
        if (setVideo != null) {
            return Response.ok(setVideo).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response updateSetVideo(@PathParam("id") Integer id, SetVideoRequestDto requestDto) {
        ESetVideoRequest eSetVideoRequest = mapper.dtoToEntity(requestDto);
        ESetVideoResponse updatedSetVideo = updateSetVideoService.updateSetVideo(id, eSetVideoRequest);
        if (updatedSetVideo != null) {
            return Response.ok(updatedSetVideo).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteSetVideo(@PathParam("id") Integer id) {
        deleteSetVideoService.deleteSetVideo(id);
        return Response.noContent().build();
    }
}
