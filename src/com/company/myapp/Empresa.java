package com.company.myapp;

import java.util.List;

public class Empresa { // XEVEN (empresa VENDEDORA)
    private List<Vendedor> vendedoras; // tatiana, alba, geraldine
    private List<Item> catalogo; // lo que puedo vender (productos y servicios)
    private String direccion;
    private String nombreEmpresa;
    private List<Oportunidad> oportunidades;// LAZY !! PORFA
}