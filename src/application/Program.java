package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;


public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: seller findByDepartment ===");
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: seller insert  ===");
//        Seller seller1 = new Seller(null, "Greg", "gred@gmail.com", new Date(), 4000.00, dep);
//        sellerDao.insert(seller1);
//        System.out.println("Insert new id = " + seller1);

        System.out.println("\n=== TEST 4: seller findAll  ===");
        Seller seller2 = new Seller();
        List<Seller> list1 = sellerDao.findAll();
        list1.forEach(System.out::println);



    }
}
