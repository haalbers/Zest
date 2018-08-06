package org.launchcode.zest.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Restaurant{
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    public Restaurant() {}

    public Restaurant(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}