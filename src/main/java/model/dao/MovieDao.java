package model.dao;


import model.entity.Movie;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by HY_PC on 2017-4-12.
 */
public interface MovieDao {
    //增加
    void insertMovie(Movie movie);
    //查询所有
    List<Movie> selectAll();
    //删除
    void deleteById(Integer movieId);
    //修改
    Movie selectById(Integer movieId);
    void updateMovie(Movie movie);
    //模糊查询
    List<Movie> queryMovie(Movie movie);
    //分页查询
    List<Map> findByPage(Map<String, Object> map);
}
