package pe.dhexsoft.contactos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.dhexsoft.contactos.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
