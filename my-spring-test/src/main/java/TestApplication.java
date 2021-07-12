import entity.A;
import entity.B;
import entity.Person;
import entity.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class TestApplication {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		A a = (A)ac.getBean("circleA");
//		System.out.println(a.toString() + ":" + a.getB());
//		B b = (B)ac.getBean("circleB" );
//		System.out.println(b.toString()+ ":" + b.getA());

		Person person = (Person)ac.getBean("person");
		System.out.println(person);

		Teacher teacher = (Teacher)ac.getBean("teacher");
//		 aware接口存在的意义，方便通过spring中的bean对象来获取对应容器的属性值
		System.out.println(teacher.getBeanName());
		Environment environment = teacher.getEnvironment();
		System.out.println(environment);
	}
}
