package academy.devdojo.springboot.requests;

import lombok.Data;

@Data // o proprio lombok cria os metodos construtores  toString entre outros
public class AnimePostRequestBody {
    private String name;
}
