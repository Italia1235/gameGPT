package ru.rasulov.game.repostitory;

import org.springframework.data.repository.CrudRepository;
import ru.rasulov.game.model.Film;

public interface FilmRepository extends CrudRepository <Film,Long> {
   Film getFilmByName(String name);
}
