package org.frontend.testing.demo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterNewUserData {

    private String firstName;
    private String lastName;
    private String userName;
    private String password;

}
