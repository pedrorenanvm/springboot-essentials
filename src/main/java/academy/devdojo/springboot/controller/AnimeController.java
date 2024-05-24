package academy.devdojo.springboot.controller;

import academy.devdojo.springboot.domain.Anime;
import academy.devdojo.springboot.service.AnimeService;
import academy.devdojo.springboot.util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<Anime>> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now())); // exibe a localdatetime na execução do spring
        return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK);
        // Além de retornar a lista é interessante retornar algumas insformações sobre a consulta
        // Utilizando ResponseEntity, conseguimos retornar mais algumas informações
        // Como o status da requisição http(get)
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Anime> findById(@PathVariable long id){
        return ResponseEntity.ok(animeService.findById(id));
    }
    @PostMapping //Vamos retornar o objeto
    public ResponseEntity<Anime> save(@RequestBody Anime anime){
        return new ResponseEntity<>(animeService.save(anime), HttpStatus.CREATED);
    }
}
