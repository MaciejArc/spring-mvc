package pl.nowak.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.nowak.springmvc.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
