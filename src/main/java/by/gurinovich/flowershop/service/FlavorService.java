package by.gurinovich.flowershop.service;

import by.gurinovich.flowershop.exception.NotFoundException;
import by.gurinovich.flowershop.model.Flavor;
import by.gurinovich.flowershop.repository.FlavorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FlavorService {

    private final FlavorRepository flavorRepository;

    public Flavor getById(Long id){
        return flavorRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Flavor with this id not found!"));
    }

    @Transactional
    public Flavor save(Flavor flavor){
        return flavorRepository.save(flavor);
    }

}
