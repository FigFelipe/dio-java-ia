package me.dio.dio_java_ia.service;

import me.dio.dio_java_ia.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
