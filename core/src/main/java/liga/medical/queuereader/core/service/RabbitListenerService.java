package liga.medical.queuereader.core.service;

import liga.medical.queuereader.dto.rabbit.RabbitMessageDto;

public interface RabbitListenerService {

    void processDailyQueue(RabbitMessageDto message);

    void processAlertQueue(RabbitMessageDto message);

    void processErrorQueue(RabbitMessageDto message);
}
