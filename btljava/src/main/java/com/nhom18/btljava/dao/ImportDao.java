package com.nhom18.btljava.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nhom18.btljava.model.Import;
import com.nhom18.btljava.model.ImportPK;

@Repository(value = "importDao")
public interface ImportDao extends JpaRepository<Import, ImportPK> {

}
