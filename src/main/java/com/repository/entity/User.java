package com.repository.entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "USER")
public class User {

    //mysql don't support sequences so use table generation strategy
    //hibernate support in 5 (table type instead of identifier)
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "ID", updatable = false, nullable = false)
    @Id
    private Long id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "FULL_NAME")
    private String fullName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "DETAILED_ADDRESS")
    private String detailedAddress;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "NATIONAL_ID")
    private String national_id;

}
