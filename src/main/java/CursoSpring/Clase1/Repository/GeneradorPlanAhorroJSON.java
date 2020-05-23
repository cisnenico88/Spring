/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoSpring.Clase1.Repository;

import CursoSpring.Clase1.Components.TransformaUsuarioJSON;
import CursoSpring.Clase1.Model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class GeneradorPlanAhorroJSON implements GeneradorPlanAhorro{

    @Autowired
    TransformaUsuarioJSON transformausuJSON;
    
    @Override
    public void generar(Usuario usuario) {
        System.out.println("Generado formato JSON");
        String enJSON = transformausuJSON.toJSON(usuario);
        System.out.println(enJSON);
    }
    
}
