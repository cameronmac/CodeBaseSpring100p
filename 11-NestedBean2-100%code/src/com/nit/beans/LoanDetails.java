package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("loanDetails")
public class LoanDetails {
	@Value("11")
  private int loanId;
	
	@Value("two-wheeler")
  private String loanType;
	@Value("ppp")
  private String customer;
  public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
 
public String getLoanType() {
	return loanType;
}
public void setLoanType(String loanType) {
	this.loanType = loanType;
}
public String getCustomer() {
	return customer;
}
public void setCustomer(String customer) {
	this.customer = customer;
}
public LoanDetails() {
	  System.out.println("o-param cons");
  }
@Override
public String toString() {
	return "LoanDetails (loanId=" + loanId + ", loanType=" + loanType + ", customer=" + customer + ")";
}
  
}
