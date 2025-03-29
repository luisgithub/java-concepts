package com.lugarsoft.java_concepts.patterns.structural.adapter;

import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelResponse;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoResponse;

import java.util.UUID;

public class PACY {
    public TimbradoResponse timbrar(TimbradoRequest timbradoRequest){
        System.out.println("timbrando con PACY: "+ timbradoRequest);
        TimbradoResponse response = new TimbradoResponse();
        response.setResponse(timbradoRequest + " UUID: " + UUID.randomUUID());
        return response;
    }

    public CancelResponse cancel(CancelRequest cancelRequest){
        System.out.println("cancelando con PACY: " + cancelRequest);
        CancelResponse cancelResponse = new CancelResponse();
        cancelResponse.setResponse(cancelRequest + " UUID: " + UUID.randomUUID());
        return cancelResponse;
    }

}
