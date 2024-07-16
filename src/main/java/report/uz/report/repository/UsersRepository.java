package report.uz.report.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import report.uz.report.entity.Users;
import report.uz.report.projection.CustomUser;

@RepositoryRestResource(path = "user", collectionResourceRel = "users", excerptProjection = CustomUser.class)
public interface UsersRepository extends JpaRepository<Users, Long> {
    @RestResource(path = "byName")
    public Page<Users> findAllByFirstName(@Param("firstName") String firstName, Pageable pageable);
}
