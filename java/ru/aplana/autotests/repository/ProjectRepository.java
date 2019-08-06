package ru.aplana.autotests.repository;

import org.jetbrains.annotations.NotNull;
import org.springframework.data.repository.CrudRepository;
import ru.aplana.autotests.entity.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    @NotNull
    List<Project> findAll();

    Optional<Project> findByName(String name);
}