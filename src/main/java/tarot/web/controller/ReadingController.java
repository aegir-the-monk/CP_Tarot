package tarot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tarot.model.Card;
import tarot.model.Deck;
import tarot.model.Reading;
import tarot.model.SpreadBuilder;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ReadingController {

    @RequestMapping("/reading")
    public String readingHome(ModelMap modelMap){

        return "Fortune/reading-home";
    }

    @RequestMapping("/reading/3card")
    public String threeCardReading(ModelMap modelMap) {

        List<Card> reading = Reading.getAutoReading(SpreadBuilder.getThreeCardSpread());
        modelMap.put("reading", reading);
        return "Fortune/reading";
    }

    @RequestMapping("/reading/simple-cross")
    public String simpleCrossReading(ModelMap modelMap) {

        List<Card> reading = Reading.getAutoReading(SpreadBuilder.getSimpleCrossSpread());
        modelMap.put("reading", reading);
        return "Fortune/reading";
    }

}