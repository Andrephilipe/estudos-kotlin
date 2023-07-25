package acc.br.notes.services

import org.springframework.stereotype.Service
import acc.br.notes.model.Note

import acc.br.notes.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired

@Service
class NoteServices {

    @Autowired
    lateinit var notaRepository: NoteRepository

    fun getNotes(): List<Note>{
        return notaRepository.findAll().toList()
    }

    fun addNota( nota: Note): Note{
        return notaRepository.save(nota)
    }

    fun alterNota(nota: Note): Note{
        
        return notaRepository.save(nota)
    }

}