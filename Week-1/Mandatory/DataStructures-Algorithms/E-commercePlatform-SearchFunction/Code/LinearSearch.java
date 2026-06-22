public class LinearSearch {
    public boolean search(Product[] products,int pid){
        for(Product product : products) {
            if(product.getProductId() == pid) {
                    return true;
            }
        }
        return false;
    }
}
