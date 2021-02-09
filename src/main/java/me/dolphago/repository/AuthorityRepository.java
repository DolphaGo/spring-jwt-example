package me.dolphago.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dolphago.entity.Authority;

public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
