package com.company.myapp;

public class Main {

    public static void main(String[] args) {
        for(Cliente cliente: ClienteDAO.getClientes())
            System.out.println(cliente);

       // Cliente nuevoCliente = new Cliente("sabri","ceo","discord","3838383","sabri@discord.com");
       // Cliente nuvo = new Cliente("Jose","Gerente","Atletic","365896","jose@atletic.com");

       // ClienteDAO.guardarCliente(nuvo);

    }
}
