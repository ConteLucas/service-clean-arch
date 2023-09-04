package com.autoclipper.si.app.rest.client;

import com.autoclipper.si.app.dto.client.ClipperHackerResponseDTO;
import com.autoclipper.si.app.dto.client.TsuruRequestDTO;
import com.autoclipper.si.app.gateway.IClipperHackerClient;
import com.autoclipper.si.app.mapper.SetCustomerDtoEntityMapper;
import com.autoclipper.si.app.mapper.SetLeadsDtoEntityMapper;
import com.autoclipper.si.app.service.interfaces.ISaveSetCustomerService;
import com.autoclipper.si.app.service.interfaces.ISaveSetLeadsService;
import com.autoclipper.si.app.service.interfaces.IUpdateSetLeadsService;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
@Path("api/tsuru_message")
public class TsuruRestResource {

    @Inject
    @RestClient
    IClipperHackerClient clipperHackerClient;
    @Inject
    private IUpdateSetLeadsService updateSetLeadsService;
    @Inject
    private SetLeadsDtoEntityMapper mapper;
    @ConfigProperty(name = "clipper.hacker.api.key")
    String apiKey;

    @Inject
    private ISaveSetLeadsService saveSetLeadsService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response processTsuruRequest(TsuruRequestDTO tsuruRequest) {
        ClipperHackerResponseDTO responseDTO = clipperHackerClient.generateClipsFromUrl(tsuruRequest, apiKey);
        ESetLeadsRequest eSetLeadsRequest = mapper.dtoToEntity(tsuruRequest);
        ESetLeadsResponse createdSetLeads = saveSetLeadsService.saveSetLeads(eSetLeadsRequest);
        return Response.ok(responseDTO).build();
    }
}