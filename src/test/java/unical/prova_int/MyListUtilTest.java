package unical.prova_int;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {
	
	static DateTimeFormatter fmt;
	
	@BeforeClass
	public static void formatTime() {
		 fmt = DateTimeFormat.forPattern("d, MMMM, yyyy, H:m:s");

	}
	
	@Before
	public void timeStart() {
		DateTime start = new DateTime();
		String str = fmt.print(start);
		System.out.println("START: " + str);
	}
	
	@After
	public void timeEnd() {
		DateTime end = new DateTime();
		String str = fmt.print(end);
		System.out.println("END: " + str);
	}
	
	@Test
	public void controlloSort () {
		MyListUtil test = new MyListUtil();
        List<Integer> a1 = Arrays.asList(4, 57, 9, 246);
        List<Integer> crescente = Arrays.asList(4,9,57,246);
        List<Integer> a2 = Arrays.asList(4, 57, 9, 246);
        List<Integer> decrescente = Arrays.asList(246,57,9,4);
        
        assertEquals(test.sort(a1, 0), crescente);
        assertEquals(test.sort(a2, 2), decrescente);
        

	
	
	}

}
