package com.autoclipper.si.app.rest;

import com.autoclipper.si.app.dto.SetLeadsRequestDto;
import com.autoclipper.si.app.dto.SetLeadsResponseDto;
import com.autoclipper.si.app.mapper.SetLeadsDtoEntityMapper;
import com.autoclipper.si.app.service.interfaces.*;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import java.util.stream.Collectors;

@Path("/leads")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SetLeadsResource {

    @Inject
    private ISaveSetLeadsService saveSetLeadsService;

    @Inject
    private IGetSetLeadsService getSetLeadsService;

    @Inject
    private IUpdateSetLeadsService updateSetLeadsService;

    @Inject
    private IDeleteSetLeadsService deleteSetLeadsService;

    @Inject
    private SetLeadsDtoEntityMapper mapper;

    @POST
    public Response createSetLeads(SetLeadsRequestDto requestDto) {
        ESetLeadsRequest eSetLeadsRequest = mapper.dtoToEntity(requestDto);
        ESetLeadsResponse createdSetLeads = saveSetLeadsService.saveSetLeads(eSetLeadsRequest);
        return Response.status(Response.Status.CREATED)
                .entity(createdSetLeads)
                .build();
    }

    @GET
    public List<SetLeadsResponseDto> getAllSetLeads() {
        List<ESetLeadsResponse> allSetLeads = getSetLeadsService.getAllSetLeads();
        return allSetLeads.stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    public Response getSetLeadsById(@PathParam("id") Integer id) {
        ESetLeadsResponse setLeads = getSetLeadsService.getSetLeadsById(id);
        if (setLeads != null) {
            return Response.ok(setLeads).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response updateSetLeads(@PathParam("id") Integer id, SetLeadsRequestDto requestDto) {
        ESetLeadsRequest eSetLeadsRequest = mapper.dtoToEntity(requestDto);
        ESetLeadsResponse updatedSetLeads = updateSetLeadsService.updateSetLeads(id, eSetLeadsRequest);
        if (updatedSetLeads != null) {
            return Response.ok(updatedSetLeads).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteSetLeads(@PathParam("id") Integer id) {
        deleteSetLeadsService.deleteSetLeads(id);
        return Response.noContent().build();
    }
}
