package com.literatura.challenge_2_back_literatura.models.records;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Media(
    @JsonAlias("image/jpeg") String imagen
){}
