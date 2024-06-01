package org.example.proiect_fis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;
public class CezarTests {
    private DatabaseManager databaseManager;
    private Customer validCustomer;
    private Product validProduct;
    private Product anotherProduct;
    private Order validOrder;

    @BeforeEach
    void setUp() {
        databaseManager = new DatabaseManager();
        validCustomer = new Customer("TestClient", "password123", "Test Client ", "Test@example.com");
        validProduct = new Product("Test produs", Category.DESKTOP_PC, 1000.0, "Test descriere", 5, false);
        anotherProduct = new Product("Alt produs", Category.LAPTOP_PC, 1500.0, "Alta descriere", 3, false);
        validOrder = new Order(validCustomer, Collections.singletonList(validProduct), "Pending");
    }

    @Test
    void testUpdateOrderStatus() {
        System.out.println("Testul: testUpdateOrderStatus a inceput");
        Order order = new Order(validCustomer, Collections.singletonList(validProduct), "Pending");
        order.setStatus("Completed");
        assertEquals("Completed", order.getStatus());
    }

    @Test
    void testPlaceOrderWithoutAnyProductInList() {
        System.out.println("Testul: testPlaceOrderWithoutAnyProductInList a inceput");
        Order invalidOrder = new Order(validCustomer, Collections.emptyList(), "Pending");
        int initialSize = databaseManager.getOrders().size();
        databaseManager.placeOrder(invalidOrder);
        assertEquals(initialSize, databaseManager.getOrders().size());
        assertFalse(databaseManager.getOrders().contains(invalidOrder));
    }

    @Test
    void testPlaceOrderWithoutCustomer() {
        System.out.println("Testul: testPlaceOrderWithoutCustomer a inceput");
        Order invalidOrder = new Order(null, Collections.singletonList(validProduct), "Pending");
        int initialSize = databaseManager.getOrders().size();
        databaseManager.placeOrder(invalidOrder);
        assertEquals(initialSize, databaseManager.getOrders().size());
        assertFalse(databaseManager.getOrders().contains(invalidOrder));
    }

    @Test
    void testPlaceValidOrder() {
        System.out.println("Testul: testPlaceValidOrder a inceput");
        int initialSize = databaseManager.getOrders().size();
        databaseManager.placeOrder(validOrder);
        assertEquals(initialSize + 1, databaseManager.getOrders().size());
        assertTrue(databaseManager.getOrders().contains(validOrder));
        System.out.println("O noua comanda a fost adaugata!");
    }

    @Test
    void testPlaceOrderWithMultipleProducts() {
        System.out.println("Testul: testPlaceOrderWithMultipleProducts a inceput");
        Order order = new Order(validCustomer, Arrays.asList(validProduct, anotherProduct), "Pending");
        int initialSize = databaseManager.getOrders().size();
        databaseManager.placeOrder(order);
        assertEquals(initialSize + 1, databaseManager.getOrders().size());
        assertTrue(databaseManager.getOrders().contains(order));
    }
}
