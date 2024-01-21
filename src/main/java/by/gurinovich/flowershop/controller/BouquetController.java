package by.gurinovich.flowershop.controller;

import by.gurinovich.flowershop.dto.BouquetDTO;
import by.gurinovich.flowershop.model.Bouquet;
import by.gurinovich.flowershop.service.BouquetService;
import by.gurinovich.flowershop.util.mapper.impl.BouquetMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bouquets")
@RequiredArgsConstructor
public class BouquetController {

    private final BouquetService bouquetService;
    private final BouquetMapper bouquetMapper;

    @GetMapping
    public ResponseEntity<List<BouquetDTO>> getAll(){
        return ResponseEntity.ok(bouquetMapper.toDtos(bouquetService.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BouquetDTO> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(bouquetMapper.toDto(bouquetService.getById(id)));
    }

    @PostMapping("/create")
    public ResponseEntity<BouquetDTO> createFlavor(@RequestBody BouquetDTO bouquetDTO){
        Bouquet bouquet = bouquetMapper.fromDto(bouquetDTO);
        return ResponseEntity.ok(bouquetMapper.toDto(bouquetService.save(bouquet)));
    }



}
