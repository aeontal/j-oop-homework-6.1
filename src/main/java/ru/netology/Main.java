//package ru.netology;
//
//import ru.netology.domain.PurchaseItem;
//import ru.netology.manager.CartManager;
//import ru.netology.repository.CartRepository;
//
//public class Main {
//  public static void main(String[] args) {
//    CartManager manager = new CartManager(new CartRepository());
//    PurchaseItem first = new PurchaseItem(1, 1, "Java Core", 1000, 1);
//    PurchaseItem second = new PurchaseItem(2, 2, "Java Core", 2000, 2);
//    PurchaseItem third = new PurchaseItem(3, 3, "Java Core", 3000, 3);
//    PurchaseItem forth = new PurchaseItem(4, 4, "Java Core", 4000, 4);
//    PurchaseItem fifth = new PurchaseItem(5, 5, "Java Core", 5000, 5);
//
//    manager.add(first);
//    manager.add(second );
//    manager.add(third);
//    manager.add(forth);
//    manager.add(fifth);
    //manager.findById(2);
    //manager.findById(2);
  //PurchaseItem[] itog = manager.findById(6);
 // System.out.println(itog);

   //manager.removeById(3);
//System.out.println("main done"); // for demo only

//    try {
//      System.out.println("before remove");
//      manager.removeById(6);
//      System.out.println("after remove");
//    } catch (ArrayIndexOutOfBoundsException e) {
//      e.printStackTrace();
//      System.out.println("specific catch");
//    } catch (RuntimeException e) {
//      System.out.println("runtime catch");
//    } catch (Exception e) {
//      System.out.println("catch");
//    } finally {
//      System.out.println("finally");
//    }

    //try {
     // System.out.println("before remove");
     // manager.removeById(2);
     // System.out.println("after remove");
    //} catch (Throwable e) {

   // }




   // System.out.println("main done"); // for demo only
  }
}

