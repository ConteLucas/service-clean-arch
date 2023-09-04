package com.autoclipper.si.app.rest.client;

import com.autoclipper.si.app.dto.client.ClipperHackerResponseDTO;
import com.autoclipper.si.app.dto.client.TsuruRequestDTO;
import com.autoclipper.si.app.gateway.IClipperHackerClient;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
@Path("/tsuru")
public class TsuruRestResource {

    @Inject
    @RestClient
    IClipperHackerClient clipperHackerClient;

    @ConfigProperty(name = "clipper.hacker.api.key") // Suponha que você tenha configurado a chave no application.properties
    String apiKey;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response processTsuruRequest(TsuruRequestDTO tsuruRequest) {
        // Realize qualquer validação ou manipulação necessária nos dados recebidos

        // Envie os dados para o serviço ClipperHacker e passe a chave de autenticação
        ClipperHackerResponseDTO responseDTO = clipperHackerClient.generateClipsFromUrl(tsuruRequest, apiKey);

        // Retorne a resposta do serviço ClipperHacker
        return Response.ok(responseDTO).build();
    }
}