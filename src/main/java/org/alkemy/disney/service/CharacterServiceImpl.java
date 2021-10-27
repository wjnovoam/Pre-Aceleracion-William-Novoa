package org.alkemy.disney.service;

import org.alkemy.disney.dto.CharacterBasicDto;
import org.alkemy.disney.dto.CharacterDetailsDto;
import org.alkemy.disney.entity.Character;
import org.alkemy.disney.entity.Movie;
import org.alkemy.disney.repository.CharacterRepository;
import org.alkemy.disney.service.interfaces.ICharacterService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CharacterServiceImpl implements ICharacterService {

    CharacterRepository characterRepository;
    ModelMapper modelMapper;

    public CharacterServiceImpl(CharacterRepository characterRepository, ModelMapper modelMapper) {
        this.characterRepository = characterRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<CharacterBasicDto> listAllCharacter() {
        List <Character> characters = characterRepository.findAll();
        if(characters.isEmpty()) return null;
        return characters.stream()
                .map( c -> new CharacterBasicDto(c.getId(), c.getUrlImage(), c.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public List<CharacterBasicDto> characterFiltersName(String name) {
        List <Character> characters = characterRepository.findByNameContaining(name);
        return characters.stream()
                    .map( c -> new CharacterBasicDto(c.getId(), c.getUrlImage(),  c.getName()))
                    .collect(Collectors.toList());
    }

    @Override
    public List<CharacterBasicDto> characterFiltersAge(Integer age) {
        List <Character> characters = characterRepository.findByAge(age);
        return characters.stream()
                .map( c -> new CharacterBasicDto(c.getId(), c.getUrlImage(), c.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public List<CharacterBasicDto> characterFiltersMovie(Integer idMovie) {
        List <Character> characters = characterRepository.findByMoviesContaining(idMovie);
        return characters.stream()
                .map( c -> new CharacterBasicDto(c.getId(), c.getUrlImage(), c.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public Character saveCharacter(CharacterDetailsDto characterDetailsDto) {
        Character character = modelMapper.map(characterDetailsDto, Character.class);
        return characterRepository.save(character);
    }

    @Override
    public CharacterDetailsDto getCharacterId(Long id) {
        Optional<Character> character = characterRepository.findById(id);
        if(character.isEmpty())return null;
        Character newCharacter = character.get();
        return modelMapper.map(newCharacter, CharacterDetailsDto.class);
    }

    @Override
    public Character updateCharacter(Long id, CharacterDetailsDto characterDetailsDto) {
        Optional<Character> character = characterRepository.findById(id);
        if(character.isEmpty())return null;

        character.get().setName(characterDetailsDto.getName());
        character.get().setUrlImage(characterDetailsDto.getUrlImage());
        character.get().setAge(characterDetailsDto.getAge());
        character.get().setWeight(characterDetailsDto.getWeight());
        character.get().setHistory(characterDetailsDto.getHistory());

        Character newCharacter = character.get();
        return characterRepository.save(newCharacter);
    }

    @Override
    public void deleteCharacter(Long id) {
        characterRepository.deleteById(id);
    }
}
