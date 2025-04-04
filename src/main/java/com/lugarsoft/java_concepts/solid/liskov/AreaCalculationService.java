package com.lugarsoft.java_concepts.solid.liskov;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AreaCalculationService {


    public Map<String, Object> getAreas(){
        Map<String, Object> areas = new HashMap<>();
        Rectangle rectangle = new Rectangle(10d, 15d);
        Square square = new Square(30d);
        areas.put("rectangle", rectangle.computeArea());
        areas.put("square", square.computeArea());
        return areas;
    }



}
