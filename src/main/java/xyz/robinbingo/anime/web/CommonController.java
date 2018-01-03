package xyz.robinbingo.anime.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Robin
 * @create 2017-12-25 18:44
 * @desc 通用接口
 **/
@Controller("/")
public class CommonController {

    @GetMapping("")
    public String index() {
        return "index";
    }
}
