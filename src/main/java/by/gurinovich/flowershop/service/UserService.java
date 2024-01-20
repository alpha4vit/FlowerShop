package by.gurinovich.flowershop.service;

import by.gurinovich.flowershop.exception.NotFoundException;
import by.gurinovich.flowershop.model.User;
import by.gurinovich.flowershop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    public User getById(Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("User with this id not found!"));
    }

}
