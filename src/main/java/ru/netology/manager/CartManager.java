package ru.netology.manager;

import ru.netology.domain.Product;
import ru.netology.exceptions.NotFoundException;
import ru.netology.repository.ProductRepository;

public class CartManager {
    ProductRepository repository = new ProductRepository();

    public void deleteById(int id) throws NotFoundException {
        if (repository.findById(id) == null) {
            throw new NotFoundException("Element with id: " + id + " not found");
        } else {
            repository.removeById(id);
            System.out.println("operation done");
        }

    }

    public Product search(int id) {
        repository.findById(id);
        return null;
    }

}


