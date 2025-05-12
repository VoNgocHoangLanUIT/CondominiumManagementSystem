/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process.Parking;

import ConnectDB.ConnectionUtils;
import java.sql.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author DELL
 */
public class Parking {
    public int addParkingSlot(String slotName, String slotType, String vehicle, String status, String licensePlate) throws SQLException, ClassNotFoundException {
        int i = 0;
        try (Connection con = ConnectionUtils.getMyConnection()) {
            // Gọi procedure
            String call = "{call ADD_PARKINGSLOT(?,?,?,?,?)}";
            CallableStatement cs = con.prepareCall(call);
            
            // Truyền tham số vào
            cs.setString(1, slotName);
            cs.setString(2, slotType);
            cs.setString(3, vehicle);
            cs.setString(4, status);
            cs.setString(5, licensePlate);
            
            i = cs.executeUpdate(); // thực thi procedure
        }
        catch(SQLException e){
            System.out.println("Error Code: " + e.getErrorCode()); // Error Code
            System.out.println("Error Message: " + e.getMessage());
        }
        
        return i;
    }
    
    public List<String[]> getParkingSlots() {
        List<String[]> data = new ArrayList<>();
        
        try (Connection con = ConnectionUtils.getMyConnection()) {
            String sql = "SELECT so_o_do, loai_o_do, loai_xe, trang_thai, bien_so_xe FROM ODoXe";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                String[] row = new String[5];
                row[0] = rs.getString("so_o_do");
                row[1] = rs.getString("loai_o_do");
                row[2] = rs.getString("loai_xe");
                row[3] = rs.getString("trang_thai");
                row[4] = rs.getString("bien_so_xe");
                data.add(row);
            }
        } catch (SQLException e) {
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Error Message: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error Message: " + e.getMessage());
        }
        
        return data;
    }
    
    public int deleteParkingSlot(String slotName) {
        int i = 0;
        try (Connection con = ConnectionUtils.getMyConnection()) {
            // Gọi procedure
            String call = "{call DELETE_PARKINGSLOT(?)}";
            CallableStatement cs = con.prepareCall(call);
            
            // Truyền tham số vào
            cs.setString(1, slotName);
            
            i = cs.executeUpdate(); // thực thi procedure
        }
        catch(SQLException e){
            System.out.println("Error Code: " + e.getErrorCode()); // Error Code
            System.out.println("Error Message: " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Parking.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return i;
    }
    
    public int updateParkingSlot(String slotName, String slotType, String vehicle, String status, String licensePlate) throws SQLException, ClassNotFoundException {
        int i = 0;
        try (Connection con = ConnectionUtils.getMyConnection()) {
            // Gọi procedure
            String call = "{call UPDATE_PARKINGSLOT(?,?,?,?,?)}";
            CallableStatement cs = con.prepareCall(call);
            
            // Truyền tham số vào
            cs.setString(1, slotName);
            cs.setString(2, slotType);
            cs.setString(3, vehicle);
            cs.setString(4, status);
            cs.setString(5, licensePlate);
            
            i = cs.executeUpdate(); // thực thi procedure
        }
        catch(SQLException e){
            System.out.println("Error Code: " + e.getErrorCode()); // Error Code
            System.out.println("Error Message: " + e.getMessage());
        }
        
        return i;
    }

}