package application.model;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
public class LicensePlate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer id;
    public String number;
}
