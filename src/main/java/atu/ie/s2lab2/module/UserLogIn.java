package atu.ie.s2lab2.module;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLogIn {
    //Here I'm defining what keys and values I'm going to use
    //And I'm using the notations to not receive blank entries
    private Long id;

    @NotBlank(message = "Email required")
    private String email;

    @NotBlank(message = "Password required")
    private String password;
}
