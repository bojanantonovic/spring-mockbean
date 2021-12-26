package demo;

import org.springframework.stereotype.Component;

@Component
public class ClassWithConstructor {

	private final A a;

	private final B b;

	public ClassWithConstructor(A a, B b) {
		this.a = a;
		this.b = b;
	}

	public A getA() {
		return a;
	}

	public B getB() {
		return b;
	}
}
