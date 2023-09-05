package com.autoclipper.si.app.controller.client;

import com.autoclipper.si.app.dto.client.ClipperHackerResponseDTO;
import com.autoclipper.si.app.dto.client.TsuruRequestDTO;
import com.autoclipper.si.app.gateway.IClipperHackerClient;
import com.autoclipper.si.app.mapper.setleadsmappers.SetLeadsDtoToEntityMapper;
import com.autoclipper.si.app.service.interfaces.setleadsserviceinterface.ISaveSetLeadsService;
import com.autoclipper.si.app.service.interfaces.setleadsserviceinterface.IUpdateSetLeadsService;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsRequest;
import com.autoclipper.si.domain.entities.setleadsentities.ESetLeadsResponse;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
@Path("api/tsuru_message")
public class TsuruRestController {

    @Inject
    @RestClient
    IClipperHackerClient clipperHackerClient;
    @Inject
    private IUpdateSetLeadsService updateSetLeadsService;
    @Inject
    private SetLeadsDtoToEntityMapper mapper;
    @ConfigProperty(name = "clipper.hacker.api.key")
    String apiKey;

    @Inject
    private ISaveSetLeadsService saveSetLeadsService;

    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response processTsuruRequest(TsuruRequestDTO tsuruRequest) {
        ESetLeadsRequest eSetLeadsRequest = mapper.dtoToEntity(tsuruRequest);
        ESetLeadsResponse createdSetLeads = saveSetLeadsService.saveSetLeads(eSetLeadsRequest);
        ClipperHackerResponseDTO responseDTO = clipperHackerClient.generateClipsFromUrl(tsuruRequest, apiKey);
        return Response.ok(responseDTO).build();
    }
}