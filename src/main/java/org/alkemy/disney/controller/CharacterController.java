package org.alkemy.disney.controller;

import org.alkemy.disney.dto.CharacterBasicDto;
import org.alkemy.disney.dto.CharacterDetailsDto;
import org.alkemy.disney.service.interfaces.ICharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/characters")
@CrossOrigin("*")
public class CharacterController {

    ICharacterService iCharacterService;

    public CharacterController(ICharacterService iCharacterService) {
        this.iCharacterService = iCharacterService;
    }

    //Listado de personajes
    @GetMapping
    public ResponseEntity<List<CharacterBasicDto>> listCharacter(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "age",required = false) Integer age,
            @RequestParam(value = "idMovie", required = false) Integer idMovie){

        List<CharacterBasicDto> listCharacters;

        if(name != null){
            listCharacters = iCharacterService.characterFiltersName(name);
        }else if(age != null){
            listCharacters = iCharacterService.characterFiltersAge(age);
        } else if(idMovie != null){
            listCharacters = iCharacterService.characterFiltersMovie(idMovie);
        }else{
            listCharacters = iCharacterService.listAllCharacter();
        }
        return new ResponseEntity<>(listCharacters ,HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<CharacterDetailsDto> findDetailsCharacter(@PathVariable Long id){
        CharacterDetailsDto character = iCharacterService.getCharacterId(id);
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createCharacter(@RequestBody CharacterDetailsDto characterDetailsDto){
        return new ResponseEntity<>(iCharacterService.saveCharacter(characterDetailsDto), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCharacter(@PathVariable Long id,@RequestBody CharacterDetailsDto characterDetailsDto){
        return new ResponseEntity<>(iCharacterService.updateCharacter(id, characterDetailsDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCharacter(@PathVariable Long id){
        iCharacterService.deleteCharacter(id);
        return new ResponseEntity<>("Character eliminado correctamente",HttpStatus.OK);
    }
}
