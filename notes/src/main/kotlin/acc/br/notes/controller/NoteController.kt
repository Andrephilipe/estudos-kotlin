package acc.br.notes.controller

import acc.br.notes.model.Note
import acc.br.notes.repository.NoteRepository
import acc.br.notes.services.NoteServices

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.lang.Exception


@RestController
@RequestMapping("/notas")
class NoteController (val noteServices: NoteServices){

    @Autowired
    lateinit var notaRepository: NoteRepository

    @GetMapping
    fun helloService(): List<Note> {
        return noteServices.getNotes()
    }

    @PostMapping
    fun add(@RequestBody nota: Note): Note{
        return noteServices.addNota(nota)
    }

    @PutMapping("{id}")
    fun alter(@PathVariable id: Long, @RequestBody nota: Note): Note{
        if(notaRepository.existsById(id)){
            noteServices.alterNota(nota)
        }else{
            return throw CustomException("Id nao encontrado")
        }
        return Note()
        
    }

    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long, @RequestBody nota: Note): Note{
            if(notaRepository.existsById(id)){
                notaRepository.delete(nota)
            
        }else{
            return throw CustomException("Id nao encontrado")
        }
        return Note()

    }

    class CustomException(error: String) : Exception(error)

}