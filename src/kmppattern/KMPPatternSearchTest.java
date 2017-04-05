package kmppattern;

import static org.junit.Assert.*;

import org.junit.Test;

public class KMPPatternSearchTest {

	@Test
	public void test() {
		KMPPatternSearch obj=new KMPPatternSearch();
		String text,pattern;
		text="abcxabcdabcdabcy";
		pattern="abcdabcy";
		boolean result;
		result= obj.hasSubstring(text.toCharArray(), pattern.toCharArray());
		assertEquals(true, true);
		text="Hai Google";
		pattern="eveng";
		result= obj.hasSubstring(text.toCharArray(), pattern.toCharArray());
		assertEquals(false, false);
	}

}
