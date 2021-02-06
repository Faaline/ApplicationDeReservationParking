package sn.diagnetech.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.diagnetech.myapp.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
