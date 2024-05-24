package academy.devdojo.springboot.service;

import academy.devdojo.springboot.domain.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// Geralmente responsalvel pela regra de negocios
@Service
public class AnimeService {
    private static List<Anime> animes;

    static { // instancia os objetos dentro da lista, antes de tudo, torna essa lista estatica pertencendo a classe
        animes = new ArrayList<>( List.of(new Anime(1L,"One Piece"), new Anime(2L,"Berserk"),
                new Anime(3L,"Boku No Hero")));
    }

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

    public Anime save(Anime anime) {
        anime.setId(ThreadLocalRandom.current().nextLong(4,1000000));
        animes.add(anime);
        return anime;
    }

    public void delete(long id) {
        animes.remove(findById(id));
    }
}
