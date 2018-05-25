/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Categoria;

/**
 *
 * @author Luis
 */
public class CategoriaDao {
    public static boolean regisrar(Categoria cat){
       try { 
           String SQL="INSERT INTO categorias (nombre, autor)"+ "values (?,?);";
        Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        st.setString(1, cat.getNombre());
        st.setString(2, cat.getAutor());
       
            st = con.prepareStatement(SQL);
        if (st.executeUpdate()>0){
            return true;
        }else{
            return false;
        }
        } catch (SQLException ex) {
            return false;
        }
       
    }
     public static ArrayList<Categoria> listar(){
        try{
         String SQL="select * from categorias;";
        Connection con=Conexion.conectar();
        PreparedStatement st = con.prepareStatement(SQL);
        
        
        
           // st = con.prepareStatement(SQL);
           ResultSet resultado=st.executeQuery();
        ArrayList<Categoria> lista=null;
        Categoria cat;
        while(resultado.next()){
            cat=new Categoria();
            cat.setCodigo(resultado.getInt("codigo"));
            cat.setNombre(resultado.getString("nombre"));
            cat.setAutor(resultado.getString("autor"));
            lista.add(cat);
        }
        return lista;
        } catch (SQLException ex) {
            return null;
        }
       
    }
}

