import java.util.ArrayList;
import java.util.List;//
import java.util.stream.Collectors;

public class rolesList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//<interface><type> <name> = new <classe><type>();
        list.add("Maria");//classe ArrayList e uma classe que contei muitos ussos do List
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");

        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("list.size(): " + list.size());
        System.out.println("---------------------");
        //FUNCAO LAMBIDA CHAMADA PREDICADO
        list.removeIf(x -> x.charAt(0) == 'M');//predicado: atender uma acao especifica no caso uma remover da lista x talque x.caracter(primerio) que senha 'M'
        for (String x : list) {//FOR EACH:for (Tipo apelido : coleção){
            System.out.println("list.add" + x); // &lt;comando 1&gt;
            }                                   // &lt;comando 2&gt;}
        System.out.println("---------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("---------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        //vai recever a informacao = converter.String().predicado.voltar para lista
        for (String x : result) {
            System.out.println("List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());: " + x);
        }
        System.out.println("---------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        //vai recever a informacao = converter.String().predicado.pegar o primeiro elemento do predicado; se nao existir.retorn null
        System.out.println(name);
    }
}
