package by.gurinovich.flowershop.config;

import by.gurinovich.flowershop.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class AppConfig {

    @Bean
    public AuditorAware<User> auditorAware(){
        return new AuditorAwareImpl();
    }
}
