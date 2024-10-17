package com.api.ivarbank.service;

import com.api.ivarbank.entity.Contact;
import com.api.ivarbank.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    public Optional<Contact> findById(Long id) {
        return contactRepository.findById(id);
    }
    public Contact save(Contact contact) {
        return contactRepository.save(contact);
    }

    public void delete(Contact contact) {
        contactRepository.delete(contact);
    }
}
