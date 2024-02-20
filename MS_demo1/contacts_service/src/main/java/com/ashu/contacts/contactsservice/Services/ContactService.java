package com.ashu.contacts.contactsservice.Services;

import com.ashu.contacts.contactsservice.Entity.Contacts;

import java.util.List;

public interface ContactService {


    public List<Contacts> getContactsOfUser(Long userId);


}
