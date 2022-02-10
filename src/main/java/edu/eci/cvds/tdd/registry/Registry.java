package edu.eci.cvds.tdd.registry;
import java.util.HashMap;
public class Registry {
    private HashMap<Integer,Person> votantes;

    public Registry(){
        votantes = new HashMap<Integer,Person>();
    }
    public RegisterResult registerVoter(Person p) {

            int edad = p.getAge();
            Integer contra = p.getId();
            boolean vivo = p.isAlive();

            RegisterResult resultado = RegisterResult.VALID;
            
            
            if(!vivo){
                resultado = RegisterResult.DEAD;
            }
            else if ( (0 < edad) && (edad < 18) ){
                resultado = RegisterResult.UNDERAGE;
            }
            else if ( edad <= 0 ){
                resultado = RegisterResult.INVALID_AGE;
            }
            else if (votantes.containsKey(contra) ){
                resultado = RegisterResult.DUPLICATED;
            }
            else{
                votantes.put(contra,p);
            }

            return resultado;
        }
}