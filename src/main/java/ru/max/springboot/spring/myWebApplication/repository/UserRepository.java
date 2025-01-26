package ru.max.springboot.spring.myWebApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.max.springboot.spring.myWebApplication.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
