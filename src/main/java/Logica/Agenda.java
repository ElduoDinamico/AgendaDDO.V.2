/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author gonchi
 */
public class Agenda {
    
private UserAgenda user;
private ArrayList<Contacto> listaContactos;



public int GetCantidadContactos(){
 
    return listaContactos.size();
}


public ArrayList<Contacto> GetContactos(){
 
    return listaContactos;
}

public Boolean agregarContacto(Contacto c){
 
    listaContactos.add(c);
    return true;  
}






}
