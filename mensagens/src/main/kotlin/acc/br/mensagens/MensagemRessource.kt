package acc.br.mensagens

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MensagemRessource(val service: MensagemService){
    @GetMapping
    fun index(): List<Mensagem> = service.findMensagens()

    @PostMapping
    fun post(@RequestBody message: Mensagem){
        service.post(message)
    }
}