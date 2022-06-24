/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.backendcohene.portfolio.controller;

import com.backendcohene.portfolio.entity.ExperienciaLaboral;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author lore_
 */
public class ExperienciaLaboralControllerTest {
    
    public ExperienciaLaboralControllerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getAllExperiencia method, of class ExperienciaLaboralController.
     */
    @Test
    public void testGetAllExperiencia() {
        System.out.println("getAllExperiencia");
        ExperienciaLaboralController instance = new ExperienciaLaboralController();
        ResponseEntity<List<ExperienciaLaboral>> expResult = null;
        ResponseEntity<List<ExperienciaLaboral>> result = instance.getAllExperiencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExperienciaLaboralById method, of class ExperienciaLaboralController.
     */
    @Test
    public void testGetExperienciaLaboralById() {
        System.out.println("getExperienciaLaboralById");
        Long id = null;
        ExperienciaLaboralController instance = new ExperienciaLaboralController();
        ResponseEntity<ExperienciaLaboral> expResult = null;
        ResponseEntity<ExperienciaLaboral> result = instance.getExperienciaLaboralById(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addExperiencia method, of class ExperienciaLaboralController.
     */
    @Test
    public void testAddExperiencia() {
        System.out.println("addExperiencia");
        ExperienciaLaboral experienciaLaboral = null;
        ExperienciaLaboralController instance = new ExperienciaLaboralController();
        ResponseEntity<ExperienciaLaboral> expResult = null;
        ResponseEntity<ExperienciaLaboral> result = instance.addExperiencia(experienciaLaboral);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateExperiencia method, of class ExperienciaLaboralController.
     */
    @Test
    public void testUpdateExperiencia() {
        System.out.println("updateExperiencia");
        ExperienciaLaboral experienciaLaboral = null;
        ExperienciaLaboralController instance = new ExperienciaLaboralController();
        ResponseEntity<ExperienciaLaboral> expResult = null;
        ResponseEntity<ExperienciaLaboral> result = instance.updateExperiencia(experienciaLaboral);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteExperiencia method, of class ExperienciaLaboralController.
     */
    @Test
    public void testDeleteExperiencia() {
        System.out.println("deleteExperiencia");
        Long id = null;
        ExperienciaLaboralController instance = new ExperienciaLaboralController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.deleteExperiencia(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
