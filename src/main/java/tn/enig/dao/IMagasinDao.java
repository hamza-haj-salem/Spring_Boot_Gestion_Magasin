package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.Magasin;

@Repository
public interface IMagasinDao extends JpaRepository<Magasin, Integer> {
	
}
