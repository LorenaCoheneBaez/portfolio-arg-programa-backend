/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.backendcohene.portfolio.controller;

import com.backendcohene.portfolio.entity.ExperienciaLaboral;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author lore_
 */
public class ExperienciaLaboralControllerNGTest {
    
    public ExperienciaLaboralControllerNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getAllExperiencia method, of class ExperienciaLaboralController.
     */
    @org.testng.annotations.Test
    public void testGetAllExperiencia() {
        System.out.println("getAllExperiencia");
        ExperienciaLaboralController instance = new ExperienciaLaboralController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.getAllExperiencia();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExperienciaLaboralById method, of class ExperienciaLaboralController.
     */
    @org.testng.annotations.Test
    public void testGetExperienciaLaboralById() {
        System.out.println("getExperienciaLaboralById");
        Long id = null;
        ExperienciaLaboralController instance = new ExperienciaLaboralController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.getExperienciaLaboralById(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addExperiencia method, of class ExperienciaLaboralController.
     */
    @org.testng.annotations.Test
    public void testAddExperiencia() {
        System.out.println("addExperiencia");
        ExperienciaLaboral experienciaLaboral = null;
        ExperienciaLaboralController instance = new ExperienciaLaboralController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.addExperiencia(experienciaLaboral);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateExperiencia method, of class ExperienciaLaboralController.
     */
    @org.testng.annotations.Test
    public void testUpdateExperiencia() {
        System.out.println("updateExperiencia");
        ExperienciaLaboral experienciaLaboral = null;
        ExperienciaLaboralController instance = new ExperienciaLaboralController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.updateExperiencia(experienciaLaboral);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteExperiencia method, of class ExperienciaLaboralController.
     */
    @org.testng.annotations.Test
    public void testDeleteExperiencia() {
        System.out.println("deleteExperiencia");
        Long id = null;
        ExperienciaLaboralController instance = new ExperienciaLaboralController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.deleteExperiencia(id);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
