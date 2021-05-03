package com.company.myapp;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Oportunidad {
    int idOportunidad;
    Cliente cliente; // la PERSONA a la que le voy a vender
    LocalDate ultimaFechaDeContacto;//ultima vez que hable
    LocalDate proximaFechaDeContacto;//proxima vez
    boolean clienteAceptaLlamadas;
    double precioOfrecido;
    //Map<Item, Double> itemsOfrecidos;
    //List<Item> items;// productos y servicios ofrecidos

}