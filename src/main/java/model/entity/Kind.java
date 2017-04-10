package model.entity;

/**
 * Created by lenovo on 2017/4/10.
 * 影片类别
 */
public class Kind {
    private Integer kindId;
    private String kindName;

    public Kind() {
    }

    public Kind(String kindName) {
        this.kindName = kindName;
    }

    public Kind(Integer kindId, String kindName) {
        this.kindId = kindId;
        this.kindName = kindName;
    }

    public Integer getKindId() {
        return kindId;
    }

    public void setKindId(Integer kindId) {
        this.kindId = kindId;
    }

    public String getKindName() {
        return kindName;
    }

    public void setKindName(String kindName) {
        this.kindName = kindName;
    }
}
