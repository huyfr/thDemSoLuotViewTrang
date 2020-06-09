package controller;

import model.MyCounter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("myCounter")
public class CounterController {

    @ModelAttribute("myCounter")
    public MyCounter setUpCounter() {
        return new MyCounter();
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String get(@ModelAttribute("myCounter") MyCounter myCounter) {
        myCounter.increment();
        return "index";
    }
}
