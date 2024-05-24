package academy.devdojo.springboot.controller;

import academy.devdojo.springboot.domain.Anime;
import academy.devdojo.springboot.service.AnimeService;
import academy.devdojo.springboot.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;
// Sem lógica de negocio
@RestController // ela tem a @ResponseBody e faz com que todos os retornos dos métodos dessa classe retornam Strings,depois vamos transforma-las em JSON
@RequestMapping("animes") // Mapea os end-points geralmente declarado no plural
@Log4j2
//@AllArgsConstructor // lombok cria um construtor com todos os atributos que a classe possui
@RequiredArgsConstructor // cria um construtor com todos os atributos que sõa finais
public class AnimeController {
    private final DateUtil dateUtil;
    private final AnimeService animeService;


    //localhost:8080/anime/list
    @GetMapping
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now())); // exibe a localdatetime na execução do spring
        return animeService.listAll();
    }
}
