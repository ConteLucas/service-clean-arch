package com.autoclipper.si.app.controller;

import com.autoclipper.si.app.dto.setvideoprocessingclientdto.SetVideoProcessingRequestDto;
import com.autoclipper.si.app.dto.setvideoprocessingclientdto.SetVideoProcessingResponseDto;
import com.autoclipper.si.app.mapper.setvideoprocessingmapper.SetVideoProcessingDtoToEntityMapper;
import com.autoclipper.si.app.mapper.setvideoprocessingmapper.SetVideoProcessingEntityToDtoMapper;
import com.autoclipper.si.app.service.interfaces.setvideoprocessingserviceinterface.IDeleteSetVideoProcessingService;
import com.autoclipper.si.app.service.interfaces.setvideoprocessingserviceinterface.IGetSetVideoProcessingService;
import com.autoclipper.si.app.service.interfaces.setvideoprocessingserviceinterface.ISaveSetVideoProcessingService;
import com.autoclipper.si.app.service.interfaces.setvideoprocessingserviceinterface.IUpdateSetVideoProcessingService;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingRequest;
import com.autoclipper.si.domain.entities.setvideoprocessingentities.ESetVideoProcessingResponse;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.stream.Collectors;

@Path("/videoProcessing")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SetVideoProcessingController {

    @Inject
    private ISaveSetVideoProcessingService saveSetVideoProcessingService;
    @Inject
    private IGetSetVideoProcessingService getSetVideoProcessingService;
    @Inject
    private IUpdateSetVideoProcessingService updateSetVideoProcessingService;
    @Inject
    private IDeleteSetVideoProcessingService deleteSetVideoProcessingService;
    @Inject
    private SetVideoProcessingDtoToEntityMapper setVideoProcessingDtoToEntityMapper;
    @Inject
    private SetVideoProcessingEntityToDtoMapper setVideoProcessingEntityToDtoMapper;

    @POST
    public Response createSetVideoProcessing(SetVideoProcessingRequestDto requestDto) {
        ESetVideoProcessingRequest eSetVideoProcessingRequest = setVideoProcessingDtoToEntityMapper.dtoToEntity(requestDto);
        ESetVideoProcessingResponse createdSetVideoProcessing = saveSetVideoProcessingService.saveSetVideoProcessing(eSetVideoProcessingRequest);
        return Response.status(Response.Status.CREATED)
                .entity(createdSetVideoProcessing)
                .build();
    }
    @GET
    public List<SetVideoProcessingResponseDto> getAllSetVideoProcessings() {
        List<ESetVideoProcessingResponse> allSetVideoProcessings = getSetVideoProcessingService.getAllSetVideoProcessing();
        return allSetVideoProcessings.stream()
                .map(setVideoProcessingEntityToDtoMapper::entityToDto)
                .collect(Collectors.toList());
    }
    @GET
    @Path("/{id}")
    public Response getSetVideoProcessingById(@PathParam("id") Integer id) {
        ESetVideoProcessingResponse setVideoProcessing = getSetVideoProcessingService.getSetVideoProcessingById(id);
        if (setVideoProcessing != null) {
            return Response.ok(setVideoProcessing).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
    @PUT
    @Path("/{id}")
    public Response updateSetVideoProcessing(@PathParam("id") Integer id, SetVideoProcessingRequestDto requestDto) {
        ESetVideoProcessingRequest eSetVideoProcessingRequest = setVideoProcessingDtoToEntityMapper.dtoToEntity(requestDto);
        ESetVideoProcessingResponse updatedSetVideoProcessing = updateSetVideoProcessingService.updateSetVideoProcessing(id, eSetVideoProcessingRequest);
        if (updatedSetVideoProcessing != null) {
            return Response.ok(updatedSetVideoProcessing).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }
    @DELETE
    @Path("/{id}")
    public Response deleteSetVideoProcessing(@PathParam("id") Integer id) {
        deleteSetVideoProcessingService.deleteSetVideoProcessing(id);
        return Response.noContent().build();
    }
}
