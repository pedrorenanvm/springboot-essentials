package academy.devdojo.springboot.repository;

import academy.devdojo.springboot.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
                                                        //Passo a classe e o tipo do atributo ID
public interface AnimeRepository extends JpaRepository<Anime, Long> {
}
