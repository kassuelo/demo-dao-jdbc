package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("============SELLER TEST=============");

		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();

		System.out.println("=== TEST 2: seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
		System.out.println("=== TEST 3: seller findAll ===");
		dep = new Department(2, null);
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println();
		
//		System.out.println("=== TEST 4: seller insert ===");
//		Seller newSeller = new Seller (null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
//		sellerDao.insert(newSeller);
//		System.out.println("Inserted! New id = " + newSeller.getId());
//		System.out.println();
		
		System.out.println("=== TEST 5: seller update ===");
		seller = sellerDao.findById(1);
		seller.setName("Martha Waine");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		System.out.println();
		
		System.out.println("=== TEST 6: seller delete ===");
		System.out.println("Enter id for delete test:");
//		int id = sc.nextInt();
//		sellerDao.deleteById(id);
//		System.out.println("Delete completed!");
//		sc.close();
		
		System.out.println("============DEPARTMENT TEST=============");
		
		System.out.println("=== TEST 1: seller findById ===");
		dep = departmentDao.findById(3);
		System.out.println(dep);
		System.out.println();

		
		System.out.println("=== TEST 2: department findAll ===");

		List<Department> depList = departmentDao.findAll();
		for (Department obj : depList) {
			System.out.println(obj);
		}
		System.out.println();
		
//		System.out.println("=== TEST 3: department insert ===");
//		Department newDep = new Department (null, "Anything");
//		departmentDao.insert(newDep);
//		System.out.println("Inserted! New id = " + newDep.getId());
//		System.out.println();
		
//		System.out.println("=== TEST 4: department update ===");
//		Department depUpdate = departmentDao.findById(7);
//		depUpdate.setName("Test Update");
//		departmentDao.update(depUpdate);
//		System.out.println("Update completed!");
//		System.out.println();
		
		System.out.println("=== TEST 5: department delete ===");
		System.out.println("Enter id for delete test:");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		sc.close();
	}

}
