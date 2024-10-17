package com.api.ivarbank.repository;

import com.api.ivarbank.entity.Contact;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends ListCrudRepository<Contact, Long> {
}
