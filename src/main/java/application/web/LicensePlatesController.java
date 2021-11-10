package application.web;

import application.model.DigitsPart;
import application.service.LicensePlatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LicensePlatesController {

    @Autowired
    private LicensePlatesService service;

    @GetMapping("/license")
    public DigitsPart getRandomNumber() {
        return service.save();
    }
}
