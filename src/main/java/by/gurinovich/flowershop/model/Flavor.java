package by.gurinovich.flowershop.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "flawors")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Flavor extends AuditEntity<User> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String description;

    private Double price;

}
