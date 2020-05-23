
package CursoSpring.Clase1;

import CursoSpring.Clase1.Model.Usuario;
import CursoSpring.Clase1.Repository.EstrategiaDeMantenimientoDiaJueves;
import CursoSpring.Clase1.Repository.EstrategiaPorSiFallaSQL;
import CursoSpring.Clase1.Repository.GeneradorPlanAhorro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteQueGeneraUsuario {
    
    @Autowired
    EstrategiaPorSiFallaSQL estrategia1;
    
    @Autowired
    EstrategiaDeMantenimientoDiaJueves estrategia2;
    
    public void generarPlanAhorro(){
        System.out.println("Generando plan de ahorro..........");
        Usuario usu = new Usuario(java.util.UUID.randomUUID().toString(), "Nicolas", "Cisneros");
        estrategia1.generar(usu);
        estrategia2.generar(usu);
        estrategia1.generar(usu);
    } 
    
}
