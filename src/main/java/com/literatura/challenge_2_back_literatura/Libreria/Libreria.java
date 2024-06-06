package com.literatura.challenge_2_back_literatura.Libreria;

import com.literatura.challenge_2_back_literatura.config.ConsumoApiGutendex;

public class Libreria {

    public void consumo(){
        ConsumoApiGutendex consumoApi = new ConsumoApiGutendex();
        var json = consumoApi.obtenerDatos("https://gutendex.com/books/?search=%20Romeo%20and%20Juliet");
        System.out.println(json);
    }

}
