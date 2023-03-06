package com.miskevich.service.contact;

import com.miskevich.domain.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {

    Contact creat(Contact contact);

    Contact update(Contact contact);

    Optional<Contact> findById(int id);

    List<Contact> findAll();

    void delete(int id);
}
