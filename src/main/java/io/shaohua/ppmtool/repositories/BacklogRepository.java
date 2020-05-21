package io.shaohua.ppmtool.repositories;

import io.shaohua.ppmtool.domain.Backlog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends CrudRepository<Backlog, Long> { // long is id

    Backlog findByProjectIdentifier(String Identifier);
}
