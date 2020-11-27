import java.util.Arrays;

public class TestCode {
  public static void main(String[] args) {
    // Les données à transmettre (6 octets)
    byte[] valeurs = {1, 2, 3, 4, 5, 6};

    Bloc b = new Bloc((byte) 20);
  
    System.out.println("Valeurs à transmettre :");
    System.out.println(Arrays.toString(valeurs));
  
    Bloc[] blocsTransmis = Bloc.coder(valeurs);
    System.out.println("Blocs avant la transmission :");
    for (Bloc bloc : blocsTransmis) {
      System.out.println(bloc);
    }
  
    // Simule des erreurs de transmission
    // Erreur sur 2ème octet
    blocsTransmis[1].simulationErreurTransmission(0, (byte)25);
    // Erreurs sur 4ème octet
    blocsTransmis[3].simulationErreurTransmission(0, (byte)44);
    blocsTransmis[3].simulationErreurTransmission(1, (byte)55);
    blocsTransmis[3].simulationErreurTransmission(2, (byte)66);
    // Erreurs sur 5ème octet
    blocsTransmis[4].simulationErreurTransmission(1, (byte)45);
    blocsTransmis[4].simulationErreurTransmission(2, (byte)45);
    // Erreurs sur 6ème octet
    blocsTransmis[5].simulationErreurTransmission(0, (byte)58);
    blocsTransmis[5].simulationErreurTransmission(1, (byte)58);
    blocsTransmis[5].simulationErreurTransmission(2, (byte)58);
  
    System.out.println("Blocs après la transmission :");
    for (Bloc bloc : blocsTransmis) {
      System.out.println(bloc);
    }
  
    // Décodage des données reçues
    byte[] valeursTransmises = Bloc.decoder(blocsTransmis);
    // Affichage des données reçues, après le décodage
    System.out.println("Valeurs décodées");
    System.out.println(Arrays.toString(valeursTransmises));
  }
}