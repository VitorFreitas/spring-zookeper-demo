package cloudconfig


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


@Configuration
@ComponentScan
@EnableScheduling
@EnableAutoConfiguration
class CloudConfigApplication {

    static void main(String[] args) {
        SpringApplication.run CloudConfigApplication, args
    }

    @Autowired
    private PropertyService propertyService;

    @Scheduled(fixedRate=10000L)
    public void run() {
        System.out.println(propertyService.prop());
    }

}