import service.SomeService;
import service.impl.SomeServiceImpl;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class Test_JDK_Proxy {
	public static void main(String[] args) {
		// 获取目标对象
		SomeService target = new SomeServiceImpl();

		Proxy.newProxyInstance(
				target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("目标对象执行方法前.......");
						String msg = (String)method.invoke(target, args[0]);
						System.out.println("目标对象执行方法后.......");
						return msg.toUpperCase();
					}
				}
		);

		String xixixi = target.doSome("xixixi");
		System.out.println(xixixi);
	}
}
