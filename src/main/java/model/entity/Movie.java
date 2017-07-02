package model.entity;

import java.util.Date;

/**
 * Created by lenovo on 2017/4/10.
 * 影片信息
 */
public class Movie {
    private Integer movieId;
    private String movieName;
    private String movieDirector;
    private String movieActor;
    private String movieInfo;
    private Integer movieKind;
    private String moviePhoto;
    private Integer movieLong;
    private Date movieDate;
    private Integer movieEdition;

    public Integer getMovieLanguage() {
        return movieLanguage;
    }

    public void setMovieLanguage(Integer movieLanguage) {
        this.movieLanguage = movieLanguage;
    }

    private Integer movieLanguage;

    public Movie() {
    }

    public Movie(String movieName, String movieDirector, String movieActor, String movieInfo, Integer movieKind, String moviePhoto, Integer movieLong, Date movieDate, Integer movieEdition) {
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieActor = movieActor;
        this.movieInfo = movieInfo;
        this.movieKind = movieKind;
        this.moviePhoto = moviePhoto;
        this.movieLong = movieLong;
        this.movieDate = movieDate;
        this.movieEdition = movieEdition;
    }

    public Movie(Integer movieId, String movieName, String movieDirector, String movieActor, String movieInfo, Integer movieKind, String moviePhoto, Integer movieLong, Date movieDate, Integer movieEdition) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieDirector = movieDirector;
        this.movieActor = movieActor;
        this.movieInfo = movieInfo;
        this.movieKind = movieKind;
        this.moviePhoto = moviePhoto;
        this.movieLong = movieLong;
        this.movieDate = movieDate;
        this.movieEdition = movieEdition;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public String getMovieActor() {
        return movieActor;
    }

    public void setMovieActor(String movieActor) {
        this.movieActor = movieActor;
    }

    public String getMovieInfo() {
        return movieInfo;
    }

    public void setMovieInfo(String movieInfo) {
        this.movieInfo = movieInfo;
    }

    public Integer getMovieKind() {
        return movieKind;
    }

    public void setMovieKind(Integer movieKind) {
        this.movieKind = movieKind;
    }

    public String getMoviePhoto() {
        return moviePhoto;
    }

    public void setMoviePhoto(String moviePhoto) {
        this.moviePhoto = moviePhoto;
    }

    public Integer getMovieLong() {
        return movieLong;
    }

    public void setMovieLong(Integer movieLong) {
        this.movieLong = movieLong;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }

    public Integer getMovieEdition() {
        return movieEdition;
    }

    public void setMovieEdition(Integer movieEdition) {
        this.movieEdition = movieEdition;
    }
}
