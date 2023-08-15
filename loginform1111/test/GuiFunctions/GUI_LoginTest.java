/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiFunctions;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */



//                                         login checking functions is done                                       //



public class GUI_LoginTest {
    
    public GUI_LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of check_info method, of class GUI_Login.
     */
    
    
    
    @Test
    public void testCheck_info_manager_sign_in() {
        System.out.println("check_info");
        int expected = 1;
        String Email = "admin@gmail.com";
        String Password = "admin";
        GUI_Login instance = new GUI_Login();
        int actual = instance.check_info(Email, Password);
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testCheck_info_pharmacist_sign_in() {
        System.out.println("check_info");
        int expected = 2;
        String Email = "sarahfarghaly@gmail.com";
        String Password = "123321";
        GUI_Login instance = new GUI_Login();
        int actual = instance.check_info(Email, Password);
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testCheck_info_pharmacist_sign_in_wrong_info() {
        System.out.println("check_info");
        int expected = 0;
        String Email = "sarahfarghaly";
        String Password = "123321";
        GUI_Login instance = new GUI_Login();
        int actual = instance.check_info(Email, Password);
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testCheck_info_pharmacist_sign_in_wrong_info_forpassword() {
        System.out.println("check_info");
        int expected = 0;
        String Email = "sarahfarghaly@gmail.com";
        String Password = "1231";
        GUI_Login instance = new GUI_Login();
        int actual = instance.check_info(Email, Password);
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     @Test
    public void testCheck_info_pharmacist_sign_in_empty() {
        System.out.println("check_info");
        int expected = 0;
        String Email = "";
        String Password = "";
        GUI_Login instance = new GUI_Login();
        int actual = instance.check_info(Email, Password);
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testCheck_info_manager_sign_in_emptyEmail() {
        System.out.println("check_info");
        int expected = 0;
        String Email = "";
        String Password = "admin";
        GUI_Login instance = new GUI_Login();
        int actual = instance.check_info(Email, Password);
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
     @Test
    public void testCheck_info_manager_sign_in_emptypassword() {
        System.out.println("check_info");
        int expected = 0;
        String Email = "admin@gmail.com";
        String Password = "";
        GUI_Login instance = new GUI_Login();
        int actual = instance.check_info(Email, Password);
        assertEquals(expected, actual);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
    
    
    
    /**
     * Test of validateFields method, of class GUI_Login.
     */
    
    
    
    
    
    
    // ------------------------------------------------------------------------------------- //
    
    
    
    
    
    @Test
    public void testValidateFields_emptyfields() {
        System.out.println("validateFields");
        boolean expected=false;
        String Email = "";
        String Password = "";
        GUI_Login instance = new GUI_Login();
        boolean result = instance.validateFields(Email, Password);
        assertEquals(expected, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
     @Test
     public void testValidateFields_notemptyfields() {
        System.out.println("validateFields");
        boolean expected=true;
        String Email = "admin@gmail.com";
        String Password = "admin";
        GUI_Login instance = new GUI_Login();
        boolean result = instance.validateFields(Email, Password);
        assertEquals(expected, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     
     
     
      @Test
     public void testValidateFields_emptyEmail() {
        System.out.println("validateFields");
        boolean expected=false;
        String Email = "";
        String Password = "admin";
        GUI_Login instance = new GUI_Login();
        boolean result = instance.validateFields(Email, Password);
        assertEquals(expected, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
     
     
     
      @Test
  
    public void testValidateFields_emptypassword() {
        System.out.println("validateFields");
        boolean expected=false;
       String Email = "sarahfhaly@gmail.com";
        String Password = "";
       GUI_Login instance = new GUI_Login();
        boolean result = instance.validateFields(Email, Password);
        assertEquals(expected, result);
      // TODO review the generated test code and remove the default call to fail.
        
    }

    // ------------------------------------------------------ sum salary ----------------------------------------------------------- //
    

    /**
     * Test of calculateTotalSalary method, of class GUI_Login.
     */
    @Test
    public void testCalculateTotalSalary() {
        System.out.println("calculateTotalSalary");
        GUI_Login instance = new GUI_Login();
        int expResult = 99026;
        int result = instance.calculateTotalSalary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
   
    @Test
    public void testCalculateTotalSalary_emptysalary() {   //failed because there is values for salary ins the table 
        System.out.println("calculateTotalSalary");
        GUI_Login instance = new GUI_Login();
        int expResult = 0;
        int result = instance.calculateTotalSalary();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
         //             -------------------------------- done ------------------------------------------                    //
      
      
}
