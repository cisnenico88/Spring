/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoSpring.Clase1.Components;

import CursoSpring.Clase1.Model.Usuario;
import org.springframework.stereotype.Component;

@Component
public class TransformaUsuarioJSON implements TransformaJSON<Usuario>{

    @Override
    public String toJSON(Usuario t) {
        
        return new com.google.gson.Gson().toJson(t);
        
    }
    
}
