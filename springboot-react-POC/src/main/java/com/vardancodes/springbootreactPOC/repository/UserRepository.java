package com.vardancodes.springbootreactPOC.repository;

import com.vardancodes.springbootreactPOC.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
