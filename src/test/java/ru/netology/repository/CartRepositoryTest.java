package ru.netology.repository;


import org.junit.jupiter.api.Test;
import ru.netology.domain.PurchaseItem;
import ru.netology.exceptions.NotFoundException;
import ru.netology.exceptions.Service;
import ru.netology.manager.CartManager;
import ru.netology.repository.CartRepository;
import static org.junit.jupiter.api.Assertions.*;

class CartRepositoryTest {

    private Service service = new Service();
    CartManager manager = new CartManager(new CartRepository());


    @Test
    void removeByIdExceptionTest() {
        // передача параметров в автотест?
        PurchaseItem first = new PurchaseItem(1, 1, "Java Core", 1000, 1);
        PurchaseItem second = new PurchaseItem(2, 2, "Java Core", 2000, 2);
        PurchaseItem third = new PurchaseItem(3, 3, "Java Core", 3000, 3);
        PurchaseItem forth = new PurchaseItem(4, 4, "Java Core", 4000, 4);
        PurchaseItem fifth = new PurchaseItem(5, 5, "Java Core", 5000, 5);

        manager.add(first);
        manager.add(second );
        manager.add(third);
        manager.add(forth);
        manager.add(fifth);

        manager.removeById(6);
        //не совсем понятен отлов исключения(
        assertThrows(NotFoundException.class,()->service.throwUnchecked());
    }


    // void saveTest() {
   // PurchaseItem tmp = new PurchaseItem(1, 1, "Java Core", 1000, 1);
   // PurchaseItem[] items = repository.findAll();


}

    //@Test
    //void findAll() {
   // }

    //@Test
   // void findById() {
   // }
//}