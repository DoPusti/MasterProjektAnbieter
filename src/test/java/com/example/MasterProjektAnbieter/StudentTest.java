package com.example.MasterProjektAnbieter;


import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.Unmarshaller;
import org.junit.jupiter.api.Test;

import java.io.File;

class StudentTest {

    @Test
    void testStudent() {
        try {

            File file = new File("src\\main\\resources\\student.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Student student = (Student) unmarshaller.unmarshal(file);

            System.out.println(student.getFirstName());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}