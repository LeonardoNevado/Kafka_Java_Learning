package br.com.alura.ecommerce;

public class Message<T> {

    private T payload;
    private CorrelationId id;

    Message(CorrelationId id, T payload) {

        this.id =  id;
        this.payload = payload;
    }

    @Override
    public  String toString() {
        return "Message{" +
                "id=" + id + 
                ", payload=" + payload +
                '}';
    
    }
}
