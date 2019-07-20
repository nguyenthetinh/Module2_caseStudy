package com.codegym.repository;

import com.codegym.model.Note;
import com.codegym.model.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NoteRepository extends PagingAndSortingRepository<Note,Long> {

    Page<Note> findAllByTitleContainingOrContentContaining(String title,String content,Pageable pageable);

    Page<Note> findAllByType(Type type, Pageable pageable);
}
