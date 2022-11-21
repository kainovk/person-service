package liga.medical.medicalmonitoring.core.repository;

import liga.medical.medicalmonitoring.core.model.PersonData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonDataRepository extends JpaRepository<PersonData, Long> {
}
