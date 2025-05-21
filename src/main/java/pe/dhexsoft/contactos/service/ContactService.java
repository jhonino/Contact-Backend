package pe.dhexsoft.contactos.service;

import pe.dhexsoft.contactos.entity.Contact;

import java.util.List;

public interface ContactService {

    Contact save(Contact contact);
    List<Contact> findAll();
    Contact findById(Long id);
    Contact update(Contact contact, Long id);
    void delete(Long id);

}
