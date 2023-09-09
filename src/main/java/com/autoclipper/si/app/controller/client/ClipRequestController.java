package com.autoclipper.si.app.controller.client;

import com.autoclipper.si.app.dto.client.MessageRequestDTO;
import com.autoclipper.si.app.gateway.IClipperHackerClient;
import com.autoclipper.si.app.mapper.clipmessagemapper.ClipMessageDtoToEntityMapper;
import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.ISaveSetCustomerService;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerResponse;
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

@Path("api/clip_request")
public class ClipRequestController {

    @Inject
    @RestClient
    IClipperHackerClient clipperHackerClient;
    @Inject
    private ISaveSetCustomerService saveSetCustomerService;
    @Inject
    private ClipMessageDtoToEntityMapper dtoToEntityMapper;
    @ConfigProperty(name = "clipper.hacker.api.key")
    String apiKey;
    @POST
    @Transactional
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response processTsuruRequest(MessageRequestDTO messageRequestDTO) {
        //ClipRequestDTO responseDTO = clipperHackerClient.generateClipsFromUrl(messageRequestDTO, apiKey);
        ESetCustomerRequest eSetCustomerRequest = dtoToEntityMapper.dtoToEntityCustomer(messageRequestDTO);
        ESetCustomerResponse createdSetCustomer = saveSetCustomerService.saveSetCustomer(eSetCustomerRequest);
        return Response.ok(createdSetCustomer).build();
        //return Response.ok(responseDTO).build();
    }
}
