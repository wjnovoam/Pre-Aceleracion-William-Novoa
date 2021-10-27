package org.alkemy.disney.service.interfaces;

import org.alkemy.disney.dto.CharacterBasicDto;
import org.alkemy.disney.dto.CharacterDetailsDto;
import org.alkemy.disney.entity.Character;

import java.util.List;

public interface ICharacterService {
    List<CharacterBasicDto> listAllCharacter();
    List<CharacterBasicDto> characterFiltersName(String name);
    List<CharacterBasicDto> characterFiltersAge(Integer age);
    List<CharacterBasicDto> characterFiltersMovie(Integer idMovie);
    Character saveCharacter(CharacterDetailsDto characterDetailsDto);
    CharacterDetailsDto getCharacterId(Long id);
    Character updateCharacter(Long id, CharacterDetailsDto characterDetailsDto);
    void deleteCharacter(Long id);
}
