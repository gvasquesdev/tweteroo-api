package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserDTO {
    @NotBlank
    private String avatar;

    @NotBlank
    private String username;

}
