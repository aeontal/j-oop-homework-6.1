package ru.netology.manager;

import ru.netology.domain.PurchaseItem;
import ru.netology.exceptions.NotFoundException;
import ru.netology.repository.CartRepository;

public class CartManager {
    private CartRepository repository;

//при удалении проверяем наличие
    public void removeById(int id) {
        if (repository.findById(id) != null) {
            repository.removeById(id);
        } else {
            throw new NotFoundException();
        }
    }


    public CartManager(CartRepository repository) {
        this.repository = repository;
    }

    public void add(PurchaseItem item) {
        repository.save(item);
    }

    public PurchaseItem[] getAll() {
        PurchaseItem[] items = repository.findAll();
        PurchaseItem[] result = new PurchaseItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    public PurchaseItem[] findById(int id) {
        PurchaseItem[] result = repository.findById(id);
        return result;
    }

}


