package com.autoclipper.si.app.rest;

import com.autoclipper.si.app.dto.SetClipRequestDto;
import com.autoclipper.si.app.dto.SetClipResponseDto;
import com.autoclipper.si.app.mapper.SetClipDtoEntityMapper;
import com.autoclipper.si.app.service.interfaces.IDeleteSetClipService;
import com.autoclipper.si.app.service.interfaces.IGetSetClipService;
import com.autoclipper.si.app.service.interfaces.ISaveSetClipService;
import com.autoclipper.si.app.service.interfaces.IUpdateSetClipService;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipRequest;
import com.autoclipper.si.domain.entities.setclipentities.ESetClipResponse;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.stream.Collectors;

@Path("/clip")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SetClipResource {

    @Inject
    private ISaveSetClipService saveSetClipService;

    @Inject
    private IGetSetClipService getSetClipService;

    @Inject
    private IUpdateSetClipService updateSetClipService;

    @Inject
    private IDeleteSetClipService deleteSetClipService;

    @Inject
    private SetClipDtoEntityMapper mapper;

    @POST
    public Response createSetClip(SetClipRequestDto requestDto) {
        ESetClipRequest eSetClipRequest = mapper.dtoToEntity(requestDto);
        ESetClipResponse createdSetClip = saveSetClipService.saveSetClip(eSetClipRequest);
        return Response.status(Response.Status.CREATED)
                .entity(createdSetClip)
                .build();
    }

    @GET
    public List<SetClipResponseDto> getAllSetClips() {
        List<ESetClipResponse> allSetClips = getSetClipService.getAllSetClips();
        return allSetClips.stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    public Response getSetClipById(@PathParam("id") Integer id) {
        ESetClipResponse setClip = getSetClipService.getSetClipById(id);
        if (setClip != null) {
            return Response.ok(setClip).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response updateSetClip(@PathParam("id") Integer id, SetClipRequestDto requestDto) {
        ESetClipRequest eSetClipRequest = mapper.dtoToEntity(requestDto);
        ESetClipResponse updatedSetClip = updateSetClipService.updateSetClip(id, eSetClipRequest);
        if (updatedSetClip != null) {
            return Response.ok(updatedSetClip).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteSetClip(@PathParam("id") Integer id) {
        deleteSetClipService.deleteSetClip(id);
        return Response.noContent().build();
    }
}
