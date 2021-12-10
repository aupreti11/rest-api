package com.rab3tech.dao.entity;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credit_card_tbl")
public class CreditCard {
	private int ccid;
	private String name;
	private String ccno;
	private int cvv;
	private String exp;
	private int balance;
	private Timestamp doe;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@Override
	public String toString() {
		return "CreditCard [ccid=" + ccid + ", name=" + name + ", ccno=" + ccno + ", cvv=" + cvv + ", exp=" + exp
				+ ", balance=" + balance + ", doe=" + doe + "]";
	}

}