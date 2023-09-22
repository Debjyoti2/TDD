package com.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

	@Test
	public void truncateHeader_length_excced_limit_test() {

		String input = "The economy is about to decline in a fast pace";
		int headerLimit = 40;

		Assertions.assertEquals("The economy is about to decline in a fas...", StringUtil.truncateHeader(input, headerLimit));
	}

	@Test
	public void truncateHeader_length_notexcced_limit_test() {

		String input = "The economy is about to decline";
		System.out.println("length :: " + input.length());
		int headerLimit = 40;

		Assertions.assertEquals("The economy is about to decline", StringUtil.truncateHeader(input, headerLimit));
	}

}
