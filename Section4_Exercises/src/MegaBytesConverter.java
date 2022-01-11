public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        int megaBite = kiloBytes / 1024;
        int remainder = kiloBytes % 1024;

        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
            System.out.println(kiloBytes + " KB = " + megaBite + " MB and " + remainder + " KB");
        }

    }

    public static void main(String[] args){
        printMegaBytesAndKiloBytes(2500);
    }
}
