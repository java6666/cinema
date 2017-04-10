package model.entity;

/**
 * Created by lenovo on 2017/4/10.
 * 影片语言
 */
public class Language {
    private Integer languageId;
    private String languageName;

    public Language() {
    }

    public Language(String languageName) {
        this.languageName = languageName;
    }

    public Language(Integer languageId, String languageName) {
        this.languageId = languageId;
        this.languageName = languageName;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }
}
