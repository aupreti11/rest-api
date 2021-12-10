package com.rab3tech.rest.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rab3tech.dto.AppVO;
import com.rab3tech.dto.CreditCardDTO;
import com.rab3tech.service.CreditCardService;

@RestController
@RequestMapping("/v4") // has to enter after the context path
public class CreditCardController {
	
	@Autowired
	private CreditCardService creditcardService;
	
	@PutMapping("/creditcards")
	@ResponseStatus(code=HttpStatus.CREATED)  // created means your operations is created successfully
	public AppVO postCreditCard(@RequestBody CreditCardDTO creditCardDTO) {
		AppVO appVO = new AppVO();
		appVO.setCode("200");
		appVO.setMessage("Credit Card details is uploaded successfully");
		return appVO;	
	}
	
	@PostMapping("/creditcards")
	@ResponseStatus(code=HttpStatus.CREATED)  // created means your operations is created successfully
	public AppVO postCreditCard(@PathVariable("ccid") int ccid) {
		AppVO appVO = new AppVO();
		appVO.setCode("200");
		appVO.setMessage("Credit Card details is uploaded successfully");
		return appVO;	
	}
	
	//Expose rest api here
	@GetMapping("/creditcards/{ccid}")
	@ResponseStatus(code=HttpStatus.OK) // ok means your operation is performed successfully
	public CreditCardDTO getCreditCard(@PathVariable("ccid") int ccid) {
		return creditcardService.findByCcid(ccid);
		
	}
	
	@GetMapping("/creditcards")  // find all operations
	@ResponseStatus(code=HttpStatus.OK)
	public List<CreditCardDTO> getCreditCard() {
		return creditcardService.findAll();
		
	}
	
	@DeleteMapping("/creditcards/{ccid}")  // delete operation
	@ResponseStatus(code=HttpStatus.OK) // ok means your operation is performed successfully
	public AppVO deleteCreditCard(@PathVariable("ccid") int ccid) {
		creditcardService.removeByCcid(ccid);
		AppVO appVO = new AppVO();
		appVO.setCode("200");
		appVO.setMessage("Credit Card details is deleted successfully");
		return appVO;
		
}
}
