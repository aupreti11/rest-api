package com.rab3tech.service;

import java.util.List;

import com.rab3tech.dto.CreditCardDTO;

public interface CreditCardService {

	void persists(CreditCardDTO cardDTO);

	CreditCardDTO findByCcid(int ccid);

	void removeByCcid(int ccid);

	List<CreditCardDTO> findAll();
	
}