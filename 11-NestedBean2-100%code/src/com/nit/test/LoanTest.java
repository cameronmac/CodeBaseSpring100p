package com.nit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.beans.LoanApprover;
import com.nit.config.Config1;
import com.nit.config.Config2;

public class LoanTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext cCtx = null,pCtx=null;
		pCtx  = new AnnotationConfigApplicationContext(Config1.class);
		cCtx = new AnnotationConfigApplicationContext();
		cCtx.setParent(pCtx);
		cCtx.register(Config2.class);
		cCtx.refresh();
		LoanApprover la= cCtx.getBean("loanAp", LoanApprover.class);
		
		System.out.println(la.approveLoan());
		cCtx.close();
		
	}

}
