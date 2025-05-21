package pe.dhexsoft.contactos.service;

import pe.dhexsoft.contactos.entity.Contact;
import pe.dhexsoft.contactos.repository.ContactRepository;

import java.util.List;

public class ContactServiceImpl implements ContactService{

    //----Inyeccion de dependencia por constructor---------------
    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    //----Metodos-------------------------------------------------
    @Override
    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> findAll() {
        return List.of();
    }

    @Override
    public Contact findById(Long id) {
        return null;
    }

    @Override
    public Contact update(Contact contact, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
