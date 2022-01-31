package com.safety.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.safety.Model.Rfa;


public interface RfaRepository extends JpaRepository<Rfa, Integer>{
	
}