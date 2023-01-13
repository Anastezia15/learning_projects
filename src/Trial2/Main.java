package Trial2;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Map<String, List<Product>> purchase = new HashMap<>();
        String path = "D:\\purchases.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String s = scanner.nextLine();
            String[] personPurchase = s.split(" ");
            List<Product> prodList = new ArrayList<>();

            for (int i = 1; i < personPurchase.length; i++) {
                Product product = new Product(personPurchase[i], (float) (Math.round(rand.nextFloat(400) * 100) / 100.0));
                prodList.add(product);
            }
            purchase.put(personPurchase[0], prodList);
        }
        scanner.close();
        for (Map.Entry<String, List<Product>> entry : purchase.entrySet()) {
            System.out.println(entry.getKey() + " " + ((entry.getValue()).toString()));
        }

        FileWriter newFile = new FileWriter("result.txt");
        for (Map.Entry<String, List<Product>> entry : purchase.entrySet()) {
            float sum = 0;
            for (Product p : entry.getValue()
            ) {

                sum += p.getPrice();
            }
            newFile.write(entry.getKey() + " " + sum + "\n");
        }

        newFile.close();

    }
}