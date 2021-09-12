package ru.job4j.models;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "history")
public class HistoryCarDriver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Car> cars = new LinkedList<>();
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Driver> drivers = new LinkedList<>();
}
