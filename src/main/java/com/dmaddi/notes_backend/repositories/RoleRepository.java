package com.dmaddi.notes_backend.repositories;


import com.dmaddi.notes_backend.models.AppRole;
import com.dmaddi.notes_backend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}