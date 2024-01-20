package by.gurinovich.flowershop.config;

import by.gurinovich.flowershop.model.User;
import by.gurinovich.flowershop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class AuditorAwareImpl implements AuditorAware<User> {

    private final UserService userService;

    @Override
    public Optional<User> getCurrentAuditor() {
        return Optional.of(userService.getById(1L));
    } //TODO after security set up

}
