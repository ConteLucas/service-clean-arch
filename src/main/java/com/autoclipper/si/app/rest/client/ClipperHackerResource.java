package com.autoclipper.si.app.rest.client;

import com.autoclipper.si.app.dto.client.ClipperHackerRequestDTO;
import com.autoclipper.si.app.dto.client.TsuruResponseDTO;
import com.autoclipper.si.app.gateway.ITsuruRestClient;
import com.autoclipper.si.app.mapper.SetCustomerDtoEntityMapper;
import com.autoclipper.si.app.mapper.SetLeadsDtoEntityMapper;
import com.autoclipper.si.app.service.interfaces.ISaveSetCustomerService;
import com.autoclipper.si.app.service.interfaces.ISaveSetLeadsService;
import com.autoclipper.si.app.service.interfaces.IUpdateSetLeadsService;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("api/clip_message")
public class ClipperHackerResource {

    @Inject
    @RestClient
    ITsuruRestClient tsuruRestClient;
    @Inject
    private ISaveSetLeadsService saveSetLeadsService;
    @Inject
    private SetLeadsDtoEntityMapper mapper;

    @Inject
    private IUpdateSetLeadsService updateSetLeadsService;
    @Inject
    @ConfigProperty(name = "tsuru.api.key")
    String apiKeyTsuru;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response processClipperHackerRequest(ClipperHackerRequestDTO clipperHackerRequest){
        TsuruResponseDTO responseDTO = tsuruRestClient.requestClipsFromUrl(clipperHackerRequest, apiKeyTsuru);
       // ESetLeadsRequest eSetLeadsRequest = mapper.dtoToEntity(clipperHackerRequest);
       // ESetLeadsResponse createdSetLeads = updateSetLeadsService.updateSetLeads(1,eSetLeadsRequest);
        return Response.ok(responseDTO).build();
    }

}
