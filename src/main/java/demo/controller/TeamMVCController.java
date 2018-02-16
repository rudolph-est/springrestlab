package demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import demo.domain.Team;
import demo.repository.TeamRepository;

import javax.annotation.Resource;


@Controller
public class TeamMVCController {

    @Resource
    TeamRepository teamRepository;

    @RequestMapping("/home")
    public String fetchTeams(Model model) {
        model.addAttribute("teamsAsCollection", teamRepository.findAll());
        return "home";
    }

}
