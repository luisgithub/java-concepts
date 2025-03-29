package com.lugarsoft.java_concepts.patterns.structural.adapter;

import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoResponse;
import org.springframework.stereotype.Component;


@Component
public class TimbradoClient {

    public TimbradoResponse timbradoPACX(){
        TimbradoGateway pacxGateway = new PACXAdapter(new PACX());
        TimbradoRequest timbradoRequest = new TimbradoRequest();
        timbradoRequest.setBody("Invoice No. 3232 - ");
        return pacxGateway.timbrar(timbradoRequest);
    }

    public TimbradoResponse timbradoPACY(){
        TimbradoGateway pacyGateway = new PACYAdapter(new PACYTimbradoGateway());
        TimbradoRequest timbradoRequest = new TimbradoRequest();
        timbradoRequest.setBody("Inovice No. 1321 - ");
        return pacyGateway.timbrar(timbradoRequest);
    }




}
