package com.example.demoRestAPI.Service;

import com.example.demoRestAPI.DTO.ContactDTO;
import com.example.demoRestAPI.DTO.RestContactDTO;

import java.util.List;

public interface ContactService {
    List<ContactDTO> getAllContacts();

    ContactDTO createNewContact(RestContactDTO restContactDTO);
}
