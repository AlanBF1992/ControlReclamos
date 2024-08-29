package cl.praxis.ControlReclamosTransporte.model.repository;

import cl.praxis.ControlReclamosTransporte.model.dto.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    @NonNull
    List<Role> findAll();
    Set<Role> findByName(String name);
}
