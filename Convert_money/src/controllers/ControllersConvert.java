package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ControllersConvert {
    @GetMapping("/homes")
    public String homes() {
        return "index";
    }

    @RequestMapping(value = "/sent", method = RequestMethod.POST)
    public String result(@RequestParam double number, Model model) {
        if (number >= 0) {
            double result = number * 23000;
            model.addAttribute("result", result);
            return "index";
        } else return "error";
    }
}
