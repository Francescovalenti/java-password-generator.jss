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
        String giornoNascitaInserito = input.nextLine();
        int giornoNascita = Integer.parseInt (giornoNascitaInserito);
        System.out.println("Inserisci il tuo mese di nascita:");
        String meseNascitaInserito = input.nextLine();
        int meseNascita = Integer.parseInt (meseNascitaInserito);
        System.out.println("Inserisci il tuo anno di nascita:");
        String annoNascitaInserito = input.nextLine();
        int annoNascita = Integer.parseInt (annoNascitaInserito);

        // calcola somma
        int sommaNascita= giornoNascita + meseNascita + annoNascita;

        // passwordfinale output

        System.out.print(
            "La tua password finale sarà " + nome + "-" + cognome + "-" + colorePreferito + "-" + sommaNascita
        );

        // chiusura
                input.close();
        
    }
}
