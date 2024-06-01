package org.example.proiect_fis;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class AlexTests {

    @Test
    public void testGettersEmployee() {
        Employee employee = new Employee("angajatdetestare", "1234", "junior");

        assertEquals("angajatdetestare", employee.getUsername());
        assertEquals("1234", employee.getPassword());
        assertEquals("junior", employee.getRole());
    }

    @Test
    public void testGettersOrder() {
        Customer customer = new Customer("client100", "oparola", "Mic Mare", "maremic@yahoo.com");

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop",Category.LAPTOP_PC,1500,"Un laptop de test",4,false));
        products.add(new Product("PC de test",Category.DESKTOP_PC,6000,"Un PC de test",3,false));

        Order order = new Order(customer, products, "pending");

        assertEquals(customer, order.getCustomer());
        assertEquals(products, order.getProducts());
        assertEquals("pending", order.getStatus());
    }

    @Test
    public void testSetStatus() {
        Customer customer = new Customer("john_doe", "password123", "John Doe", "john@example.com");

        List<Product> produse = new ArrayList<>();
        produse.add(new Product("Laptop",Category.LAPTOP_PC,1500,"Un laptop de test",4,false));
        produse.add(new Product("PC de test",Category.DESKTOP_PC,6000,"Un PC de test",3,false));

        Order order = new Order(customer, produse, "pending");

        order.setStatus("shipped");

        assertEquals("shipped", order.getStatus());
    }

    @Test
    public void testCalculateDiscount() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Casti",Category.PERIFERICE,300,"Casti de test",3,false));
        products.add(new Product("Procesor",Category.COMPONENTE_PRE,6000,"Procesor de test",5,true));

        Promotion promotion = new Promotion("Black Friday", products, 10);

        double discount = promotion.calculateDiscount();

        assertEquals(630, discount);
    }

    @Test
    public void testToString() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Casti",Category.PERIFERICE,300,"Casti de test",3,false));
        products.add(new Product("Procesor",Category.COMPONENTE_PRE,6000,"Procesor de test",5,true));

        Promotion promotion = new Promotion("Black Friday", products, 10);

        String promoString = promotion.toString();

        assertEquals("Black Friday (Discount: 10.0%, Produse: 2)", promoString);
    }
}
