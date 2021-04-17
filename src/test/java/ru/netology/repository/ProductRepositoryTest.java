package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.domain.Product;
import ru.netology.exceptions.NotFoundException;
import ru.netology.manager.CartManager;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ProductRepositoryTest {

    @Test
    void shouldDeleteById() {

        CartManager manager = new CartManager();
        manager.deleteById(3);
        Product bookNull = manager.search(3);

        assertNull(bookNull);

    }

    @Test
    public void shouldThrowNotFoundException() {

        CartManager manager = new CartManager();
        assertThrows(NotFoundException.class, () -> manager.deleteById(4));
    }
}