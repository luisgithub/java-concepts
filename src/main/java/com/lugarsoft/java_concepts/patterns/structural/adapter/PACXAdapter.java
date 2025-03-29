package com.lugarsoft.java_concepts.patterns.structural.adapter;

import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelResponse;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoResponse;

public class PACXAdapter implements TimbradoGateway{

    private PACX timbradoGateway;

    public PACXAdapter(PACX timbradoGateway){
        this.timbradoGateway = timbradoGateway;
    }

    @Override
    public TimbradoResponse timbrar(TimbradoRequest timbradoRequest) {
        return timbradoGateway.timbrar(timbradoRequest);
    }

    @Override
    public CancelResponse cancel(CancelRequest cancelRequest) {
        return timbradoGateway.cancel(cancelRequest);
    }
}
