package liga.medical.medicalmonitoring.api.mapping;

import liga.medical.medicalmonitoring.core.model.Contact;
import liga.medical.medicalmonitoring.dto.ContactResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContactMapper {

    long save(Contact contact);

    ContactResponse findById(Long id);

    List<ContactResponse> findAll();

    void deleteById(Long id);
}
