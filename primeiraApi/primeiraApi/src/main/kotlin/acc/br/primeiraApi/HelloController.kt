package acc.br.primeiraApi

import org.springframework.web.bind.annotation.RestController

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
}