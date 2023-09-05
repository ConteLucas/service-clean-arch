package com.autoclipper.si.app.controller;

import com.autoclipper.si.app.dto.setcustomerclientdto.SetCustomerRequestDto;
import com.autoclipper.si.app.dto.setcustomerclientdto.SetCustomerResponseDto;
import com.autoclipper.si.app.mapper.setcustomermappers.SetCustomerDtoToEntityMapper;

import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.IDeleteSetCustomerService;
import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.IGetSetCustomerService;
import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.ISaveSetCustomerService;
import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.IUpdateSetCustomerService;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.stream.Collectors;

@Path("/customer")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SetCustomerController {

    @Inject
    private ISaveSetCustomerService saveSetCustomerService;

    @Inject
    private IGetSetCustomerService getSetCustomerService;

    @Inject
    private IUpdateSetCustomerService updateSetCustomerService;

    @Inject
    private IDeleteSetCustomerService deleteSetCustomerService;

    @Inject
    private SetCustomerDtoToEntityMapper mapper;

    @POST
    public Response createSetCustomer(SetCustomerRequestDto requestDto) {
        ESetCustomerRequest eSetCustomerRequest = mapper.dtoToEntity(requestDto);
        ESetCustomerResponse createdSetCustomer = saveSetCustomerService.saveSetCustomer(eSetCustomerRequest);
        return Response.status(Response.Status.CREATED)
                .entity(createdSetCustomer)
                .build();
    }


    @GET
    public List<SetCustomerResponseDto> getAllSetCustomers() {
        List<ESetCustomerResponse> allSetCustomers = getSetCustomerService.getAllSetCustomers();
        return allSetCustomers.stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    public Response getSetCustomerById(@PathParam("id") Integer id) {
        ESetCustomerResponse setCustomer = getSetCustomerService.getSetCustomerById(id);
        if (setCustomer != null) {
            return Response.ok(setCustomer).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response updateSetCustomer(@PathParam("id") Integer id, SetCustomerRequestDto requestDto) {
        ESetCustomerRequest eSetCustomerRequest = mapper.dtoToEntity(requestDto);
        ESetCustomerResponse updatedSetCustomer = updateSetCustomerService.updateSetCustomer(id, eSetCustomerRequest);
        if (updatedSetCustomer != null) {
            return Response.ok(updatedSetCustomer).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteSetCustomer(@PathParam("id") Integer id) {
        deleteSetCustomerService.deleteSetCustomer(id);
        return Response.noContent().build();
    }
}
