package com.surya;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.surya.controller.MainController;
import com.surya.vo.EmployeeVO;

//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,JdbcTemplateAutoConfiguration.class})
@SpringBootApplication
public class BootProj04RealTimeDiAutoConfigurationApplication {

	public static void main(String[] args) {
		 //Read inputs from end user
		Scanner sc = new Scanner(System.in);
		System.out.print("Desgs count:==");
		int count = sc.nextInt();
		String desgs[] = null;
		if(count>0)
	     desgs = new String[count];
		else {
			System.out.println("invalid desg count ");
		    return;
		}
		for(int i=0;i<count;i++) {
			System.out.print("enter desg "+(i+1)+"==");
			String desg = sc.next();
			desgs[i]= desg;
		}
		
		//get ioc container
		ApplicationContext ctx =  SpringApplication.run(BootProj04RealTimeDiAutoConfigurationApplication.class, args);
	  //	get controller class object
		MainController controller = ctx.getBean("controller",MainController.class);
		//invoke method
		try {
			List<EmployeeVO> listVO = controller.showEmpsByDesgs(desgs);
			System.out.println("Emp details having "+Arrays.toString(desgs));
			listVO.forEach(vo->{
				System.out.println(vo);
			});
		}//try
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Some internal problem:: "+e.getMessage());
		}
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	} //main

} // class
