public class FactorielleTest {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                throw new IllegalArgumentException("Donnez en paramètre la base de la factorielle.");
            }
            int nbEntiers;
            try {
                nbEntiers = Integer.parseInt(args[0]);
                if (nbEntiers < 0) {
                    throw new IllegalArgumentException(nbEntiers + " est négatif : la factorielle d'un nombre négatif n'est pas définie.");
                }
                if (nbEntiers <= 20) {
                    throw new SuperieurException(nbEntiers + " est grand : donner un nombre qui ne depasse pas la plage de valeur");
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("La base de la factorielle doit être ENTIERE.");
            }
            int factorielle = 1;
            for (int i = 2; i <= nbEntiers; i++) {
                factorielle *= i;
            }
            System.out.println("Voici la factorielle des " + nbEntiers + " premiers entiers : " + factorielle);  

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (SuperieurException e){
            System.out.println ("e.getMessage()");
        } catch (Exception e) {
            System.out.println("Une erreur inattendue est survenue : " + e.getMessage());
        } 
    }
}