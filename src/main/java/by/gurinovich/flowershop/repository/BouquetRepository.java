package by.gurinovich.flowershop.repository;

import by.gurinovich.flowershop.model.Bouquet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BouquetRepository extends CrudRepository<Bouquet, Long> {
    List<Bouquet> findAll();
}
