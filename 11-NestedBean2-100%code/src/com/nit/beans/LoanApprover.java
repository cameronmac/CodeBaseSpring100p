package com.nit.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("loanAp")
@Configuration
@ComponentScan(basePackages="com.nit.beans")
public class LoanApprover {
	@Autowired
  private LoanDetails details;

/*private LoanApprover() {
	this.approveLoan();
	System.out.println("loanApprovr 0-param cons");
}*/

@Override
public String toString() {
	return "LoanApprover (details=" + details + ")";
}
public String approveLoan() {
	if(details.getLoanType().equals("two-wheeler")){
			return "loan is approved";
}
else {
	return "loan is rejected";
}}

/*public void setDetails(LoanDetails details) {
	this.details = details;
}*/
}