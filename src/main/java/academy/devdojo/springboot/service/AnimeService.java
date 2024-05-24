package academy.devdojo.springboot.service;

import academy.devdojo.springboot.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

// Geralmente responsalvel pela regra de negocios
@Service
public class AnimeService {
    private List<Anime> animes = List.of(new Anime(1L,"One Piece"), new Anime(2L,"Berserk"),
            new Anime(3L,"Boku No Hero"));

    // private final AnimeRepository animeRepository;

    public List<Anime> listAll(){
        return animes;

    }

    public Anime findById(long id){
        return animes.stream()
                .filter(anime -> anime.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Anime not Found"));
    }
}
