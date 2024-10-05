package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class EMP {

    @Id
    private String id;
    private String name;
    private int salery;

    public EMP() {
    }

    public EMP(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salery = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalery() {
        return salery;
    }
}
