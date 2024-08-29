package cl.praxis.ControlReclamosTransporte.controller;

import cl.praxis.ControlReclamosTransporte.model.dto.User;
import cl.praxis.ControlReclamosTransporte.model.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class LoginController {

    UserService userService;

    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("")
    public String index() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/registration")
    public String registration(@ModelAttribute("user") User user) {
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("user") User user, Model model) {
        userService.saveWithUserRole(user);
        return "redirect:/login";
    }

    @GetMapping("home")
    public String home(Model model) {
        return "home";
    }
}
