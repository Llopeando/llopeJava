import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> mapaDePaises = new HashMap<>();

        String pais = "España";
        String capital = "Madrid";
        mapaDePaises.put(pais, capital);

        String capitalEs = mapaDePaises.get(pais);
        System.out.println(capital);


        System.out.println("¿El pais " + pais + " está añadido? " + mapaDePaises.containsKey(pais));
        System.out.println("¿El pais " + pais + " tiene capital? " + mapaDePaises.containsValue(capital));
    }
}