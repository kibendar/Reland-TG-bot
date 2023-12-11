package bot.telegram.relandbot.models.repo;

import bot.telegram.relandbot.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {

}
