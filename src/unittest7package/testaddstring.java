package unittest7package;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		junitfuncation obj = new junitfuncation();
		String a = "qwe";
		String b = "zxc";
		assertEquals("qwezxc",obj.add_str(a, b));
		
	}
	@Test
	public void test1() {
		junitfuncation obj = new junitfuncation();
		String a = "qwe";
		String b = "zxc";
		assertEquals("qwezx",obj.add_str(a, b));
		
	}

}


