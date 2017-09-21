package Exercicios;

/**
 *
 * @author Paulo Gouveia
 */
public class Triangulo {

    private int ladoA;
    private int ladoB;
    private int ladoC;
    

   
    public String ResultadoTriangulo(int ladoA, int ladoB,int ladoC, String resultado) {
        if(ladoA==ladoB && ladoA == ladoC){
            resultado = "Equilátero";
            return resultado ;
        }
    
        else if (ladoA == ladoB && ladoC != ladoA){
          resultado = "Isoceles";
            return resultado ;
    }
        else if (ladoA == ladoC && ladoB != ladoA){
          resultado = "Isoceles";
            return resultado ;
        }
        else if (ladoC == ladoB && ladoB != ladoA){
          resultado = "Isoceles";
            return resultado ;}
   else {
            resultado = "Os três lados são diferentes";
return resultado;

        }
    }
}



   