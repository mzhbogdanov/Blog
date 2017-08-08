package mbBlog.repository;

import mbBlog.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MARIO on 7.8.2017 г..
 */


public interface TagRepository extends JpaRepository<Tag, Integer>{

    Tag findByName (String  name);
}
