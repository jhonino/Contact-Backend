package pe.dhexsoft.contactos.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.dhexsoft.contactos.entity.Contact;
import pe.dhexsoft.contactos.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
//@RequiredArgsConstructor     //esta sirviendo para la inyeccion de depedencias
public class ContactController {

    // inyeccion de dependencias ---------------
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    // metodos, end points------------------------
    @PostMapping
    public Contact guardar(@RequestBody Contact contact){
        return contactService.save(contact);
    }

    @GetMapping
    public List<Contact> listar(){
        return contactService.findAll();
    }

    @GetMapping("/{id}")
    public Contact listarXid(@PathVariable Long id){
        return contactService.findById(id);
    }

    @PutMapping("/{id}")
    public Contact modificar(@PathVariable Long id, @RequestBody Contact contact){
        return contactService.update(contact, id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id){
        contactService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
