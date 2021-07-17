package aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect// 显示的表明当前类是一个切面类
public class MyAspectJ {

	@Before("within(service.impl.SomeServiceImpl)")  //切入点的复用
	public void aspectMethod01(){
		System.out.println("before aspectJ1....");
	}
}
