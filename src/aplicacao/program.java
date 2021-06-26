package aplicacao;

import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

import entities.empregados;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<empregados> list = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("\nempredado %d#%n", i + 1);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();
            //empre RECEBE DO CONTRUTOR EMPREGADO TODOS OS VALORES
            empregados empre = new empregados(id, nome, salario);
            list.add(empre);//EMPRE E ADD NA LISTA COMFORME A CONTAGEM '0 A N' ACONTECE
        }
        //PRECISA VERIFICAR SE O ID EXISTE
        System.out.print("\nDigite a identificação do funcionário que terá aumento de salário: ");
        int idSalario = sc.nextInt();
        Integer posicao = posicao(list, idSalario);
        if (posicao == null) {
            System.out.println("Este id não existe!");
        } else{
            System.out.print("Insira a porcentagem: ");
            double poncentagem = sc.nextDouble();
            list.get(posicao).aumentoSalario(poncentagem);
            //lista.pegaUmElementoDaListaNaPossisao(posicao).metodoAumentoSalario(porcentagem);
        }
        System.out.println();
        System.out.println("Lista de funcionários:");
        for (empregados empregados : list){
            System.out.println(empregados);
        }


    }
    public static Integer posicao(List<empregados> qualquerLista, int idSalario) {//
        for (int i = 0; i < qualquerLista.size(); i++)//contagem do 0 ate o tamanho da lista
            if (qualquerLista.get(i).getId() == idSalario) {//testar na contagem compando se o id da posicao i e igual ao id que estou procurando
               //lista.pegaUmElementoDaListaNaPossisao(i).pegaIdDele se esse Id= ao argumento:
                return i;//se encotrar retone a posisao que estou procurando;
            }
        return null;//testando todos o tamanho da lista e nada de id que esta procurando retorne null gracas ao Integer
    }
    /**public static boolean existeId(List<empregados> list, int id) {//metodo(recebe uma lista de funcionario, id)
     empregados empregados = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
     return empregados != null;
     }*/

}
