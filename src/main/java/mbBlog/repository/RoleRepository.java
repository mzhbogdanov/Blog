package mbBlog.repository;

import mbBlog.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MARIO on 6.8.2017 г..
 */
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByName(String name);
}
