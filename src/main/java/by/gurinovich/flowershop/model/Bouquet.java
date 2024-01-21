package by.gurinovich.flowershop.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "bouquets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Bouquet extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Double price;

}
