package com.service.mapper;

import com.model.UserModel;
import com.repository.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserModel toModel(User user);
    User toEntity(UserModel user);

}
