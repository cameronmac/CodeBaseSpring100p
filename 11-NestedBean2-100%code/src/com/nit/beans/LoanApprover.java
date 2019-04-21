package com.nit.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("loanAp")
@ComponentScan(basePackages="com.nit.beans")
public class LoanApprover {
	@Autowired
	private LoanDetails details;

	@Override
	public String toString() {
		return "LoanApprover (details=" + details + ")";
	}
	public String approveLoan() {
		if(details.getLoanType().equals("two-wheeler"))
			return "loan is approved";
		else 
			return "loan is rejected";
	}
}