package com.eltepe.workbook;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class ControllerTItle {
    @GetMapping("/")
    public String getTableView(Model model) {

        List<Movies> moviesList = FactoryMovies.wrapMovies(ExampleMovies.titles, ExampleMovies.episodes, ExampleMovies.ratings);

        model.addAttribute("moviesTransfer", moviesList);
        return "shows";
    }
}
