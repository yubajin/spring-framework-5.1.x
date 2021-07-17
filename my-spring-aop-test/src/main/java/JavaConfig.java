import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import service.SomeService;
import service.impl.SomeServiceImpl;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy(proxyTargetClass = true)//// 修改默认的代理模式为CGLIB代理模式
public class JavaConfig {
	public static void main(String[] args) {
		//IOC容器初始化操作
		//实例化->属性赋值->初始化
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(JavaConfig.class);
		SomeService bean = (SomeServiceImpl)ac.getBean(SomeService.class);
		String xixixi = bean.doSome("xixixi");
		System.out.println(xixixi);
	}
}
