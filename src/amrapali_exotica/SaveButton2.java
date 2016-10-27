package amrapali_exotica;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raj
 */
public class SaveButton2 {
    
    public static void main(String[] args) throws SQLException
    {

    }
    
 
    public static String insertQuery(String tname,String cname[],String cvalue[]){
		String str="INSERT INTO ";
		str=str+tname+"("+cname[0];
		
		for(int i=1;i<cname.length;i++)
			str=str+","+cname[i];
			
		str=str+") VALUES('"+cvalue[0]+"'";
		
                for(int i=1;i<cvalue.length;i++)
			str=str+",'"+cvalue[i]+"'";
			
		str=str+");";
		
		//System.out.println(str);
		return str;
		}
    public static String updateQuery(String tname,String cname[],String cvalue[]){
		String str="update table ";
		str=str+tname+" set "+cname[0];
		
		for(int i=1;i<cname.length;i++)
			str=str+","+cname[i];
			
		str=str+") VALUES('"+cvalue[0]+"'";
		
                for(int i=1;i<cvalue.length;i++)
			str=str+",'"+cvalue[i]+"'";
			
		str=str+");";
		
		//System.out.println(str);
		return str;
		}
}
