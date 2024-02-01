package br.com.alura.ecommerce;

import java.util.UUID;

public class CorrelationId {

    private final String id;
    
    CorrelationId(){
        id = UUID.randomUUID().toString();
    }

    @SuppressWarnings("static-access")
    @Override
    public  String toString() {
        return "Correlation-id={0}".format(id);
    }

}
