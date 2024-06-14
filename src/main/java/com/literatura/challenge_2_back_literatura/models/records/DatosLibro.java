package com.literatura.challenge_2_back_literatura.models;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(

        @JsonAlias("id") Long libroId,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors") List<Autor> authors, //@JsonAlias("authors") List<Author> authors,
        @JsonAlias("subjects") List<String> genero,
        @JsonAlias("languages") List<String> idioma,
        @JsonAlias("copyright") Boolean copyright,
        @JsonAlias("media_type") String tipoDocumento,
        @JsonAlias("formats") Media img, // @JsonAlias("formats") Formats formatos,
        @JsonAlias("download_count") Long cantidadDescargas
) {

}
