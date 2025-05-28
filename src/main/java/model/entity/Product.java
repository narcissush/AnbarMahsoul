package model.entity;

import model.entity.enums.Brand;
import model.entity.enums.Os;

import java.time.LocalDate;

public class Product {
    private int productid;
    private Brand brand;
    private Os os;
    private boolean hasCharger;
    private boolean hasHandsfree;
    private int price;
    private int count;
    private LocalDate productDate;
}
