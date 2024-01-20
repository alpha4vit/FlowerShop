package by.gurinovich.flowershop.controller;

import by.gurinovich.flowershop.exception.NotFoundException;
import by.gurinovich.flowershop.model.Flavor;
import by.gurinovich.flowershop.repository.FlavorRepository;
import by.gurinovich.flowershop.service.FlavorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flavor")
@RequiredArgsConstructor
public class FlavorController {

    private final FlavorService flavorService;

    @GetMapping("/{id}")
    public ResponseEntity<Flavor> getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(flavorService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Flavor> createFlavor(@RequestBody Flavor flavor){
        return ResponseEntity.ok(flavorService.save(flavor));
    }


}
