package acc.br.mensagens

import org.springframework.stereotype.Service

@Service
class MensagemService(val db: MensagemRepository){

    fun findMensagens(): List<Mensagem> = db.findMensagens()

    fun post(mensagen: Mensagem){
        db.save(mensagen)
    }
}