package mbBlog.bindingModel;

import javax.validation.constraints.NotNull;

/**
 * Created by MARIO on 6.8.2017 г..
 */


public class ArticleBindingModel {

    @NotNull
    private String title;

    @NotNull
    private String content;

    private Integer categoryId;

    private  String tagString;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public Integer getCategoryId() { return categoryId; }

    public void setCategoryId(Integer categoryId) { this.categoryId = categoryId; }

    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }
}
