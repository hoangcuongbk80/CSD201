public class TowerOfHanoi {
    public static void main(String[] args) {
        int numberOfDisks = 3;
        char sourceRod = 'A';
        char destinationRod = 'C';
        char auxiliaryRod = 'B';

        solveTowerOfHanoi(numberOfDisks, sourceRod, destinationRod, auxiliaryRod);
    }

    public static void solveTowerOfHanoi(int disks, char source, char destination, char auxiliary) {
        if (disks == 1) {
            System.out.println("Move disk 1 from rod " + source + " to rod " + destination);
            return;
        }

        solveTowerOfHanoi(disks - 1, source, auxiliary, destination);
        System.out.println("Move disk " + disks + " from rod " + source + " to rod " + destination);
        solveTowerOfHanoi(disks - 1, auxiliary, destination, source);
    }
}
