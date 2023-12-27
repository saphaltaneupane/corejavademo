package com.service;

import com.model.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    static List<Product> plist = new ArrayList<>();
    @Override
    public void addProduct(Product prod) {
//        plist.add(prod);
//        System.out.println("----------added sucess-------size="+plist.size());
//  try{
//      Class.forName("com.mysql.cj.jdbc.Driver");
//      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb2pm","root","");
////      String sql = "insert into product(name,price) values('"+prod.getName()+"','"+prod.getPrice()+"')";
////            Statement st = con.createStatement();
////      st.execute(sql);
////     con.close();
////      System.out.println("sucess");
//
//      //deletion
//      String sql="delete from testdb2pm where id=2";
//       Statement st = con.createStatement();
//       st.execute(sql);
//    con.close();
//       System.out.println("success");
//
//
//  } catch (ClassNotFoundException | SQLException e) {
//      throw new RuntimeException(e);
//  }
  }

    @Override
    public void deleteProduct(int index) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb2pm","root","");
//        plist.remove(index);
            String sql="delete from product where id=2";
            Statement st = con.createStatement();
            st.execute(sql);
            con.close();
            System.out.println("success");


        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        }



    @Override
    public List<Product> getAllProducts() {
        return plist;
    }
}
