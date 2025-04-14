import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {
        
         
        // input
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");
    String nome = input.nextLine();
        System.out.println("Inserisci il tuo cognome:");
        String cognome = input.nextLine();
        System.out.println("Inserisci il tuo colore preferito:");
        String colorePreferito = input.nextLine();
        System.out.println("Inserisci il tuo giorno di nascita:");
        String giorno = input.nextLine();
        int giornoInserito = Integer.parseInt (giorno);
        System.out.println("Inserisci il tuo mese di nascita:");
        String mese = input.nextLine();
        int meseInserito = Integer.parseInt (mese);
        System.out.println("Inserisci il tuo anno di nascita:");
        String anno= input.nextLine();
        int annoInserito = Integer.parseInt (anno);

        // calcola somma
        int sommaNascita= giornoInserito + meseInserito + annoInserito;

        // passwordfinale output

        System.out.print(
            "La tua password finale sarà " + nome + "-" + cognome + "-" + colorePreferito + "-" + sommaNascita
        );

        // chiusura
                input.close();
        
    }
}
