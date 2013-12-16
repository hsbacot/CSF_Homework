import java.util.Random;

/**
 * Created by hsbacot on 12/15/13.
 */
public class PeerPair {

    public static void main(String[] args) {
        String[] peers = {"Kevin", "Ernie", "Marine", "Granger", "Shirley", "Fred", "Rachel", "Mandeep", "Hunter", "TJ"};
        int arrayLength = peers.length;

        int[] result = shuffleArray(arrayLength);

        for (int i = 1; i < 11; i+=2) {
            int place1 = result[i];
            int place2 = result[i - 1];
            String student1 = peers[place1];
            String student2 = peers[place2];
            System.out.println(student1 + " pairs with " + student2);
        }


    }

    public static int[] shuffleArray(int arrayLength) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();
        for (int i = arrayLength - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

}
