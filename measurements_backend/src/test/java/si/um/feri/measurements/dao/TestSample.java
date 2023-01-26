package si.um.feri.measurements.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import si.um.feri.measurements.vao.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TestSample {
    @Autowired
    private ProductRepository dao;

    Product product;

    @Test
    void checkCategory() {
        Product p = new Product(new si.um.feri.measurements.dto.Product(
                0,"mleko",25.0,-12.5, "mlecni izdelki"
        ));
        assertEquals(1,dao.count());
        dao.deleteById(product.getId());
        assertEquals(0,dao.count());
    }
}
