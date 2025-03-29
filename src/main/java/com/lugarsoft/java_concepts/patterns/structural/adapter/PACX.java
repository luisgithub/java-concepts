package com.lugarsoft.java_concepts.patterns.structural.adapter;

import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelResponse;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoResponse;

import java.util.UUID;

public class PACX {
    public TimbradoResponse timbrar(TimbradoRequest timbradoRequest){
        System.out.println("timbrando con PACX: "+ timbradoRequest);
        TimbradoResponse response = new TimbradoResponse();
        response.setResponse(timbradoRequest.getBody() + "UUID: "+ UUID.randomUUID());
        return response;
    }

    public CancelResponse cancel(CancelRequest cancelRequest){
        System.out.println("cancelando con PACX: " + cancelRequest);
        CancelResponse cancelResponse = new CancelResponse();
        cancelResponse.setResponse(cancelRequest + "UUIDcancelacion: " + UUID.randomUUID());
        return cancelResponse;
    }
}
