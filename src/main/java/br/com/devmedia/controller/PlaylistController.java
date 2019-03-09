package br.com.devmedia.controller;

import br.com.devmedia.service.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("playlists")
public class PlaylistController {

    @Autowired
    private PlaylistService playlistService;

    @GetMapping("/listar")
    public ModelAndView listar(ModelMap model){
        model.addAttribute("playlists",playlistService.recuperar());
        return  new ModelAndView("/playlist/list",model);
    }
}
