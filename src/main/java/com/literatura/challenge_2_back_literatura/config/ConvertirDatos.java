package com.literatura.challenge_2_back_literatura.config;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.literatura.challenge_2_back_literatura.config.iConfig.IConvertirDatos;

public class ConvertirDatos implements IConvertirDatos {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T convertirDatosJsonAJava(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json, clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
