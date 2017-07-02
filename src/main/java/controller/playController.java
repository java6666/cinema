package controller;


import model.dao.PlayDao;
import model.entity.Play;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by HY_PC on 2017-4-11.
 */
@Controller
@RequestMapping(value = "/test")
public class playController {
    @Resource
    private PlayDao dao;
    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show(Model model){
        List<Play> plays = dao.selectAll();
        model.addAttribute("list",plays);
        return "/WEB-INF/play/playList.jsp";
    }

    /**
     * 添加信息
     * @return
     */
    @RequestMapping(value = "/addPlay",method = RequestMethod.GET)
    public String add(){
        return "/WEB-INF/play/playList.jsp";
    }

    @RequestMapping(value ="/addPlay",method = RequestMethod.POST)
    public String addPost(Integer playMovie,String playTime,Double playPrice) throws ParseException {
        Play play = new Play();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        play.setPlayMovie(playMovie);
        play.setPlayTime(sdf.parse(playTime));
        play.setPlayPrice(playPrice);
        dao.insertPlay(play);
        return "redirect:/test/show";
    }

    /**
     * 根据Id删除
     * @param playId
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(Integer playId){
        dao.deleteById(playId);
        return "redirect:/test/show";
    }

    /**
     * 根据id查询出来修改
     * @param playId
     * @param model
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String selectById(Integer playId,Model model){
     Play play = dao.selectById(playId);
        model.addAttribute("title",play);
        return "/WEB-INF/play/updateList.jsp";
    }
    /**
     * 修改
     * @param playId
     * @param playMovie
     * @param playTime
     * @param playPrice
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String updatePlay(Integer playId, Integer playMovie, String playTime, Double playPrice) throws ParseException {
        Play play = new Play();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        play.setPlayId(playId);
        play.setPlayPrice(playPrice);
        play.setPlayTime(sdf.parse(playTime));
        play.setPlayMovie(playMovie);
        dao.updatePlay(play);
        return "redirect:/test/show";
    }

}
