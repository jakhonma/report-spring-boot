package report.uz.report.projection;

import org.springframework.data.rest.core.config.Projection;
import report.uz.report.entity.Users;
import report.uz.report.entity.WareHouse;

import java.util.Set;

@Projection(types = WareHouse.class)
public interface CustomWareHouse {

    Long getId();

    String getName();

    boolean getActive();

    Set<Users> getUsers();
}
