package academy.devdojo.springboot.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // o lombok cria os construtores e os getters e setters toString sozinho
@AllArgsConstructor
// O Jackson faz o mapeando da classe e compara se o nome dos atributos da classe são iguais aos nomes dos
// atributos passados no arquivo JSON, se forem diferente o jackson vai ignorar
// Caso eu queira renomear esse atributo para que seja reocnhecido eu tenho que por uma @JsonProperty("nomeAtt") com o nome do att no JSON
@NoArgsConstructor
@Entity
@Builder
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
