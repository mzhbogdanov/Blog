package mbBlog.repository;

import mbBlog.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MARIO on 7.8.2017 г..
 */


public interface CategoryRepository
        extends JpaRepository<Category, Integer>{
}
