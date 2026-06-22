class Main {
    public static void main(String[] args) {

        Product[] products = {
            new Product(1, "Noodles", "Food"),
            new Product(2, "Laptop", "Electronics"),
            new Product(3, "Mobile", "Electronics")
        };

        LinearSearch l = new LinearSearch();
        BinarySearch b = new BinarySearch();

        System.out.println("Linear Search");
        System.out.println("Searching for Product ID 2: " +
                l.search(products, 2));

        System.out.println("Searching for Product ID 5: " +
                l.search(products, 5));

        System.out.println();

        System.out.println("Binary Search");

        System.out.println("Searching for Product ID 3: " +
                b.search(products, 3));

        System.out.println("Searching for Product ID 10: " +
                b.search(products, 10));
    }
}