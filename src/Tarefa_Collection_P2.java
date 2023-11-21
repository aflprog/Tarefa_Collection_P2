import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Tarefa_Collection_P2 {
    public static void main(String[] args) {
        List<String> listaDeHomens = new ArrayList<>();
        List<String> listaDeMulheres = new ArrayList<>();
        Leitura_Do_Teclado teclado = new Leitura_Do_Teclado();
        String nome=" ";
        boolean a=true;

        while (a) {
            System.out.println("****** Tarefa collectin__Parte2 ******");
            System.out.println("Digite o nome que quer cadastrar indicando se " +
                    "masculico com '-M' " + "ou femenino com '-F'(Exemplo:Pamela-F ) " +
                    "ou digite 'sair' se não quiser cadastrar" +
                    " nada ou para finalizar o cadastro ");
            nome = teclado.teclado();

            if (nome.equalsIgnoreCase("sair")) {
                Collections.sort(listaDeHomens);
                Collections.sort(listaDeMulheres);
                Collections.sort(listaDeHomens);
                Collections.sort(listaDeMulheres);
                System.out.println(" Lista de Homens " + listaDeHomens);
                System.out.println(" Lista de Mulheres " + listaDeMulheres);

                a=false;

            } else {
                String[] partes = nome.split("-");

                if (partes.length == 2) {
                    String nome1 = partes[0];
                    String genero = partes[1];

                    if (genero.equalsIgnoreCase("M")) {
                        listaDeHomens.add(nome1);
                    }

                    if (genero.equalsIgnoreCase("F")) {
                        listaDeMulheres.add(nome1);
                    }
                }
            }
        }
    }
}

