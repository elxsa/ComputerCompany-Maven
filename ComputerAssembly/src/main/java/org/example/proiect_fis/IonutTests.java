package org.example.proiect_fis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class IonutTests {
    private ServiceRequest serviceRequest;
    private Customer customer;
    @BeforeEach
    public void setUp() {
        customer = new Customer("usernamedetest", "password123", "Ionut Moldoveanu", "ion.popescu@example.com");
        serviceRequest = new ServiceRequest(customer, "Fix computer", "2024-05-30");
    }

    @Test
    public void testServiceRequestCreation() {
        assertNotNull(serviceRequest);
        assertEquals(customer, serviceRequest.getCustomer());
        assertEquals("Fix computer", serviceRequest.getDescription());
        assertEquals("2024-05-30", serviceRequest.getDate());
        assertEquals("Pending", serviceRequest.getStatus());
    }

    @Test
    public void testGetCustomer() {
        assertEquals(customer, serviceRequest.getCustomer());
    }

    @Test
    public void testGetDescription() {
        assertEquals("Fix computer", serviceRequest.getDescription());
    }

    @Test
    public void testGetDate() {
        assertEquals("2024-05-30", serviceRequest.getDate());
    }

    @Test
    public void testSetStatus() {
        serviceRequest.setStatus("Completed");
        assertEquals("Completed", serviceRequest.getStatus());
    }
}
