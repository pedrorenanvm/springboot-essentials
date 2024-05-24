package academy.devdojo.springboot.service;

import academy.devdojo.springboot.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

// Geralmente responsalvel pela regra de negocios
@Service
public class AnimeService {

    // private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return List.of(new Anime(1L,"One Piece"), new Anime(2L,"Berserk"),
                new Anime(3L,"Boku No Hero"));
    }
}
