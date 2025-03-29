package com.lugarsoft.java_concepts.patterns.structural.adapter;

import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelResponse;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoResponse;

import java.util.UUID;

public class PACYTimbradoGateway {
    public TimbradoResponse timbrar(TimbradoRequest request){
        TimbradoResponse timbradoResponse = new TimbradoResponse();
        timbradoResponse.setResponse(request + " UUID: " + UUID.randomUUID());
        return timbradoResponse;
    }

    public CancelResponse cancel(CancelRequest cancelRequest) {
        CancelResponse cancelResponse = new CancelResponse();
        cancelResponse.setResponse(cancelResponse + " UUIDCancelacion: " + UUID.randomUUID() );
        return cancelResponse;
    }
}
