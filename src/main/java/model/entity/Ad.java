package model.entity;

/**
 * Created by lenovo on 2017/4/10..
 * 广告
 */
public class Ad {
    private Integer adId;
    private String adImg;
    private String adHref;

    public Ad() {
    }

    public Ad(String adImg, String adHref) {
        this.adImg = adImg;
        this.adHref = adHref;
    }

    public Ad(Integer adId, String adImg, String adHref) {
        this.adId = adId;
        this.adImg = adImg;
        this.adHref = adHref;
    }

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdImg() {
        return adImg;
    }

    public void setAdImg(String adImg) {
        this.adImg = adImg;
    }

    public String getAdHref() {
        return adHref;
    }

    public void setAdHref(String adHref) {
        this.adHref = adHref;
    }
}
