package application.repository;

import application.model.DigitsPart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DigitsRepository extends CrudRepository<DigitsPart, Integer> {

}
