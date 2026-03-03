package com.example.demoRestAPI.Repository;

import com.example.demoRestAPI.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Long> {
}
