package ch.bbw.m151.liquibasedemo.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "category")
public class CategoryEntity {

    @Id
    String name;

    String description;
}
