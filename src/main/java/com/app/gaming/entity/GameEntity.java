package com.app.gaming.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "games")
@AllArgsConstructor
@NoArgsConstructor
public class GameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private EmpresaEntity empresaEntity;

    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private String price;

    @Column(name = "description")
    private String description;
}
