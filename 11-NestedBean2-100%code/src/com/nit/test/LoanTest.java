package com.nit.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.beans.LoanApprover;
import com.nit.beans.LoanDetails;
import com.nit.config.config1;

public class LoanTest {

	public static void main(String[] args) {
		
		/*//create parent ioc container
		BeanFactory pfactory=new XmlBeanFactory(new FileSystemResource("com/nit/cofs/loan-beans.xml"));
		
		//create child ioc container
		BeanFactory cfactory=new XmlBeanFactory(new FileSystemResource("com/nit/cofs/approval-beans.xml"),pfactory);
		//get bean
		LoanApprover LA=cfactory.getBean("app",LoanApprover.class);
		System.out.println(LA);
	*/
       /*   //create parent ioc container
		   DefaultListableBeanFactory pfactory=new DefaultListableBeanFactory();
			XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(pfactory);
			reader.loadBeanDefinitions("com/nit/cofs/loan-beans.xml");
			
          //create child ioc container
			   DefaultListableBeanFactory cfactory=new DefaultListableBeanFactory(pfactory);
				XmlBeanDefinitionReader reader1=new XmlBeanDefinitionReader(pfactory);
				reader1.loadBeanDefinitions("com/nit/cofs/approval-beans.xml");
				//get bean
				LoanApprover LA=pfactory.getBean("app",LoanApprover.class);
				System.out.println(LA.approveLoan());
				
		ApplicationContext cctx=new ClassPathXmlApplicationContext("com/nit/cofs/approval-beans.xml");
	ApplicationContext pctx=new ClassPathXmlApplicationContext("com/nit/cofs/loan-beans.xml",cc);
    // LoanDetails ld=pctx.getBean("kk",LoanDetails.class);
  // System.out.println(ld);
//LoanApprover LA=cctx.getBean("app",LoanApprover.class);
//System.out.println(LA);
//System.out.println(LA.approveLoan());
System.out.println("===========");
	//((AbstractApplicationContext) cctx).setParent(pctx);
	//	((AbstractApplicationContext) cctx).refresh();
*/
		/*ApplicationContext appContext = new ClassPathXmlApplicationContext(
        new String[] {"com/nit/cofs/approval-beans.xml", "com/nit/cofs/loan-beans.xml","com/nit/cofs/applicationContext.xml"});
LoanApprover LA=appContext.getBean("app",LoanApprover.class);
System.out.println(LA);
System.out.println(LA.approveLoan());
	*/
		ApplicationContext ctx=new AnnotationConfigApplicationContext(config1.class);
		
		LoanApprover la= (LoanApprover) ctx.getBean("la");
		System.out.println(la);
		
		
		
		
		
		
		
		
		
		
		
	}

}
