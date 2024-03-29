package com.codegym.service.impl;

import com.codegym.model.Note;
import com.codegym.model.Type;
import com.codegym.repository.NoteRepository;
import com.codegym.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Page<Note> findAllByTitleContainingOrContentContaining(String title, String content, Pageable pageable) {
        return noteRepository.findAllByTitleContainingOrContentContaining(title, content, pageable);
    }

    @Override
    public Page<Note> findAllByType(Type type, Pageable pageable) {
        return noteRepository.findAllByType(type, pageable);
    }

    @Override
    public Page<Note> findAll(Pageable pageable) {
        return noteRepository.findAll(pageable);
    }

    @Override
    public Note findById(Long id) {
        return noteRepository.findOne(id);
    }

    @Override
    public void save(Note note) {
        noteRepository.save(note);
    }

    @Override
    public void remove(Long id) {
        noteRepository.delete(id);
    }
}
