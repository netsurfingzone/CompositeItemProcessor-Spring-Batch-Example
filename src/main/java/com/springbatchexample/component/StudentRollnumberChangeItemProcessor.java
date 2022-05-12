package com.springbatchexample.component;

import com.springbatchexample.entity.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentRollnumberChangeItemProcessor implements ItemProcessor {
    @Override
    public Student process(Object item) throws Exception {
        Student student= (Student)item;
        if(student.getRollNumber().equals("0135")){
            student.setRollNumber("0136");
        }
        return student;
    }
}
