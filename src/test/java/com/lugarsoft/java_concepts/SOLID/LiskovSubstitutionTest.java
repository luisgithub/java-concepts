package com.lugarsoft.java_concepts.SOLID;

import com.lugarsoft.java_concepts.solid.liskov.AreaCalculationService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
public class LiskovSubstitutionTest {

    @Autowired
    private AreaCalculationService areaCalculationService;
    /*
    Objects of superclass should be replaceable with objects
    of a subclass without affecting the correctness of the program.
     */

    @Test
    void calculate_area_liskov_implementation(){
        Map<String, Object> areaCalculation = areaCalculationService.getAreas();
        System.out.println("Rectangle area: "+areaCalculation.get("rectangle"));
        Assertions.assertNotNull(areaCalculation.get("rectangle"));
        System.out.println("Square area: "+areaCalculation.get("square"));
        Assertions.assertNotNull(areaCalculation.get("square"));
    }
}
