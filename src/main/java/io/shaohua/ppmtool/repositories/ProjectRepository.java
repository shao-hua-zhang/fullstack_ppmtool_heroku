package io.shaohua.ppmtool.repositories;

import io.shaohua.ppmtool.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> { // repository就是定义表（project）的各种功能

    Project findByProjectIdentifier(String projectId);

    @Override
    Iterable<Project> findAll();


    Iterable<Project> findAllByProjectLeader(String username);

    @Override
    void delete(Project project);

    
}
