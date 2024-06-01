package org.example.proiect_fis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class ElisaTests {
    @Test
    public void testCustomerConstructor() {
        Customer customer = new Customer("ion_popescu", "password123", "Ion Popescu", "ion.popescu@example.com");
        assertEquals("ion_popescu", customer.getUsername());
        assertEquals("password123", customer.getPassword());
        assertEquals("Ion Popescu", customer.getName());
        assertEquals("ion.popescu@example.com", customer.getEmail());
    }

    @Test
    public void testSetUsername() {
        Customer customer = new Customer("ana_ionescu", "password123", "Ana Ionescu", "ana.ionescu@example.com");
        customer.setUsername("ana_popescu");
        assertEquals("ana_popescu", customer.getUsername());
    }

    @Test
    public void testSetPassword() {
        Customer customer = new Customer("maria_popa", "password123", "Maria Popa", "maria.popa@example.com");
        customer.setPassword("new_password");
        assertEquals("new_password", customer.getPassword());
    }

    @Test
    public void testSetName() {
        Customer customer = new Customer("andrei_ionescu", "password123", "Andrei Ionescu", "andrei.ionescu@example.com");
        customer.setName("Ana Popescu");
        assertEquals("Ana Popescu", customer.getName());
    }

    @Test
    public void testSetEmail() {
        Customer customer = new Customer("george_mihai", "password123", "George Mihai", "george.mihai@example.com");
        customer.setEmail("george.mihai@newdomain.com");
        assertEquals("george.mihai@newdomain.com", customer.getEmail());}
}
