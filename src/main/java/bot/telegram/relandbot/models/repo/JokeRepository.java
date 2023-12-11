package bot.telegram.relandbot.models.repo;

import bot.telegram.relandbot.models.Joke;
import org.springframework.data.repository.CrudRepository;

public interface JokeRepository extends CrudRepository<Joke, Integer> {


}
