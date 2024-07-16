package report.uz.report.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import report.uz.report.entity.WareHouse;
import report.uz.report.projection.CustomWareHouse;

@RepositoryRestResource(path = "wareHouse", excerptProjection = CustomWareHouse.class)
public interface WareHouseRepository extends JpaRepository<WareHouse, Long> {
}
