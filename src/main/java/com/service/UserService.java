package com.service;

import com.model.CurrentUserAndLoginUserModel;
import com.model.UserModel;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserService {

    UserModel userLogin(UserModel user) throws Exception;

    boolean userRegistration(UserModel user) throws Exception;

    UserModel findUserByMobile(String mobile);

    UserModel findUserByUserName(String userName);

}
