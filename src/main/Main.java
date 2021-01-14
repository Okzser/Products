package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Product;
import entities.UsedProduct;
import entities.ImportedProduct;

public class Main {
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        Product p;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();
        
        System.out.println("Enter the number of products:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " Data:");
            System.out.print("Common, used or imported? (c/u/i) ");
            char ch = sc.next().charAt(0);

            System.out.print("Name: ");
            String pName = sc.next();

            System.out.print("Price: ");
            Double pPrice = sc.nextDouble();

            if (ch == 'c') {
                list.add(new Product(pName, pPrice));
                        
            } else if (ch == 'i') {
                System.out.print("Customs fee: ");
                Double pCustomsFee = sc.nextDouble();
                
                list.add(new ImportedProduct(pName, pPrice, pCustomsFee));
            } else if (ch == 'u'){
                System.out.print("Manufacture Date (DD/MM/YYYY): ");
                Date pDate = sdf.parse(sc.next());

                list.add(new UsedProduct(pName, pPrice, pDate));
            } else {
                System.out.println("That's not a possible type of product!");
                list.add(p = new Product(pName, pPrice));
            }
        }
        System.out.println("PRICE TAGS:");
        for(Product a : list ) {
            System.out.println(a.priceTag());
        }
        sc.close();
    }
}

