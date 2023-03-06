package com.miskevich.service.contact;

import com.miskevich.domain.Contact;
import com.miskevich.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    @Override
    @Transactional
    public Contact creat(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    @Transactional
    public Contact update(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public Optional<Contact> findById(int id) {
        return contactRepository.findById(id);
    }

    @Override
    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    @Override
    @Transactional
    public void delete(int id) {
        contactRepository.deleteById(id);

    }
}
