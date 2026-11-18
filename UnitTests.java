import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void GetTotalProductsSold_WithValidData_ReturnsCorrectValue() {
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {{25,18,20},{15,10,12},{18,15,20}};
        Product p = new Product(products, sales);
        assertEquals(153, p.GetTotalProductsSold());
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {{25,18,20},{15,10,12},{18,15,20}};
        Product p = new Product(products, sales);
        assertEquals(17.0, p.GetAverageProductSold(), 0.01);
    }
}
