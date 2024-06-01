package org.example.proiect_fis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoxanaTests {
    private Product product;
    private Category category;

    @BeforeEach
    void setUp() {
        product = new Product("Laptop", category, 1500.0, "High-end gaming laptop", 5, false);
    }

    @Test
    void testGetName() {
        assertEquals("Laptop", product.getName());
    }

    @Test
    void testGetCategory() {
        assertEquals(category, product.getCategory());
    }

    @Test
    void testGetPrice() {
        assertEquals(1500.0, product.getPrice());
    }

    @Test
    void testGetDescription() {
        assertEquals("High-end gaming laptop", product.getDescription());
    }

    @Test
    void testGetRating() {
        assertEquals(5, product.getRating());
    }

    @Test
    void testIsPart() {
        assertFalse(product.isPart());
    }

    @Test
    void testSetName() {
        product.setName("Desktop");
        assertEquals("Desktop", product.getName());
    }

    @Test
    void testSetPrice() {
        product.setPrice(1200.0);
        assertEquals(1200.0, product.getPrice());
    }

    @Test
    void testSetDescription() {
        product.setDescription("Mid-range desktop");
        assertEquals("Mid-range desktop", product.getDescription());
    }

    @Test
    void testSetRating() {
        product.setRating(4);
        assertEquals(4, product.getRating());
    }

    @Test
    void testSetPart() {
        product.setPart(true);
        assertTrue(product.isPart());
    }

    @Test
    void testToString() {
        String expected = "Nume: Laptop\nPret: 1500.00\nDescriere: High-end gaming laptop\nRating: 5";
        assertEquals(expected, product.toString());
    }
}
