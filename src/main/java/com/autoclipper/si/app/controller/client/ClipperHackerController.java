package com.autoclipper.si.app.controller.client;

import com.autoclipper.si.app.dto.client.ClipperHackerRequestDTO;
import com.autoclipper.si.app.dto.client.TsuruResponseDTO;
import com.autoclipper.si.app.gateway.ITsuruRestClient;
import com.autoclipper.si.app.mapper.setleadsmappers.SetLeadsDtoToEntityMapper;
import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.IUpdateSetCustomerService;
import com.autoclipper.si.app.service.interfaces.setleadsserviceinterface.IUpdateSetLeadsService;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import com.autoclipper.si.infra.db.model.SetCustomer;
import com.autoclipper.si.infra.db.model.SetLeads;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("api/clip_message")
public class ClipperHackerController {

    @Inject
    @RestClient
    ITsuruRestClient tsuruRestClient;
    @Inject
    private SetLeadsDtoToEntityMapper mapper;

    @Inject
    private IUpdateSetLeadsService updateSetLeadsService;

    @Inject
    private IUpdateSetCustomerService updateSetCustomerService;
    @Inject
    @ConfigProperty(name = "tsuru.api.key")
    String apiKeyTsuru;

    @PUT
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response processClipperHackerRequest(ClipperHackerRequestDTO clipperHackerRequest){
        TsuruResponseDTO responseDTO = tsuruRestClient.requestClipsFromUrl(clipperHackerRequest, apiKeyTsuru);
        ESetLeadsRequest eSetLeadsRequest = mapper.dtoToEntity(clipperHackerRequest);
        ESetLeadsResponse createdSetLeads = updateSetLeadsService.updateSetLeads(1,eSetLeadsRequest);
        return Response.ok(responseDTO).build();
    }

//    @PUT
//    @Path("{customerPhone}")
//    public Response updateLeads (@PathParam("customerPhone") String customerPhone, SetCustomer setCustomer){
//
//        TsuruResponseDTO responseDTO = tsuruRestClient.requestClipsFromUrl(customerPhone, setCustomer);
//
//        return Response.ok().build();
//    }

}
