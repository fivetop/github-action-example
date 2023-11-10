package com.example.exampleproject;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.fail;

class SkipTest {
	
	@Disabled
	@Test
	void failTest() {
			fail( "실패 테스트" );
	}
	

}
