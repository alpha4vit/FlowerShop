package by.gurinovich.flowershop.config;

import by.gurinovich.flowershop.model.User;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<User> {

    @Override
    public Optional<User> getCurrentAuditor() {
        return Optional.of(new User());
    }
}
