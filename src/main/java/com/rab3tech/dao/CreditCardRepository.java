package com.rab3tech.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rab3tech.dao.entity.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer>{

	// spring data jpa gives the implementation of it.
public Optional<CreditCard> findByCcno(String ccno);  // optional because there might not be the card


}
