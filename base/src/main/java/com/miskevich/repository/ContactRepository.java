package com.miskevich.repository;

import com.miskevich.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository <Contact, Integer> {
}
