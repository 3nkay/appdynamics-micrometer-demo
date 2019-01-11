package home.nkavtur.mictometerdemo;

import home.nkavtur.mictometerdemo.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;


@SpringBootApplication
public class MictometerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MictometerDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(JmsTemplate jmsTemplate) {
        return args -> {

            jmsTemplate.convertAndSend("usersQueue",
                    new User().setUuid("123cg34234123-gdfgdf234234-sdff").setEmail("n.kavtur@gmail.com").setCountry("Belarus")
            );
        };
    }
}

