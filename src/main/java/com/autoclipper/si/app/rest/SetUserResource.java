package com.autoclipper.si.app.rest;

import com.autoclipper.si.app.dto.SetUserRequestDto;
import com.autoclipper.si.app.dto.SetUserResponseDto;
import com.autoclipper.si.app.mapper.SetUserDtoEntityMapper;
import com.autoclipper.si.app.service.interfaces.*;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.stream.Collectors;

@Path("/user")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SetUserResource {

    @Inject
    private ISaveSetUserService saveSetUserService;

    @Inject
    private IGetSetUserService getSetUserService;

    @Inject
    private IUpdateSetUserService updateSetUserService;

    @Inject
    private IDeleteSetUserService deleteSetUserService;

    @Inject
    private SetUserDtoEntityMapper mapper;

    @POST
    public Response createSetUser(SetUserRequestDto requestDto) {
        ESetUserRequest eSetUserRequest = mapper.dtoToEntity(requestDto);
        ESetUserResponse createdSetUser = saveSetUserService.saveSetUser(eSetUserRequest);
        return Response.status(Response.Status.CREATED)
                .entity(createdSetUser)
                .build();
    }

    @GET
    public List<SetUserResponseDto> getAllSetUsers() {
        List<ESetUserResponse> allSetUsers = getSetUserService.getAllSetUsers();
        return allSetUsers.stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    public Response getSetUserById(@PathParam("id") Integer id) {
        ESetUserResponse setUser = getSetUserService.getSetUserById(id);
        if (setUser != null) {
            return Response.ok(setUser).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @PUT
    @Path("/{id}")
    public Response updateSetUser(@PathParam("id") Integer id, SetUserRequestDto requestDto) {
        ESetUserRequest eSetUserRequest = mapper.dtoToEntity(requestDto);
        ESetUserResponse updatedSetUser = updateSetUserService.updateSetUser(id, eSetUserRequest);
        if (updatedSetUser != null) {
            return Response.ok(updatedSetUser).build();
        } else {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Path("/{id}")
    public Response deleteSetUser(@PathParam("id") Integer id) {
        deleteSetUserService.deleteSetUser(id);
        return Response.noContent().build();
    }
}
