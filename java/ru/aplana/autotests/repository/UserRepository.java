package ru.aplana.autotests.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;
import ru.aplana.autotests.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    @NotNull
    List<User> findAll();

    Optional<User> findById(Long id);
}
