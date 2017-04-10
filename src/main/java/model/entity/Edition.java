package model.entity;

/**
 * Created by lenovo on 2017/4/10.
 * 影片版本
 */
public class Edition {
    private Integer editionId;
    private String editionName;

    public Edition() {
    }

    public Edition(String editionName) {
        this.editionName = editionName;
    }

    public Edition(Integer editionId, String editionName) {
        this.editionId = editionId;
        this.editionName = editionName;
    }

    public Integer getEditionId() {
        return editionId;
    }

    public void setEditionId(Integer editionId) {
        this.editionId = editionId;
    }

    public String getEditionName() {
        return editionName;
    }

    public void setEditionName(String editionName) {
        this.editionName = editionName;
    }
}
