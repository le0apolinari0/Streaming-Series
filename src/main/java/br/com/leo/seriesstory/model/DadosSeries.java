package br.com.leo.seriesstory.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSeries(@JsonAlias("Title") String titulo ,
                          @JsonAlias("totalSeasons") Integer totalTemporadas,
                          @JsonAlias("imdbRating") String avaliacao) {
}
