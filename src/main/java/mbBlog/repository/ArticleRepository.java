package mbBlog.repository;

import mbBlog.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by MARIO on 6.8.2017 г..
 */

public interface ArticleRepository extends JpaRepository<Article, Integer> {
}
