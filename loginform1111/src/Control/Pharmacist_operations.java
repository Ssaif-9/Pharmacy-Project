package Control;
import Modeling.DBOperation;
import java.sql.ResultSet;
import Modeling.Pharmacist_Model;
import java.awt.List;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pharmacist_operations {

   public  static void insert_pharmacistData(int ID,String firstname,String lastname,String gender,String phonenumber,String email,String password,int salary, int age )
   {
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd ");
       LocalDateTime now = LocalDateTime.now();
   
       String query="insert into pharmacist (id,firstname,lastname,age,hired_date,pharmacist_gender,phoneNumber,email,password,salary,mng_id) values ('"+ID+"','"+firstname+"' , '"+lastname+"' , '"+age+"' , '"+ dtf.format(now)+"' , '"+gender+"' , '"+phonenumber+"', '"+email+"', '"+password+"' ,'"+salary+"',1)";
       DBOperation.setDataOrDelete(query, "New employee has been Inserted Successfully");
   }

    public  static ArrayList<Pharmacist_Model> get_pharmacistData()
    {
          String query="select * from pharmacist";
          ResultSet rs=DBOperation.getData(query);
          ArrayList<Pharmacist_Model> arr= new ArrayList();

        try {
            while(rs.next())
            {
                arr.add(new Pharmacist_Model(rs.getInt("id"),rs.getString("hired_date"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("pharmacist_gender"),rs.getString("phonenumber"),rs.getString("email"),rs.getString("password"),rs.getInt("salary"),rs.getInt("age")));
            }
            return arr;
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
        }
        finally{
            try {
                rs.close();
            } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
            }
        }
       return null;
        
    }
    
   public  static int check_Pharmacist_Acc(String email,String password)
    {
        int error_status=1;
        String Query="select *from pharmacist where email='"+email+"'and password='"+password+"'";        
         ResultSet rs=DBOperation.getData(Query);
        try {
            while(rs.next())
            {
                error_status=0;
            }       
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
          error_status=1;
        }
 
       return error_status;    
    }

    public static Pharmacist_Model Search_Pharmacist(int id)
    {   
        Pharmacist_Model obj=null;
        String Query="select *from pharmacist where id='"+id+"'";
        ResultSet rs=DBOperation.getData(Query);
        try {
            while(rs.next())
            {
                obj= new Pharmacist_Model(rs.getInt("id"),rs.getString("hired_date"),rs.getString("firstname"),rs.getString("lastname"),rs.getString("pharmacist_gender"),rs.getString("phonenumber"),rs.getString("email"),rs.getString("password"),rs.getInt("salary"),rs.getInt("age"));  
            }       
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex, "Message", JOptionPane.ERROR_MESSAGE);
         obj=null;
        }
         return obj;    
    }
    
    public static void Delete_Pharmacist(int id)
    {
        String Query="delete from pharmacist where id='"+id+"'";
       DBOperation.setDataOrDelete(Query, "");
    }
    
//    public static double getPharmacistSalaryFromDatabase(int id )
//    {
//        String Query="select salary from pharmacist where id ='"+id"'"; 
//        DBOperation.setDataOrDelete(Query, "");
//        
//    
//    }
//    
//    public static double getPharmacistSalaryFromDatabase(int id) {
//    int salary = 0;
//    
//    // Construct the SQL query
//    String query = "SELECT salary FROM pharmacist WHERE id = " + id;
//    
//    // Execute the query and retrieve the result set
//    ResultSet rs = DBOperation.getData(query);
//    
//    try {
//        // Retrieve the salary from the result set
//        if (rs.next()) {
//            salary = rs.getInt("salary");
//        }
//    } catch (SQLException e) {
//        e.printStackTrace();
//    } finally {
//        // Close the result set
//        try {
//            if (rs != null) {
//                rs.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//    
//    return salary;
//}
       
   public static ArrayList<Integer> sumSalaries() 
   {
    ArrayList<Integer> salaries = new ArrayList<>();

    String query = "SELECT salary FROM pharmacist";

    // Execute the query and retrieve the result set
    ResultSet rs = DBOperation.getData(query);

    try {
        // Loop through all the records and add up the salaries
        while (rs.next()) {
            int salary = rs.getInt("salary");
            salaries.add(salary);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Close the result set
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Convert the list of salaries to an array
    return salaries;
}
    
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
