package br.com.alura;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

public class NewOrderMain {

    public static void main(String[] args) {
        var producer = new KafkaProducer<String, String>(properties());
        var value = "132123,67523,7894589745";
        var record = new ProducerRecord<>("ECOMMERCE_NEW_ORDER", value, value)
        Callback callback = (data, ex) -> {
            if (ex != null){
                ex.printStackTrace();
                return;
            }
        }
        var email = "Thank you for your order! We are processing your order!"
        var emailRecord = new ProducerRecord<>("ECOMMERCE_SEND_EMAIL", email. email)
        producer.send(emailRecord, callback.get());
        producer.send(record, callback.get());
    }

    private static Properties properties() {
        var properties = new Properties();
        properties.setProperty("bootstrap.servers", "localhost:9092");
        properties.setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        return properties;
    }

}
