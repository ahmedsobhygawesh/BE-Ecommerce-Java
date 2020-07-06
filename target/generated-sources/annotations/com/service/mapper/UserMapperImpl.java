package com.service.mapper;

import com.model.UserModel;
import com.repository.entity.User;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-06T18:33:33+0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_221 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserModel toModel(User user) {
        if ( user == null ) {
            return null;
        }

        UserModel userModel = new UserModel();

        if ( user.getId() != null ) {
            userModel.setId( user.getId() );
        }
        userModel.setUserName( user.getUserName() );
        userModel.setFullName( user.getFullName() );
        userModel.setEmail( user.getEmail() );
        userModel.setMobile( user.getMobile() );
        userModel.setCity( user.getCity() );
        userModel.setCountry( user.getCountry() );
        userModel.setDetailedAddress( user.getDetailedAddress() );
        userModel.setPassword( user.getPassword() );
        userModel.setGender( user.getGender() );
        userModel.setNational_id( user.getNational_id() );

        return userModel;
    }

    @Override
    public User toEntity(UserModel user) {
        if ( user == null ) {
            return null;
        }

        User user1 = new User();

        user1.setId( user.getId() );
        user1.setUserName( user.getUserName() );
        user1.setFullName( user.getFullName() );
        user1.setEmail( user.getEmail() );
        user1.setMobile( user.getMobile() );
        user1.setCity( user.getCity() );
        user1.setCountry( user.getCountry() );
        user1.setDetailedAddress( user.getDetailedAddress() );
        user1.setPassword( user.getPassword() );
        user1.setGender( user.getGender() );
        user1.setNational_id( user.getNational_id() );

        return user1;
    }
}
