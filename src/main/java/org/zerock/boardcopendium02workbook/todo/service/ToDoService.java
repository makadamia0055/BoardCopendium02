package org.zerock.boardcopendium02workbook.todo.service;

import org.zerock.boardcopendium02workbook.todo.dto.TodoDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public enum ToDoService{
    INSTANCE;

    public void register(TodoDTO todoDTO){
        System.out.println("DEBUG........"+todoDTO);
    }

    public List<TodoDTO> getList(){
        return IntStream.range(0, 10).mapToObj(i->{
            TodoDTO dto = new TodoDTO();
            dto.setTno((long)i);
            dto.setTitle("Todo.." +i);
            dto.setDueDate(LocalDate.now());
            return dto;
        }).collect(Collectors.toList());
    }

    public TodoDTO get(Long tno){
        TodoDTO dto = new TodoDTO();
        dto.setTno(tno);
        dto.setTitle("SAMPLE Todo");
        dto.setDueDate(LocalDate.now());
        dto.setFinished(true);
        return dto;
    }
}
