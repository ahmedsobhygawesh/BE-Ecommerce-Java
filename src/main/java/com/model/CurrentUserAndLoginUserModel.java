package com.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CurrentUserAndLoginUserModel {

    private long id;
    private String userName;
    private String fullName;
    private String email;
    private String mobile;
    private String city;
    private String country;
    private String detailedAddress;
    private String password;
    private String gender;
    private String national_id;
    private String token;
}
