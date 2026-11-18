public class Product implements IProduct {
    private String[] products;
    private int[][] sales; 
    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = sales.length * sales[0].length; // 3 x 3 = 9
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int maxTotal = -1;
        String popular = "";
        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                productTotal += sales[i][j];
            }
            if (productTotal > maxTotal) {
                maxTotal = productTotal;
                popular = products[i];
            }
        }
        return popular;
    }
}
