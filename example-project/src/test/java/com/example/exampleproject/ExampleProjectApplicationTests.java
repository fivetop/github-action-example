package com.example.exampleproject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

class ExampleProjectApplicationTests {

	@Test
	void failTest() {
			fail( "실패 테스트" );
	}
	
	@Test
	void successTest() {
			assertThat( 1 ).isEqualTo( 1 );
	}

}
