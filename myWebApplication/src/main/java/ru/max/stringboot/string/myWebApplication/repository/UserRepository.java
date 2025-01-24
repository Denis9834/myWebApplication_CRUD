package ru.max.stringboot.string.myWebApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.max.stringboot.string.myWebApplication.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
