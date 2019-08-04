package tn.esprit.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Commission;

@Repository
public interface CommissionRepository extends CrudRepository<Commission, Long> {

}
