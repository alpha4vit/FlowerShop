package by.gurinovich.flowershop.util.mapper;

import java.util.List;

public interface Mappable<E, D> {

    D toDto(E entity);

    E fromDto(D dto);

    List<D> toDtos(List<E> entities);

    List<E> toEntities(List<D> dtos);

}
