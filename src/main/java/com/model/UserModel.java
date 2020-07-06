package com.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class UserModel {

    private long id;
    private String userName;
    private String fullName;

    @NotBlank @Min(5)
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
