package guru.springframework.joke.jokeapp.controllers;

import guru.springframework.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class JokeController {

    private JokeService jokeService;

//    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", "/norris"})
    public ModelAndView showJoke() {

        ModelAndView mav = new ModelAndView();
        mav.setViewName("chucknorris");

        mav.addObject("joke", jokeService.getJoke());
        return mav;
    }
}
