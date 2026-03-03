package com.example.demoRestAPI.Controller;

import com.example.demoRestAPI.DTO.ContactDTO;
import com.example.demoRestAPI.DTO.RestContactDTO;
import com.example.demoRestAPI.Service.ContactService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {

    private final ContactService contactService;

    @PostMapping
    public ResponseEntity<ContactDTO> createNewContact(@RequestBody @Valid RestContactDTO restContactDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(contactService.createNewContact(restContactDTO));
    }

    @GetMapping
    public ResponseEntity<List<ContactDTO>> getAllContacts(){
//        return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
        return ResponseEntity.ok(contactService.getAllContacts());
    }
}