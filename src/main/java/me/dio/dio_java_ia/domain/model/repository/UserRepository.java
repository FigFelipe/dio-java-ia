package me.dio.dio_java_ia.domain.model.repository;

import me.dio.dio_java_ia.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
