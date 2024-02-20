package com.ashu.contacts.contactsservice.Controller;

import com.ashu.contacts.contactsservice.Entity.Contacts;
import com.ashu.contacts.contactsservice.Services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/user/{userId}")
    public List<Contacts> getContacts(@PathVariable Long userId){
        return this.contactService.getContactsOfUser(userId);
    }
}
