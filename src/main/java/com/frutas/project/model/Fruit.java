package com.frutas.project.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@NoArgsConstructor
@Document

public class Fruit {

    @Id
    private String idFruit;
    private String nameFruit;
    private int priceFruit;

}
