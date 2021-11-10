package application.service;

import application.repository.DigitsRepository;
import application.model.DigitsPart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LicensePlatesService {

    @Autowired
    private DigitsRepository repository;

    public LicensePlatesService(DigitsRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public DigitsPart save() {
        return repository.save(DigitsPart.builder().id(1).view("000").build());
    }
}
