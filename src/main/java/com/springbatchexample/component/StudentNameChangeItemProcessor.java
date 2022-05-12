package com.springbatchexample.component;

import com.springbatchexample.entity.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentNameChangeItemProcessor implements ItemProcessor {

    @Override
    public Student process(Object item) throws Exception {
        Student student= (Student)item;
        if(student.getName().equals("arya")){
            student.setName("stark");
        }
        return student;
    }
}
