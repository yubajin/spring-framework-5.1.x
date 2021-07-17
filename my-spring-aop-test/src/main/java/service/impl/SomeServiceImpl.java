package service.impl;

import service.SomeService;

public class SomeServiceImpl implements SomeService {
	@Override
	public String doSome(String msg) {
		System.out.println("target object execution......");
		return "yubj";
	}
}
