package com.rab3tech.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rab3tech.dao.CreditCardRepository;
import com.rab3tech.dao.entity.CreditCard;
import com.rab3tech.dto.CreditCardDTO;

@Service
public class CreditCardServiceImpl implements CreditCardService {

	@Autowired
	private CreditCardRepository cardRepository;
	
	// persists is called by controller and the controller is rest api
	
	@Override
	public void persists(CreditCardDTO cardDTO) {
		CreditCard creditCard = new CreditCard();
		BeanUtils.copyProperties(cardDTO, creditCard);
		// creating instance of timestamp
		Timestamp timestamp=new Timestamp(new Date(0).getTime());
		creditCard.setDoe(timestamp);
		cardRepository.save(creditCard);
	}
	
	@Override
	public CreditCardDTO findByCcid(int ccid) {
		CreditCard creditCard = cardRepository.findById(ccid).get();
		CreditCardDTO cardDTO = new CreditCardDTO();
		BeanUtils.copyProperties(creditCard, cardDTO);
		return cardDTO;
	}
	
	@Override
	public void removeByCcid(int ccid) {
		cardRepository.deleteById(ccid);
	}
	
	@Override
	public List<CreditCardDTO> findAll() {
		List<CreditCardDTO> cardDTOs = new ArrayList<CreditCardDTO>();
		List<CreditCard> creditCards  = cardRepository.findAll();
		for(CreditCard creditCard : creditCards) {
			CreditCardDTO cardDTO = new CreditCardDTO();
			BeanUtils.copyProperties(creditCard, cardDTO);
			cardDTOs.add(cardDTO);
		}
		return cardDTOs;
	}	
}
