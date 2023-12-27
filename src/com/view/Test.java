package com.view;
import com.service.ProductServiceImpl;
import com.model.Product;
import com.service.ProductService;
import java.util.Scanner;
import java.util.List;

public class Test {

    public static void main(String[] args) {
 // add();
//        getAll();
//
delete();
//        getAll();


    }
    //----------add product-----------
//    static void add(){
//        Scanner sc = new Scanner(System.in);
//        char flag= 'y';
// ProductService ps = new ProductServiceImpl();
//        do{
//
//            Product p = new Product();
//            System.out.println("enter id");
//            p.setId(sc.nextInt());
//            System.out.println("enter name:");
//            p.setName(sc.next());
//
////            p.setId(344);
////            p.setName("TV");
//
//            ps.addProduct(p);
//            System.out.println("do you wanna add more[y/n]");
//            flag = sc.next().charAt(0);
//        }while(flag =='y');
//
//
//    }
    //---------get all Product----------
//    static void getAll(){
//        ProductService ps = new ProductServiceImpl();
//        List<Product>  pList = ps.getAllProducts();
//        System.out.println(pList);
//    }
   static void delete(){
       ProductService ps = new ProductServiceImpl();
    ps.deleteProduct(2);
       }
}
