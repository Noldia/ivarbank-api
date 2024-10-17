package com.api.ivarbank.controller;

import com.api.ivarbank.entity.Contact;
import com.api.ivarbank.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contact")
public class ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.findAll();
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return contactService.save(contact);
    }
}
