package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class ControllerDictionary {
    @GetMapping("/home")
    public String home(){
        return "index";
    }
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public String get(@RequestParam String word, Model model){
        HashMap<String ,String> hashMap = new HashMap<>();
        hashMap.put("hello","Xin chào");
        hashMap.put("thanks","Cảm ơn");
        hashMap.put("dog brand","Óc chó");
        String result = hashMap.get(word);
        model.addAttribute("b",word);
        model.addAttribute("a",result);
        return "index";
    }
}
