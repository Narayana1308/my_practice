package j_unit_5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.MethodOrderer.MethodName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("Testing addition ")
//@TestMethodOrder(value = OrderAnnotation.class)
//@TestMethodOrder(value = MethodName.class)
@TestMethodOrder(value = org.junit.jupiter.api.MethodOrderer.DisplayName.class)
public class TestAddition {
	Addition addition = new Addition();

	@Test
	@DisplayName("tseting on addition of two numbers")
	//@Order(10)
	public void testAdd() {
		assertEquals(12, addition.add(6, 6));
		assertEquals(12, addition.add(10, 2));
	}

	@Test
	@Disabled
	@DisplayName("tseting on addition of two numbers")
	//@Order(12)
	public void testAd() {
		assertEquals(2, addition.add(6, 6));
		assertEquals(12, addition.add(10, 2));
	}

	@Test
	@DisplayName("tseting on addition of two summ numbers")
	public void testsum() {
		assertEquals(12, addition.add(6, 6));
		assertEquals(12, addition.add(10, 2));
	}

	@Test
	//@Order(9)
	@DisplayName("tseting on addition of two big  numbers")
	public void testBigNum() {
		assertEquals(120000, addition.add(60000, 60000));
		assertEquals(200000, addition.add(100000, 100000));
	}

	@Test
	//@Order(7)
	@DisplayName("tseting on addition of two  small numbers")
	public void testsamll() {
		assertEquals(12, addition.add(6, 6));
		assertEquals(12, addition.add(10, 2));
	}

}
