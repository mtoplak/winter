package si.um.feri.measurements.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import si.um.feri.measurements.vao.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TestSample {
    @Autowired
    private ProductRepository dao;

    Product product;

    @Test
    void preveriMlecneIzdelke() {
        Product p = new Product(new si.um.feri.measurements.dto.Product(
                0,"mleko",25.0,-12.5, "mlecni izdelki"
        ));
        assertEquals(p.getCategory(),"mlecni izdelki");
        assertTrue(p.getMaxMeasure()>p.getMinMeasure());
    }
}
