import java.util.Scanner;

public class Leitura_Do_Teclado {
    public  static String teclado(){
        Scanner texto=new Scanner(System.in);
        String str;
        str= texto.nextLine();

        //texto.close();  /*se habilitar esse comando da erro na segunda leitura de console-->
        /*ERRO : Exception in thread "main" java.util.NoSuchElementException: No line found
	                      at java.base/java.util.Scanner.nextLine(Scanner.java:1651)
	                      at parte2.Ler_o_Teclado_P2.leitura_Do_Teclado(Ler_o_Teclado_P2.java:9)
	                      at parte2.Collection_P2.main(Collection_P2.java:16)
        */
        return str;


    }
}