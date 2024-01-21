package by.gurinovich.flowershop.util.mapper.impl;

import by.gurinovich.flowershop.dto.BouquetDTO;
import by.gurinovich.flowershop.model.Bouquet;
import by.gurinovich.flowershop.util.mapper.Mappable;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BouquetMapper implements Mappable<Bouquet, BouquetDTO> {

    private final ModelMapper modelMapper;

    @Override
    public BouquetDTO toDto(Bouquet entity) {
        return modelMapper.map(entity, BouquetDTO.class);
    }

    @Override
    public Bouquet fromDto(BouquetDTO dto) {
        return modelMapper.map(dto, Bouquet.class);
    }

    @Override
    public List<BouquetDTO> toDtos(List<Bouquet> entities) {
        return entities.stream().map(this::toDto).toList();
    }

    @Override
    public List<Bouquet> toEntities(List<BouquetDTO> dtos) {
        return dtos.stream().map(this::fromDto).toList();
    }

}
