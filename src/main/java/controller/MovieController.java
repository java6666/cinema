
package controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import model.dao.MovieDao;
import model.entity.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
public class MovieController {
    @Resource
    private MovieDao moviedao;
    @RequestMapping(value = "/showMovie",method = RequestMethod.GET)
    public String showMovie(Model model){
        List<Movie> movies = moviedao.selectAll();
        model.addAttribute("list",movies);
        return "/WEB-INF/movie/movieList.jsp";
    }

/**
     * 添加
     * @return
     */
    @RequestMapping(value = "/addMovie",method = RequestMethod.GET)
    public String addMovie(){
        return "/WEB-INF/movie/movieList.jsp";
    }

    @RequestMapping(value ="/addMovie",method = RequestMethod.POST)
    public String addMovie(String movieName, String movieDirector, String movieActor,
                          String movieInfo, Integer movieKind, String moviePhoto, Integer movieLong,
                          String movieDate, Integer movieEdition, Integer movieLanguage) throws ParseException, ParseException {
        Movie movie=new Movie();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        movie.setMovieActor(movieActor);
        movie.setMovieDate(sdf.parse(movieDate));
        movie.setMovieDirector(movieDirector);
        movie.setMovieEdition(movieEdition);
        movie.setMovieInfo(movieInfo);
        movie.setMovieLong(movieLong);
        movie.setMovieKind(movieKind);
        movie.setMovieLanguage(movieLanguage);
        movie.setMovieName(movieName);
        movie.setMoviePhoto(moviePhoto);
        moviedao.insertMovie(movie);
        return "redirect:/showMovie";
    }
/**
     * 根据Id删除
     * @param movieId
     * @return
     */


    @RequestMapping(value = "/deleteMovie",method = RequestMethod.GET)
    public String deleteMovie(Integer movieId){
        moviedao.deleteById(movieId);
        return "redirect:/showMovie";
    }



/**
     * 根据Id 查出来修改
     * @param movieId
     * @param model
     * @return
     */


    @RequestMapping(value = "/updateMovie",method = RequestMethod.GET)
    public String selectById(Integer movieId ,Model model){
        Movie movie = moviedao.selectById(movieId);
        model.addAttribute("title",movie);
        return "/WEB-INF/movie/updateList.jsp";
    }



/**
     * 修改
     * @param movieId
     * @param movieName
     * @param movieDirector
     * @param movieActor
     * @param movieInfo
     * @param movieKind
     * @param moviePhoto
     * @param movieLong
     * @param movieDate
     * @param movieEdition
     * @param movieLanguage
     * @return
     */

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String updateMovie(Integer movieId, String movieName, String movieDirector,
                             String movieActor, String movieInfo, Integer movieKind, String moviePhoto,
                             Integer movieLong, String movieDate, Integer movieEdition, Integer movieLanguage) throws ParseException {
        Movie movie=new Movie();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        movie.setMovieId(movieId);
        movie.setMovieActor(movieActor);
        movie.setMovieDate(sdf.parse(movieDate));
        movie.setMovieDirector(movieDirector);
        movie.setMovieEdition(movieEdition);
        movie.setMovieInfo(movieInfo);
        movie.setMovieLong(movieLong);
        movie.setMovieKind(movieKind);
        movie.setMovieLanguage(movieLanguage);
        movie.setMovieName(movieName);
        movie.setMoviePhoto(moviePhoto);
        moviedao.updateMovie(movie);
        return "redirect:/showMovie";
    }

    /**
     * 模糊查询电影名称
     * @param movieName
     * @param model
     * @return
     */
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public String QueryMovie(String movieName,Model model,Integer page){
        Movie movie = new Movie();
        if (movieName!=null&&!movieName.isEmpty()){
            movie.setMovieName("%"+movieName+"%");
        }
        if (page==null){
            PageHelper.startPage(1,3);
        }else {
            PageHelper.startPage(page,3);
        }
        List<Movie> movies = moviedao.queryMovie(movie);
        PageInfo pageInfo = new PageInfo<>(movies);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("list",movies);
        model.addAttribute("movieName",movieName);

        return "/WEB-INF/movie/movieList.jsp";
    }
}


