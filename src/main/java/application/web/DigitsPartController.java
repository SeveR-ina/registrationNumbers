package application.web;

import application.repository.DigitsRepository;
import application.model.DigitsPart;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DigitsPartController {

    @Autowired
    DigitsRepository digitsRepository;

    @GetMapping("/number")
    public DigitsPart getRandomNumber() {

        int maxId = 0;
        for (DigitsPart digitsPart : digitsRepository.findAll()) {
            maxId = digitsPart.getId() > maxId ? digitsPart.getId() : maxId;
        }
        digitsRepository.save(DigitsPart.builder().id(maxId+1).view(RandomString.make()).build());
        return digitsRepository.findById(maxId+1).get();
    }

    @GetMapping("/numbers")
    public List<DigitsPart> getAllNumbers() {
        return (ArrayList<DigitsPart>) digitsRepository.findAll();
    }

    //    public List<Integer> digitsPart;
//
//    public List getNextDigitsPart() {
//        if(digitsPart.get(digitsPart.size() - 1) == 9) {
//            //will have an overload
//            //todo: return list full of zeros
//            return Arrays.asList(0, 0, 0);
//        }
//        else {
//            return convertToList(convertToInt() + 1);
//        }
//    }
//
//    public Integer convertToInt() {
//        int result = 0;
//        int countOfPowers = digitsPart.size();
//        for(int i = digitsPart.size() - 1; i >= 0; i--) {
//            result += digitsPart.get(i) * 10^(i);
//        }
//        return result;
//    }
//
//    public List convertToList(int number) {
//        List<Integer> result = new ArrayList<>();
//        while(number % 10 != 0) {
//            int digit = number / 10;
//            result.add(digit);
//            number = (number - digit) / 10;
//        }
//        return result;
//    }
}
