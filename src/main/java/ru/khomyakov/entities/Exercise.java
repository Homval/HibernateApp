package ru.khomyakov.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Exercise {

    @Id
    int id;
    String name;
    String description;

    public Exercise() {
    }

    public Exercise(String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
