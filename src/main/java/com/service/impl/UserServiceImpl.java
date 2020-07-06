package com.service.impl;

import com.model.CurrentUserAndLoginUserModel;
import com.model.UserModel;
import com.repository.UserRepository;
import com.repository.entity.User;
import com.service.UserService;
import com.service.mapper.UserMapper;
import com.util.HashingPasswordUtil;
import com.util.JwtTokenUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired UserRepository userRepository;
    @Autowired UserMapper userMapper;
    @Autowired JwtTokenUtil jwtTokenUtil;
    private static final Logger LOGGER = LogManager.getLogger(UserServiceImpl.class);


    @Override
    public UserModel userLogin(UserModel user) throws Exception {
        User existUser;
        String hashedPassword = getHashedPassword(user);
        String token = generateToken(user);
        try {
            existUser = userRepository.findUserByMobileAndPassword(user.getMobile(), hashedPassword);
            if (existUser == null)
                throw new Exception("Not Found");
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            throw new Exception("Fail");
        }
        user = mapUserForReturnWithTokenWithoutPassword(existUser, token);
        return user;
    }

    @Override
    public boolean userRegistration(UserModel user) throws Exception {
        User usr = userMapper.toEntity(user);
        hashingUserPassword(usr);
        try {
            userRepository.save(usr);
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            throw new Exception("Fail");
        }
        return true;
    }

    private void hashingUserPassword(User usr) {
        usr.setPassword(HashingPasswordUtil.hashPassword(usr.getPassword(), usr.getMobile()));
    }

    private String getHashedPassword(UserModel user) {
        return HashingPasswordUtil.hashPassword(user.getPassword(), user.getMobile());
    }


    private String generateToken(UserModel userData) {
        CurrentUserAndLoginUserModel user = new CurrentUserAndLoginUserModel();
        return jwtTokenUtil.generateToken(userData);
    }

    private UserModel mapUserForReturnWithTokenWithoutPassword(User existUser, String token) {
        UserModel user;
        user = userMapper.toModel(existUser);
        user.setPassword(null);
        user.setToken(token);
        return user;
    }

    @Override
    public UserModel findUserByMobile(String mobile) {
        return userMapper.toModel(userRepository.findUserByMobile(mobile));
    }

    @Override
    public UserModel findUserByUserName(String userName) {
        return userMapper.toModel(userRepository.findUserByUserName(userName));
    }

}