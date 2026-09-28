package _AD061.project.Repository;

import _AD061.project.Models.Household;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseholdRepository extends JpaRepository<Household, Long> {
}