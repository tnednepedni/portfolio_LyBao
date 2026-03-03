package com.example.demoRestAPI.Service.Impl;

import com.example.demoRestAPI.DTO.ContactDTO;
import com.example.demoRestAPI.DTO.RestContactDTO;
import com.example.demoRestAPI.Entity.Contact;
import com.example.demoRestAPI.Repository.ContactRepo;
import com.example.demoRestAPI.Service.ContactService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {

    private final ContactRepo contactRepo;
    private final ModelMapper modelMapper;

    @Override
    public ContactDTO createNewContact(RestContactDTO restContactDTO) {
        Contact newContact = modelMapper.map(restContactDTO, Contact.class);
        Contact contact = contactRepo.save(newContact);
        return modelMapper.map(contact, ContactDTO.class);
    }

    @Override
    public List<ContactDTO> getAllContacts() {

        List<Contact> contacts = contactRepo.findAll();

        return contacts
                .stream()
                .map(contact -> modelMapper.map(contact, ContactDTO.class))
                .toList();
    }
}