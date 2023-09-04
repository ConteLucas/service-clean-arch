package com.autoclipper.si.app.gateway;

import com.autoclipper.si.app.dto.client.TsuruRequestDTO;
import jakarta.ws.rs.*;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient(configKey = "x-api-key")
public interface ITsuruRestClient {

    @POST
    @Path("/api/tsuru_endpoint")
    List<TsuruRequestDTO> getMessageTsuru();

}
