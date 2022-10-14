package liga.medical.queuereader.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "liga.medical.queuereader")
public class QueueReaderApplication {
    public static void main(String[] args) {
        SpringApplication.run(QueueReaderApplication.class, args);
    }
}
