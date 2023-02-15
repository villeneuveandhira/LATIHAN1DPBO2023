/*
Saya Villeneuve Andhira Suwandhi NIM 2108067 mengerjakan Latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/

/* Import library */
import java.util.Scanner;

/* Program */
public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();        

        // Instantiate
        Mahasiswa[] obj = new Mahasiswa[99];    // array of objects
        Mahasiswa temp = new Mahasiswa();       // object
        int menu, n;
        Scanner sc = new Scanner(System.in);

        // Initialize
        menu = 0;
        n = 0;

        // Output
        do {
            System.out.println("*** LATIHAN 1 DPBO 2023 ***");
            System.out.println("=== Informasi Daftar Mahasiswa ===");
            System.out.println("\nChoose option :");
            System.out.println("1. Show Data");
            System.out.println("2. Insert Data");
            System.out.println("3. Update Data");
            System.out.println("4. Delete Data");
            System.out.println("5. Terminate");
            System.out.print("\n\nOption : ");
            // user input
            try {
                menu = sc.nextInt();
            } catch (Exception e) {
                System.out.println("The input is invalid!");
            }
            switch(menu) {
                // to display all records
                case 1:
                    // 'new' / reset object
                    temp = new Mahasiswa();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    temp.Show(obj, n);
                    break;
                // to add data
                case 2:
                    // 'new' / reset object
                    temp = new Mahasiswa();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    temp.Insert();
                    obj[n] = temp;
                    n++;
                    break;
                // to edit data
                case 3:
                    // 'new' / reset object
                    temp = new Mahasiswa();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    temp.Update(obj, n);
                    break;
                // to delete data
                case 4:
                    // 'new' / reset object
                    temp = new Mahasiswa();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    temp.Delete(obj, n);
                    n--;
                    break;
                // to terminate or close the program
                case 5:
                    System.exit(0);
                // any num other than the case(s)
                default:
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("### WARNING!! Please choose from 1-5 .. ###");
                    System.out.println("\n");
            }
        } while (menu != 5); // still looping as long as it's not case 5 or exit
        // close scanner
        // sc.close();
    }
}