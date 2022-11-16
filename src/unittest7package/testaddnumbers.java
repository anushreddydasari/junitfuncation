package unittest7package;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumbers {

	@Test
	public void test() {
		junitfuncation obj = new junitfuncation();
		int a = 10;
		int b = 10;
		assertEquals(20,obj.add_num(a, b));
	}
	@Test
	public void test1() {
		junitfuncation obj = new junitfuncation();
		int a = 10;
		int b = 10;
		assertEquals(10,obj.add_num(a, b));
	}

}



