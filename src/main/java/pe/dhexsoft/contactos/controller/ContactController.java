package pe.dhexsoft.contactos.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.dhexsoft.contactos.entity.Contact;
import pe.dhexsoft.contactos.service.ContactService;

@RestController
@RequestMapping("/api/contact")
//@RequiredArgsConstructor     //esta sirviendo para la inyeccion de depedencias
public class ContactController {

    // inyeccion de dependencias ---------------
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @PostMapping
    public Contact guardar(@RequestBody Contact contact){
        return contactService.save(contact);
    }

}
