package com.autoclipper.si.app.mapper.clipmessagemapper;

import com.autoclipper.si.app.dto.client.MessageRequestDTO;
import com.autoclipper.si.app.mapper.setcustomermappers.SetCustomerDtoToEntityMapper;
import com.autoclipper.si.app.mapper.setvideomappers.SetVideoDtoToEntityMapper;
import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.IGetSetCustomerService;
import com.autoclipper.si.app.service.interfaces.setcustomerserviceinterface.IUpdateSetCustomerService;
import com.autoclipper.si.domain.entities.setcustomerentities.ESetCustomerRequest;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ClipMessageDtoToEntityMapper {
    @Inject
    private IGetSetCustomerService getSetCustomerService;
    @Inject
    private IUpdateSetCustomerService updateSetCustomerService;
    @Inject
    private SetCustomerDtoToEntityMapper mapperCustomer;
    @Inject
    private SetVideoDtoToEntityMapper mapperVideo;

    public ESetCustomerRequest dtoToEntityCustomer(MessageRequestDTO dto){

//        ESetCustomerResponse existingCustomer = getSetCustomerService.getSetCustomerById(dto.getCustomerId());
//
//        if (existingCustomer != null) {
//            return null;
//        }
//        else {
//        return ESetCustomerRequest.builder()
//                .customerName(dto.getCustomerId())
//                .customerPhone(dto.getPhoneNumber())
//                .build();
//        }
        return null;
   }



}
