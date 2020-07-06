package com.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class JwtRequest implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;
    private String username;
    private String password;

    public JwtRequest(String username, String password) {
        this.username = username;
        this.password =password;
    }


}
