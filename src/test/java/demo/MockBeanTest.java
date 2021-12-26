package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.mockito.Mockito.when;

@SpringJUnitConfig(MyConfiguration.class)
class MockBeanTest {

	@MockBean
	private A a;

	@MockBean
	private B b;

	@Autowired
	private ClassWithConstructor classWithConstructor;

	@BeforeEach
	void init() {
		when(a.toString()).thenReturn("mock of A");
		when(b.toString()).thenReturn("mock of B");
	}

	@Test
	void test() {
		System.out.println(classWithConstructor.getA());
		System.out.println(classWithConstructor.getB());
	}

}
