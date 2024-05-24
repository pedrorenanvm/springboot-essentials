package academy.devdojo.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // o lombok cria os construtores e os getters e setters toString sozinho
@AllArgsConstructor
// O Jackson faz o mapeando da classe e compara se o nome dos atributos da classe são iguais aos nomes dos
// atributos passados no arquivo JSON, se forem diferente o jackson vai ignorar
// Caso eu queira renomear esse atributo para que seja reocnhecido eu tenho que por uma @JsonProperty("nomeAtt") com o nome do att no JSON
public class Anime {
    private Long id;
    private String name;

}
