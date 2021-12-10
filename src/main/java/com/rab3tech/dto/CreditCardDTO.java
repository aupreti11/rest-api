package com.rab3tech.dto;

import java.security.Timestamp;

public class CreditCardDTO {
	
	private int ccid;
	private String name;
	private String ccno;
	private int cvv;
	private String exp;
	private int balance;
	private Timestamp doe;
	private String extra;
	
	public int getCcid() {
		return ccid;
	}
	public void setCcid(int ccid) {
		this.ccid = ccid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCcno() {
		return ccno;
	}
	public void setCcno(String ccno) {
		this.ccno = ccno;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Timestamp getDoe() {
		return doe;
	}
	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	
	
	@Override
	public String toString() {
		return "CreditCardDTO [ccid=" + ccid + ", name=" + name + ", ccno=" + ccno + ", cvv=" + cvv + ", exp=" + exp
				+ ", balance=" + balance + ", doe=" + doe + ", extra=" + extra + "]";
	}
}
