package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@EqualsAndHashCode
@NoArgsConstructor

public class Book extends Product {
    private String author;
    private int pages;
    private String publisher;

    public Book(int id, String name, int price, String author, int pages, String publisher) {
        super(id, name, price);
        this.author = author;
        this.pages = pages;
        this.publisher = publisher;
    }

}
