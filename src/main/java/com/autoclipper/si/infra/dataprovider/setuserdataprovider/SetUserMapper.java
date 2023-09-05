package com.autoclipper.si.infra.dataprovider.setuserdataprovider;

import com.autoclipper.si.domain.entities.setuserentities.ESetUserRequest;
import com.autoclipper.si.domain.entities.setuserentities.ESetUserResponse;
import com.autoclipper.si.infra.db.model.SetUser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@ApplicationScoped
public class SetUserMapper   {
    public SetUser eSetUserToSetUser(ESetUserRequest eSetUserRequest){
        if (Objects.nonNull(eSetUserRequest)) {
            SetUser setUser = SetUser.builder()
                    .userEmail(eSetUserRequest.getUserEmail())
                    .userPhone(eSetUserRequest.getUserPhone())
                    .userPassword(eSetUserRequest.getUserPassword())
                    .userType(eSetUserRequest.getUserType())
                    .build();
            return setUser;
        }
        throw new NullPointerException("NullPointerException set_user/SetUserMapper");
    }

    public ESetUserResponse eSetUserToESetUserResponse(SetUser setUser){
        if (Objects.nonNull(setUser)) {
            return ESetUserResponse.builder()
                    .userEmail(setUser.getUserEmail())
                    .userPhone(setUser.getUserPhone())
                    .userPassword(setUser.getUserPassword())
                    .userType(setUser.getUserType())
                    .build();
        }
        throw new NullPointerException("NullPointerException set_user/SetUserMapper");
    }

    public List<ESetUserResponse> setUserListToESetUserListResponseList(List<SetUser> all){
        return all.stream().map(this::eSetUserToESetUserResponse).collect(Collectors.toList());
    }

    public SetUser updateSetUserFromRequest(SetUser existingSetUser, ESetUserRequest eSetUserRequest) {
        existingSetUser.setUserEmail(eSetUserRequest.getUserEmail());
        existingSetUser.setUserPhone(eSetUserRequest.getUserPhone());
        existingSetUser.setUserPassword(eSetUserRequest.getUserPassword());
        existingSetUser.setUserType(eSetUserRequest.getUserType());
        return existingSetUser;
    }
}
