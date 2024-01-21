package by.gurinovich.flowershop.service;

import by.gurinovich.flowershop.exception.NotFoundException;
import by.gurinovich.flowershop.model.Bouquet;
import by.gurinovich.flowershop.repository.BouquetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BouquetService {

    private final BouquetRepository bouquetRepository;

    public Bouquet getById(Long id){
        return bouquetRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Bouquet with this id not found!"));
    }

    public List<Bouquet> getAll(){
        return bouquetRepository.findAll();
    }

    @Transactional
    public Bouquet save(Bouquet bouquet){
        return bouquetRepository.save(bouquet);
    }

}
