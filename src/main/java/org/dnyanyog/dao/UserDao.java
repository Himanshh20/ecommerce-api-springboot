package org.dnyanyog.dao;

import org.dnyanyog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Id;

public interface UserDao extends JpaRepository <User , Integer >{



}
