package tarot.web.controller;

//import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import tarot.model.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CardController {

    @RequestMapping("/card/{id}")
    public String detail(@PathVariable int id, Model model) {
        Deck deck = new Deck();
        Card card = deck.findById(id);

        model.addAttribute("card", card);

        return "Database/card-detail";
    }

    @RequestMapping("/reversed/{id}")
    public String reversed(@PathVariable int id, Model model){
        Deck deck = new Deck();
        Card card = deck.findById(id);
        card.setReversed(true);

        model.addAttribute("card", card);

        return "Database/card-detail";
    }

    @RequestMapping("/arcana")
    public String listArcana(ModelMap modelMap){
        List<String> types = new ArrayList<>();
        for (Arcana a: Arcana.values()) {
            types.add(a.toString().toLowerCase());
        }

        modelMap.put("types", types);
        return "Database/arcana";
    }

    @RequestMapping("/major")
    public String listMajor(ModelMap modelMap){
        List<Card> cards = DeckBuilder.getMajorDeck();

        modelMap.put("cards", cards);
        return "Database/major";
    }

    @RequestMapping("/minor")
    public String listSuits(ModelMap modelMap){
        List<Suit> suits = new ArrayList<>();
        for (Suit s: Suit.values()) {
            suits.add(s);
        }

        modelMap.put("suits", suits);
        return "Database/minor";
    }

    @RequestMapping("/minor/swords")
    public String listSwords(ModelMap modelMap){
        Deck deck = new Deck();
        List<Card> swords = deck.getBySuit(Suit.SWORDS);

        modelMap.put("swords", swords);
        return "Database/swords";
    }

    @RequestMapping("/minor/cups")
    public String listCups(ModelMap modelMap){
        Deck deck = new Deck();
        List<Card> cups = deck.getBySuit(Suit.CUPS);

        modelMap.put("cups", cups);
        return "Database/cups";
    }

    @RequestMapping("/minor/pentacles")
    public String listPentacles(ModelMap modelMap){
        Deck deck = new Deck();
        List<Card> pentacles = deck.getBySuit(Suit.PENTACLES);

        modelMap.put("pentacles", pentacles);
        return "Database/pentacles";
    }

    @RequestMapping("/minor/wands")
    public String listWands(ModelMap modelMap){
        Deck deck = new Deck();
        List<Card> wands = deck.getBySuit(Suit.WANDS);

        modelMap.put("wands", wands);
        return "Database/wands";
    }

}
