package _AD061.project.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Household {

    @Id
    @GeneratedValue
    Long id;

    String name;
    String email;
    int familySize;
}