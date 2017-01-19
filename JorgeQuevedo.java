import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class JorgeQuevedo {

    public static void main(String[] args) {

        char caracter = ' ';
        String mensaje = "";
        String mensajeCod = "";
        int ascii=0;
        
        Scanner teclado = new Scanner(in);
        
        out.println("Por favor introduce un mensaje: ");        
        mensaje = teclado.next();
        
        for (int i = 0; i < mensaje.length(); i++){
            caracter = mensaje.charAt(i);
            ascii = (int)caracter;
            mensajeCod = mensaje + ascii;
        }
        
        
        StringBuffer sb = new StringBuffer(mensajeCod);
        mensajeCod = sb.reverse().toString();
        
        out.println("El mensaje codificado es: "+mensajeCod);
        out.println((int)'a');
    }

}