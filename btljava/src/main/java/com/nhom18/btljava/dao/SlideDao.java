package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.Slide;

@Repository(value = "slideDao")
public interface SlideDao extends JpaRepository<Slide, Integer> {

}
