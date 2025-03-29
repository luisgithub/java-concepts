package com.lugarsoft.java_concepts.patterns.structural.adapter;

import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelResponse;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoResponse;

public class PACYAdapter implements TimbradoGateway {

    private PACYTimbradoGateway pacyTimbradoGateway;

    public PACYAdapter(PACYTimbradoGateway pacyTimbradoGateway){
        this.pacyTimbradoGateway = pacyTimbradoGateway;
    }

    @Override
    public TimbradoResponse timbrar(TimbradoRequest timbradoRequest) {
        return pacyTimbradoGateway.timbrar(timbradoRequest);
    }

    @Override
    public CancelResponse cancel(CancelRequest cancelRequest) {
        return pacyTimbradoGateway.cancel(cancelRequest);
    }
}
