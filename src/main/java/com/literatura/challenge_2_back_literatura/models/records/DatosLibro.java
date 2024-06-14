package com.literatura.challenge_2_back_literatura.models.records;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(

        @JsonAlias("id") Long libroId,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<Autor> autor, //@JsonAlias("authors") List<Author> authors,
        @JsonAlias("subjects")  List<String> genero,
        @JsonAlias("languages") List<String> idioma,
        @JsonAlias("formats") Media imagen, // @JsonAlias("formats") Formats formatos,
        @JsonAlias("download_count") Long cantidadDescargas
)
{
}
