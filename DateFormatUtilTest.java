package util;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.OrderWith;
import org.junit.runner.RunWith;

@RunWith(OrderRunner.class)
public class DateFormatUtilTest {

	@Test
	public void testPattern1() {
		DateFormatUtil format = new DateFormatUtil();
		
		assertEquals("-", format.parseSimpleThaiFormat(null));
	}
	
	
	@Test
	public void testPattern2() {
		DateFormatUtil format = new DateFormatUtil();
		Calendar calendar = new GregorianCalendar();
		calendar.set(2012, 0, 25);
		
		assertEquals("25/01/2555", format.parseSimpleThaiFormat(calendar.getTime()));
	}
	
	@Test
	public void testPattern3() {
		DateFormatUtil format = new DateFormatUtil();
		assertArrayEquals(new int[] {0,1}, format.getTest());
	}
}