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

import modelo.Libro;


/**
 *
 * @author Luis
 */
public class Librodao {
    public static boolean registrar(Libro l){
        try{
        String SQL="insert into libros values (?, ?, ?, ?, ?,)(select now()),?,?));";

        Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        st.setString(1, l.getIsbn() );
        st.setString(2, l.getTitulo() );
        st.setString(3, l.getDescripcion() );
        st.setString(4, l.getNombre_autor() );
        st.setString(5, l.getPublicacion() );
        st.setInt(6, l.getCodigo_categoria());
        st.setString(7, l.getNit_editorial());
        st.setString(8, l.getDescripcion() );
        if (st.executeUpdate()>0){
            return true;
        }else{
            return false;
        }
        } catch (SQLException ex) {
            return false;
        }
       
    }
    public static boolean actualizar(Libro l){
        try{
        String SQL="update libros set " + 
                 "   titulo=?, " + 
                 "   descripcion =?, " +
                 "   nombre_autor, = ?," +
                 "   publicacion = ?, "+
                
                 "   codigo_categoria = ?,"+
                 "   nit_editorial = ? " +
                 "   where isbn= ?";

        Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        st.setString(7, l.getIsbn() );
        st.setString(1, l.getTitulo() );
        st.setString(2, l.getDescripcion() );
        st.setString(3, l.getNombre_autor() );
        st.setString(4, l.getPublicacion() );
        st.setInt(5, l.getCodigo_categoria());
        st.setString(6, l.getNit_editorial());
        
        
        
            
        if (st.executeUpdate()>0){
            return true;
        }else{
            return false;
        }
        } catch (SQLException ex) {
            return false;
        }
    }
    
    public static boolean eliminar(Libro l){
        try{
        String SQL="delate from libros where isbn=?"; 
            

        Connection con=Conexion.conectar();
        PreparedStatement st=con.prepareStatement(SQL);
        st.setString(1, l.getIsbn() );
        
            
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
            l.setNombre_autor(resultado.getString("nombre_autor"));
            l.setDescripcion(resultado.getString("descripcion"));
            l.setFecha_registro(resultado.getString("fecha_registro"));
            l.setPublicacion(resultado.getString("publicacion"));
            l.setNit_editorial(resultado.getString("nit_editorial"));
            l.setCodigo_categoria(resultado.getInt("codigo_categoria"));
            lista.add(l);
        }
        
        
        return lista;
        } catch (SQLException ex) {
            return null;
        }
       
    }
    
}

