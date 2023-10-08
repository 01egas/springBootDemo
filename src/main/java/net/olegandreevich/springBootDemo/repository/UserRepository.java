package net.olegandreevich.springBootDemo.repository;

import net.olegandreevich.springBootDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
