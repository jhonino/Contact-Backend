package pe.dhexsoft.contactos.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import pe.dhexsoft.contactos.entity.Contact;
import pe.dhexsoft.contactos.repository.ContactRepository;

import java.util.List;

@Service
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
        return contactRepository.findAll();
    }

    @Override
    public Contact findById(Long id) {
        return contactRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("no existe el id" + id));
    }

    @Override
    public Contact update(Contact contact, Long id) {
        Contact buscado = findById(id);
        buscado.setName(contact.getName());
        buscado.setEmail(contact.getEmail());
        return save(contact);
    }

    @Override
    public void delete(Long id) {
        findById(id);
        contactRepository.deleteById(id);
    }
}
