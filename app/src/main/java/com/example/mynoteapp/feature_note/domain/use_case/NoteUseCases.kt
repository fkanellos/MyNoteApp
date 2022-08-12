package com.example.mynoteapp.feature_note.domain.use_case

data class NoteUseCases(
    val getNotesUC: GetNotesUC,
    val deleteNoteUC: DeleteNoteUC,
    val addNoteUC: AddNote,
    val getNoteUC: GetNote
)
