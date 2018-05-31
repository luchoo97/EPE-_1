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
import modelo.Editorial;
import modelo.Libro;


/**
 *
 * @author Luis
 */
public class Librodao {
    public static boolean regisrar(Libro l){
        try{
        String SQL="insert into libros " +"values (?, ?, ?, ?, ?, (select now()),?,?);";

        Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        st.setString(1, l.getIsbn() );
        st.setString(2, l.getTitulo() );
        st.setString(3, l.getDescripcion() );
        st.setString(4, l.getNombre_autor() );
        st.setString(5, l.getFecha_registro() );
        st.setInt(6, l.getCodigo_categoria());
        st.setString(7, l.getNit_editorial());
        
        
        
            
        if (st.executeUpdate()>0){
            return true;
        }else{
            return false;
        }
        } catch (SQLException ex) {
            return false;
        }
       
    }
     public static ArrayList<Libro> listar(){
        try{
         String SQL="select * from libros";
        Connection con=Conexion.conectar();
        PreparedStatement st = con.prepareStatement(SQL);
        
        
        
           // st = con.prepareStatement(SQL);
           ResultSet resultado=st.executeQuery();
        ArrayList<Libro> lista=new ArrayList<>();
        Libro l;
        while(resultado.next()){
            l=new Libro();
            l.setIsbn(resultado.getString("isbn"));
            l.setTitulo(resultado.getString("titulo"));
            l.setDescripcion(resultado.getString("descripcion"));
            l.setFecha_registro(resultado.getString("fecha_registro"));
            l.setPublicacion(resultado.getString("publicacion"));
            l.setNit_editorial(resultado.getString("nit_editorial"));
            l.setCodigo_categoria(resultado.getInt("codigo_cagoria"));
            lista.add(l);
        }
        return lista;
        } catch (SQLException ex) {
            return null;
        }
       
    }
    
}

