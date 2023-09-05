package com.autoclipper.si.app.controller;

import com.autoclipper.si.app.dto.setleadsclientdto.SetLeadsRequestDto;
import com.autoclipper.si.app.dto.setleadsclientdto.SetLeadsResponseDto;
import com.autoclipper.si.app.mapper.setleadsmappers.SetLeadsDtoToEntityMapper;
import com.autoclipper.si.app.service.cross.MessageSucess;
import com.autoclipper.si.app.service.interfaces.setleadsserviceinterface.IDeleteSetLeadsService;
import com.autoclipper.si.app.service.interfaces.setleadsserviceinterface.IGetSetLeadsService;
import com.autoclipper.si.app.service.interfaces.setleadsserviceinterface.ISaveSetLeadsService;
import com.autoclipper.si.app.service.interfaces.setleadsserviceinterface.IUpdateSetLeadsService;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Path("/leads")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SetLeadsController {

    @Inject
    private ISaveSetLeadsService saveSetLeadsService;

    @Inject
    private IGetSetLeadsService getSetLeadsService;

    @Inject
    private IUpdateSetLeadsService updateSetLeadsService;

    @Inject
    private IDeleteSetLeadsService deleteSetLeadsService;

    @Inject
    private SetLeadsDtoToEntityMapper mapper;

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createSetLeads(@Valid SetLeadsRequestDto requestDto) {
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
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @APIResponses(value = {
        @APIResponse(responseCode = "200", description = "Lead ID não encontrado."),
            @APIResponse(responseCode = "200", description = "Lead ID deletado com sucesso.")
    })
    @Path("/{id}")
    public Response deleteSetLeads(@PathParam("id") Integer id) {
        deleteSetLeadsService.delete(id);
        return Response.status(Response.Status.OK)
                .entity(MessageSucess.builder()
                        .timestamp(LocalDateTime.now()).build())
                        .build();
    }
}
