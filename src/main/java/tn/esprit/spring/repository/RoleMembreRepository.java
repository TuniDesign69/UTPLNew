package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.RoleMembre;
@Repository
public interface RoleMembreRepository extends CrudRepository<RoleMembre, Long> {

}
