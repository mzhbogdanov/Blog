package mbBlog.repository;

import mbBlog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MARIO on 6.8.2017 г..
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByEmail(String email);
}
