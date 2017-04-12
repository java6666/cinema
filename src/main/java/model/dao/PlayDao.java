package model.dao;

import model.entity.Play;

import java.util.List;

/**
 * Created by HY_PC on 2017-4-11.
 */
public interface PlayDao {
    //增加
    void insertPlay(Play play);
    //查询所有
    List<Play> selectAll();
    //删除
    void deleteById(Integer playId);
    //修改
    Play selectById(Integer playId);
    void updatePlay(Play play);

}
