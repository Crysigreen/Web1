package com.example.demo.Web;

import com.example.demo.dtos.homeOffer;

import com.example.demo.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private OfferService offerService;

    @Autowired
    public void setOfferService(OfferService offerService){
        this.offerService = offerService;
    }

    @GetMapping("/")
    public String homePage(Model model) {

        List<homeOffer> advertisements = offerService.getHomeOffer();
        model.addAttribute("advertisements", advertisements);
        return "index";
    }

}
