package org.spring.Assignment8;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Test class 
 *
 */
public class Test {
    public static void main( String[] args )
    {
      
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Spring8.xml");
        context.registerShutdownHook();
        Employee employee = (Employee) context.getBean("Employee");
    	employee.displayInfo();
    	
    }
}
