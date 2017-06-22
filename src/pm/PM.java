/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pm;

import Diseño.Iniciar_sesión;

/**
 *
 * @author josekilljoy95
 */
public class PM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Iniciar_sesión iniciar = new Iniciar_sesión();
        iniciar.setTitle("Iniciar sesión");
        iniciar.setLocationRelativeTo(null);
        iniciar.setVisible(true);
    }
}
