package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.Contact;

@Repository(value = "contactDao")
public interface ContactDao extends JpaRepository<Contact, Integer> {

}
