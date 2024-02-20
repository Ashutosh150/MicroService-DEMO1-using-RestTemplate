package com.ashu.contacts.contactsservice.Services;

import com.ashu.contacts.contactsservice.Entity.Contacts;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    //fake Contacts technically this is to be done from DB using JPA
    List<Contacts> list = List.of(
            new Contacts(1L, "abc@gmail.com", "amit", 1311L),
            new Contacts(2L, "mno@gmail.com", "anil", 1311L),
            new Contacts(3L, "xyz@gmail.com", "abey", 1312L),
            new Contacts(4L, "pqr@gmail.com", "ansh", 1313L)
    );



    @Override
    public List<Contacts> getContactsOfUser(Long userId) {
        return this.list.stream().filter(contacts -> contacts.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
