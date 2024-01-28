package com.tweteroo.api.dtos;

import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TweetDTO {

    @Size(max = 280)
    private String text;
}