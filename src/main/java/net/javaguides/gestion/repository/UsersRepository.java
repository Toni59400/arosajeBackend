package net.javaguides.gestion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.gestion.entity.Users; 

public interface UsersRepository extends JpaRepository<Users, Integer> {
    
}
