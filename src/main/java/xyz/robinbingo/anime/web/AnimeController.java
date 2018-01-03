package xyz.robinbingo.anime.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.robinbingo.anime.model.TAnime;
import xyz.robinbingo.anime.model.TAnimeExample;
import xyz.robinbingo.anime.service.TAnimeService;

import java.util.List;

/**
 * @author Robin
 * @create 2018-01-02 15:16
 * @desc
 **/
@Controller
@RequestMapping("/anime")
public class AnimeController {

    @Autowired
    private TAnimeService animeService;

    @GetMapping("/list")
    public String list(Model model) {
        List<TAnime> animeList = animeService.selectByExample(new TAnimeExample());
        model.addAttribute("animeList", animeList);
        return "anime/list";
    }

    @GetMapping("/toEdit")
    public String toEdit(Integer id, Model model) {
        if (id != null) {
            TAnime anime = animeService.selectByPrimaryKey(id);
            model.addAttribute("anime", anime);
        }
        return "anime/edit";
    }

    @PostMapping("/edit")
    public String edit(TAnime anime, BindingResult bindingResult) {
        animeService.updateByPrimaryKeySelective(anime);
        return "redirect:/anime/list";
    }

    @GetMapping("/toAdd")
    public String toAdd() {
        return "anime/add";
    }

    @PostMapping("/add")
    public String add(TAnime anime, BindingResult bindingResult) {
        animeService.insert(anime);
        return "redirect:/anime/list";
    }

    @GetMapping("/delete")
    public String delete(Integer id) {
        animeService.deleteByPrimaryKey(id);
        return "redirect:/anime/list";
    }
}
