package acc.br.primeiraApi

import org.springframework.web.bind.annotation.*
import java.io.FileReader
import com.google.gson.Gson

@RestController 
class HelloController(val helloService: HelloService){

    @GetMapping("/hello")
    fun helloKotlin(): String{
        return "hello world"
    }

    @GetMapping("/hello-service")
    fun helloKotlinService(): String{
        return helloService.getHello()
    }

    @GetMapping("/hello-voce")
    fun helloKotlinVoce(): String{
        return "André Philipe"
    }

    @GetMapping("/helloBrasil")
    fun helloKotlinBrasil(): String{
        return "{ \"pais\": \"Brasil\" }"
    }

    @GetMapping("/Erro")
    fun helloKotlinErro(): String{
        return throw CustomException("Falha simulada")
    }
}


class CustomException(error: String) : Exception(error)