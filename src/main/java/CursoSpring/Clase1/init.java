
package CursoSpring.Clase1;

import CursoSpring.Clase1.Repository.EstrategiaDeMantenimientoDiaJueves;
import CursoSpring.Clase1.Repository.EstrategiaPorSiFallaSQL;
import CursoSpring.Clase1.Repository.GeneradorPlanAhorroJSON;
import CursoSpring.Clase1.Repository.GeneradorPlanAhorroSQL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class init implements CommandLineRunner {
    
    @Autowired
    ClienteQueGeneraUsuario clienteQueGeneraUsuario;
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hola mundo Spring boot");
        clienteQueGeneraUsuario.generarPlanAhorro();
    }
    
}
