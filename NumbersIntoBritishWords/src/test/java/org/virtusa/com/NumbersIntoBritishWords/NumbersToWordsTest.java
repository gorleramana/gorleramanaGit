/**
 * Created on Nov 19, 2019. 
 */
package org.virtusa.com.NumbersIntoBritishWords;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is to test different scenarios of NumbersToWords class.
 * 
 * @author RamanaGorle
 *
 */
public class NumbersToWordsTest {

	private NumbersToWords ntw;

	/**
	 * This method is to instantiate main class at a time for multiple tests
	 * 
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		ntw = new NumbersToWords();
	}

	/**
	 * This method is to deallocate the memory once it's usage is completed.
	 * 
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		ntw = null;
	}

	/**
	 * This method is to test zero
	 * @throws NumberGreaterThanMaximum 
	 */
	@Test
	public void testZero() throws NumberGreaterThanMaximum {
		assertEquals("zero", ntw.convert(0));
	}

	/**
	 * This method is to test below ten numbers
	 * @throws NumberGreaterThanMaximum 
	 */
	@Test
	public void testBelowTen() throws NumberGreaterThanMaximum {
		assertEquals("seven", ntw.convert(7));
	}

	/**
	 * This method is to test below twenty numbers
	 * @throws NumberGreaterThanMaximum 
	 */
	@Test
	public void testBelowTwenty() throws NumberGreaterThanMaximum {
		assertEquals("fifteen", ntw.convert(15));
	}

	/**
	 * This method is to test below hundred numbers
	 * @throws NumberGreaterThanMaximum 
	 */
	@Test
	public void testBelowHundred() throws NumberGreaterThanMaximum {
		assertEquals("ninety nine", ntw.convert(99));
	}

	/**
	 * This method is to test below thousand numbers
	 * @throws NumberGreaterThanMaximum 
	 */
	@Test
	public void testBelowThousand() throws NumberGreaterThanMaximum {
		assertEquals("two hundred thirty four", ntw.convert(234));
	}

	/**
	 * This method is to test one million numbers
	 * @throws NumberGreaterThanMaximum 
	 */
	@Test
	public void testOneMillion() throws NumberGreaterThanMaximum {
		assertEquals("one million", ntw.convert(1000000));
	}

	/**
	 * This method is to test max given number
	 * @throws NumberGreaterThanMaximum 
	 */
	@Test
	public void testMaxGivenNumber() throws NumberGreaterThanMaximum {
		assertEquals("nine hundred ninety nine million nine hundred ninety nine thousand nine hundred ninety nine",
				ntw.convert(999999999));
	}

	/**
	 * This method is to test billion numbers which is more than given max number
	 * 999,999,999. This is to test exception
	 * @throws NumberGreaterThanMaximum 
	 */
	@Test(expected = NumberGreaterThanMaximum.class)
	public void testBillion() throws NumberGreaterThanMaximum {
		assertEquals(" one billion", ntw.convert(1000000000));
	}

	/**
	 * This method is to test negative number
	 * @throws NumberGreaterThanMaximum 
	 */
	@Test
	public void testNegativeNumber() throws NumberGreaterThanMaximum {
		assertEquals("negative one thousand two hundred thirty four", ntw.convert(-1234));
	}
}
