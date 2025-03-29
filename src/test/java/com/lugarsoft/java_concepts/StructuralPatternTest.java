package com.lugarsoft.java_concepts;

import com.lugarsoft.java_concepts.patterns.structural.adapter.TimbradoClient;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class StructuralPatternTest {


    @Autowired
    private TimbradoClient timbradoClient;

    @Test
    void timbrado_implemented_with_adapter_pattern_test(){
        TimbradoResponse response = timbradoClient.timbradoPACX();
        Assertions.assertNotNull(response);
        System.out.println(response.getResponse());
    }
}
