package model.entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/4/10.
 * 影片场次
 */
public class Play {
    private Integer playId;
    private Integer playMovie;
    private Date playTime;
    private Double playPrice;

    public Play() {
    }

    public Play(Integer playMovie, Date playTime, Double playPrice) {
        this.playMovie = playMovie;
        this.playTime = playTime;
        this.playPrice = playPrice;
    }

    public Play(Integer playId, Integer playMovie, Date playTime, Double playPrice) {
        this.playId = playId;
        this.playMovie = playMovie;
        this.playTime = playTime;
        this.playPrice = playPrice;
    }

    public Integer getPlayId() {
        return playId;
    }

    public void setPlayId(Integer playId) {
        this.playId = playId;
    }

    public Integer getPlayMovie() {
        return playMovie;
    }

    public void setPlayMovie(Integer playMovie) {
        this.playMovie = playMovie;
    }

    public Date getPlayTime() {
        return playTime;
    }

    public void setPlayTime(Date playTime) {
        this.playTime = playTime;
    }

    public Double getPlayPrice() {
        return playPrice;
    }

    public void setPlayPrice(Double playPrice) {
        this.playPrice = playPrice;
    }
}
