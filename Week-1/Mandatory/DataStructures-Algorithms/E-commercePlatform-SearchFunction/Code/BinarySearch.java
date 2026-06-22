public class BinarySearch {
    public boolean search(Product[] products,int pid){
        int low=0,high=products.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(products[mid].getProductId()==pid){
                return true;
            }
            else if(products[mid].getProductId()>pid){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}
