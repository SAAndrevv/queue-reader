package liga.medical.queuereader.core.service;

import liga.medical.queuereader.dto.rabbit.RabbitMessageDto;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@EnableRabbit
@Component
public class RabbitListenerServiceImpl implements RabbitListenerService {

    @Override
    @RabbitListener(queues = "daily_queue")
    public void processDailyQueue(RabbitMessageDto message) {
        System.out.println("Get message from daily_queue: " + message.getMessage());
    }

    @Override
    @RabbitListener(queues = "alert_queue")
    public void processAlertQueue(RabbitMessageDto message) {
        System.out.println("Get message from alert_queue: " + message.getMessage());
    }

    @Override
    @RabbitListener(queues = "error_queue")
    public void processErrorQueue(RabbitMessageDto message) {
        System.out.println("Get message from error_queue: " + message.getMessage());
    }

}
