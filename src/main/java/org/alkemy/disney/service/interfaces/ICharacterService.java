package org.alkemy.disney.service.interfaces;

import org.alkemy.disney.dto.CharacterBasicDto;
import org.alkemy.disney.dto.CharacterDetailsDto;
import org.alkemy.disney.entity.Character;

import java.util.List;

public interface ICharacterService {
    List<CharacterBasicDto> listAllCharacter();
    Character saveCharacter(CharacterDetailsDto characterDetailsDto);
    CharacterDetailsDto getCharacterId(Long id);
    Character updateCharacter(Long id);
    void deleteCharacter(Long id);
}
