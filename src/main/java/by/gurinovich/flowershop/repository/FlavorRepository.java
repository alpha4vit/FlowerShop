package by.gurinovich.flowershop.repository;

import by.gurinovich.flowershop.model.Flavor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlavorRepository extends CrudRepository<Flavor, Long> {

}
