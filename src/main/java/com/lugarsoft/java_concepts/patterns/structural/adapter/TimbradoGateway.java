package com.lugarsoft.java_concepts.patterns.structural.adapter;

import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.CancelResponse;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoRequest;
import com.lugarsoft.java_concepts.patterns.structural.adapter.dto.TimbradoResponse;

public interface TimbradoGateway {
    TimbradoResponse timbrar(TimbradoRequest timbradoRequest);
    CancelResponse cancel(CancelRequest cancelRequest);
}
