package tn.esprit.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Membre;
@Repository
public interface MembreRepository extends CrudRepository<Membre, Long> {
	
	@Query("select u from Membre u where  u.MembreUsername=:i AND u.MembrePassword=:p")
	List<Membre> login(@Param("i") String username, @Param("p") String password);

}
