package com.example.demo.Web;

import com.example.demo.dtos.homeOffer;

import com.example.demo.dtos.homeTop3ModelDto;
import com.example.demo.services.ModelService;
import com.example.demo.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    private OfferService offerService;
    private ModelService modelService;

    @Autowired
    public void setOfferService(OfferService offerService){
        this.offerService = offerService;
    }
    @Autowired
    public void setModelService(ModelService modelService){
        this.modelService = modelService;
    }

    @GetMapping("/")
    public String homePage(Model model) {

        List<homeTop3ModelDto> models = modelService.getTopThreeModel();
        List<homeOffer> advertisements = offerService.getHomeOffer();
        model.addAttribute("advertisements", advertisements);
        model.addAttribute("TopThreeModel", models);
        return "index";
    }

}
