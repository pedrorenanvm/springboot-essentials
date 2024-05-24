package academy.devdojo.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // o lombok cria os construtores e os getters e setters toString sozinho
@AllArgsConstructor

public class Anime {
    private Long id;
    private String name;

}
