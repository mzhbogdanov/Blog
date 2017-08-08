package mbBlog.controller;

import mbBlog.entity.Article;
import mbBlog.entity.Category;
import mbBlog.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Set;

/**
 * Created by MARIO on 6.8.2017 г..
 */
@Controller
public class HomeController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/")
    public  String index(Model model){
        List<Category> categories =this.categoryRepository.findAll();

        model.addAttribute("view", "home/index");
        model.addAttribute("categories", categories);
        return "base-layout";

    }

    public String accessDenied(Model model){
        model.addAttribute("view", "error/403");

        return "base-layout";
    }

    public String listArticles(Model model, @PathVariable Integer id) {

        model.addAttribute("view", "home/list-articles");

        if (!this.categoryRepository.exists(id)) {
            return "redirect:/";
        }

        Category category = this.categoryRepository.findOne(id);
        Set<Article> articles = category.getArticles();

        model.addAttribute("articles", articles);
        model.addAttribute("category", category);

        return "base-layout";
    }
}
