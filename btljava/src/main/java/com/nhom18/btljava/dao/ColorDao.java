package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.Color;

@Repository(value = "colorDao")
public interface ColorDao extends JpaRepository<Color, Integer> {

}
