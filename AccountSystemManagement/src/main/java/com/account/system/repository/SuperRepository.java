package com.account.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuperRepository<T> extends JpaRepository<T, String>{

}
