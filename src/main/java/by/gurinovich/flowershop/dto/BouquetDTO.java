package by.gurinovich.flowershop.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BouquetDTO {
    private Long id;

    private String title;

    private String description;

    private Double price;
}
