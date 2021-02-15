package ru.netology.repository;

import ru.netology.domain.PurchaseItem;

public class CartRepository {
    private PurchaseItem[] items = new PurchaseItem[0];

    public void removeById(int id) {
        int length = items.length-1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        int index = 0;
        for (PurchaseItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
        //System.out.println("repo done"); // for demo only
    }


    public void save(PurchaseItem item) {
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] findAll() {
        return items;
    }

    public PurchaseItem[] findById(int id) {
        PurchaseItem[] result = new PurchaseItem[1];
        for (int index = 0; index < items.length; index++) {
            if (id == index) {
                System.arraycopy(items, id, result, 0, 1);
                System.out.println("Найдено");
            } else {
            }
        }
        return result;
    }

}
