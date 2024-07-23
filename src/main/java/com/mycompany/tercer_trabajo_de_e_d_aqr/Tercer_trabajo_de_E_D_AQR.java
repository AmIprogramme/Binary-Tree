

package com.mycompany.tercer_trabajo_de_e_d_aqr;


import Interfaces.Menu;
import Clases.Movil;

public class Tercer_trabajo_de_E_D_AQR {

    public static void main(String[] args) {
        
        Movil Objeto_de_registro = new Movil();
        
        Menu abrir = new Menu();
        abrir.establecer_instancia(Objeto_de_registro);
        abrir.setVisible(true);
    }
}
