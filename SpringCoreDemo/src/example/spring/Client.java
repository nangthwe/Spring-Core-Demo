package example.spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		// Object Construction | Done by Developer
		Employee eRef = new Employee();
		eRef.setEid(101);
		eRef.setEname("John Wastom");
		eRef.setEaddress("Marlar Myaing");
		
		System.out.println("Employee Details: " + eRef);
		
		// Spring Way | IOC (Inversion of Control)
		//Resource resource = new ClassPathResource("employeebean.xml");
		//BeanFactory factory = new XmlBeanFactory(resource); // Spring Container which shall parse XML File and construct the object
		
		ApplicationContext context = new ClassPathXmlApplicationContext("employeebean.xml");
		
//		Employee e1 = (Employee)factory.getBean("emp1");
//		Employee e2 = factory.getBean("emp2",Employee.class);
		
//		Employee e1 = (Employee)context.getBean("emp1");
//		Employee e2 = context.getBean("emp2",Employee.class);
//		
//		System.out.println("Employee1 Details: "+e1);
//		System.out.println("Employee2 Details: "+e2);
	}

}
