package acc.br.primeiraApi

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

import org.json.JSONObject
import org.json.JSONException


@SpringBootTest( classes = arrayOf(PrimeiraApiApplication::class),
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class PrimeiraApiApplicationIntegrationTests {
    @Autowired
    lateinit var  testRestTemplate: TestRestTemplate

	@Test
	fun quandoChamado_deveRetornarHelloWord() {
		val result = testRestTemplate.getForEntity("/hello", String::class.java)

		assertNotNull(result)

		assertEquals(HttpStatus.OK, result?.statusCode)

		assertEquals("hello world", result?.body)

	}

	@Test
	fun quandoChamado_deveRetornarHelloService(){
		val result = testRestTemplate.getForEntity("/hello-service", String::class.java)

		assertNotNull(result)

		assertEquals(HttpStatus.OK, result?.statusCode)

		assertEquals("hello service", result?.body)

	}
	@Test
	fun quandoChamado_deveRetornarJson(){

		try {
			val result = testRestTemplate.getForEntity("/helloBrasil", String::class.java)

			assertNotNull(result)
	
			assertEquals(HttpStatus.OK, result?.statusCode)
	
			val jsonObject = JSONObject(result?.body)
		}
		catch(e: JSONException) {
			
		}

	}
}
