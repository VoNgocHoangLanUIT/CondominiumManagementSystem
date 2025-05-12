/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process.BookingFacilities;

import ConnectDB.ConnectionUtils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class BookFacilities {
    public List<String[]> getFacilities() {
        List<String[]> data = new ArrayList<>();
        
        try (Connection con = ConnectionUtils.getMyConnection()) {
            String sql = "SELECT ma_dv_ngoai, ten_dv_ngoai, ma_nha_cung_cap, don_vi, so_luong, gia FROM DichVuNgoai";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                String[] row = new String[6];
                row[0] = rs.getString("ma_dv_ngoai");
                row[1] = rs.getString("ten_dv_ngoai");
                row[2] = rs.getString("ma_nha_cung_cap");
                row[3] = rs.getString("don_vi");
                int soLuong = rs.getInt("so_luong");
                if (rs.wasNull()) {
                    row[4] = "";  // nếu NULL trong DB thì để chuỗi rỗng
                } else {
                    row[4] = String.valueOf(soLuong);
                }
                row[5] = String.valueOf(rs.getDouble("gia"));      // chuyển double sang String
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
    public void updateSoLuong(String maDvNgoai, int soLuongMoi) {
        String sql = "UPDATE DichVuNgoai SET so_luong = ? WHERE ten_dv_ngoai = ?";
        
        try (Connection con = ConnectionUtils.getMyConnection();
             PreparedStatement stmt = con.prepareStatement(sql)) {
            
            // Set các tham số vào câu lệnh SQL
            stmt.setInt(1, soLuongMoi);
            stmt.setString(2, maDvNgoai);
            
            // Thực thi câu lệnh update
            int rowsUpdated = stmt.executeUpdate();
            
        } catch (SQLException e) {
            System.out.println("Error Code: " + e.getErrorCode());
            System.out.println("Error Message: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error Message: " + e.getMessage());
        }

    }
}
