/*
Saya Villeneuve Andhira Suwandhi NIM 2108067 mengerjakan Latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/

/* Import library */
import java.util.Scanner;

/* Class declaration */
public class Mahasiswa {
    private int id;             // Nomor data
    private String MHS_NUM;     // NIM mahasiswa
    private String MHS_NAME;    // Nama mahasiswa
    private String MHS_PRODI;   // Program studi
    private String MHS_FAC;     // Fakultas

    // constructor
    public Mahasiswa() {
        this.id = 0;
        this.MHS_NUM = "";
        this.MHS_NAME = "";
        this.MHS_PRODI = "";
        this.MHS_FAC = "";
    }

    //constructor
    public Mahasiswa(int n, String nim, String nama, String prodi, String fakultas) {
        this.id = n;
        this.MHS_NUM = nim;
        this.MHS_NAME = nama;
        this.MHS_PRODI = prodi;
        this.MHS_FAC = fakultas;
    }

    // setter
    public void setId(int n) {
        this.id = n;
    }
    public void setMHS_ID(String nim) {
        this.MHS_NUM = nim;
    }
    public void setMHS_NAME(String nama) {
        this.MHS_NAME = nama;
    }
    public void setMHS_PRODI(String prodi) {
        this.MHS_PRODI = prodi;
    }
    public void setMHS_FAC(String fakultas) {
        this.MHS_FAC = fakultas;
    }

    // getter
    public int getId() {
        return this.id;
    }
    public String getMHS_ID() {
        return this.MHS_NUM;
    }
    public String getMHS_NAME() {
        return this.MHS_NAME;
    }
    public String getMHS_PRODI(){
        return this.MHS_PRODI;
    }
    public String getMHS_FAC(){
        return this.MHS_FAC;
    }

    // methods
    Scanner sc = new Scanner(System.in);
    /* to ADD data */
    public void Insert() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("### INSERT DATA ###");
        System.out.println("--- No space allowed!");
        // ID data
        System.out.print("ID                         : ");
        try {
            this.id = sc.nextInt();
        } catch (Exception e) {
            System.out.println("The input is invalid!");
        }
        // NIM mahasiswa
        System.out.print("Masukkan NIM mahasiswa     : ");
        try {
            this.MHS_NUM = sc.next();
        } catch (Exception e) {
            System.out.println("The input is invalid!");
        }
        // Nama mahasiswa
        System.out.print("Masukkan Nama mahasiswa    : ");
        try {
            this.MHS_NAME = sc.next();
        } catch (Exception e) {
            System.out.println("The input is invalid!");
        }
        // Program studi
        System.out.print("Masukkan Program studi     : ");
        try {
            this.MHS_PRODI = sc.next();
        } catch (Exception e) {
            System.out.println("The input is invalid!");
        }
        // Fakultas
        System.out.print("Masukkan Fakultas          : ");
        try {
            this.MHS_FAC = sc.next();
        } catch (Exception e) {
            System.out.println("The input is invalid!");
        }
        System.out.println("\n### Data added ... ###\n");
        System.out.println("\n");
    }

    /* to DISPLAY all data */
    public void Show(Mahasiswa m[], int n) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("########## Daftar Mahasiswa ##########");
        // if there isn't data yet
        if (n == 0) {
            System.out.println("!!!No data!!!");
        }
        // if at least 1 record in data
        else {
            for (int i = 0; i < n; i++) {
                System.out.println("ID          : " + m[i].id);
                System.out.println("NIM         : " + m[i].MHS_NUM);
                System.out.println("NAMA        : " + m[i].MHS_NAME);
                System.out.println("PRODI       : " + m[i].MHS_PRODI);
                System.out.println("FAKULTAS    : " + m[i].MHS_FAC);
                System.out.println("========================================");
            }
        }
        // new line after
        System.out.println("\n");
    }

    /* to EDIT a data by id */
    public void Update(Mahasiswa m[], int n) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // print all data
        Show(m, n);
        // instantiate
        int find, found;
        // init
        find = 0;
        found = 0;
        // find ID in data
        System.out.println("\n\n### UPDATE DATA ###");
        System.out.print("Masukkan ID mahasiswa yang ingin diubah :");
        try {
            find = sc.nextInt();
        } catch (Exception e) {
            System.out.println("The input is invalid!");
        }
        // update each attribute
        for (int i = 0; i < n; i++) {
            // record that has same id
            if (find == m[i].getId()) {
                System.out.println("\n\n### updating ... ###");
                System.out.print("Masukkan NIM baru mahasiswa     : ");
                try {
                    m[i].MHS_NUM = sc.next();
                } catch (Exception e) {
                    System.out.println("The input is invalid!");
                }
                System.out.print("Masukkan Nama baru mahasiswa    : ");
                try {
                    m[i].MHS_NAME = sc.next();
                } catch (Exception e) {
                    System.out.println("The input is invalid!");
                }
                System.out.print("Masukkan Program studi baru     : ");
                try {
                    m[i].MHS_PRODI = sc.next();
                } catch (Exception e) {
                    System.out.println("The input is invalid!");
                }
                System.out.print("Masukkan Fakultas baru          : ");
                try {
                    m[i].MHS_FAC = sc.next();
                } catch (Exception e) {
                    System.out.println("The input is invalid!");
                }
                // sign that the current record was updated
                System.out.println("\n\n### Data updated ###");
                // new line after
                System.out.println("\n");
                // it means that the record has found
                found = 1;
                break;
            }
        }
        // if the ID is not found in data
        if (found == 0) {
            System.out.println("### ID is nout found ###");
            System.out.println("\n");
        }
    }

    /* to DELETE a data by id */
    public void Delete(Mahasiswa m[], int n) {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        // print all data
        Show(m, n);
        // instantiate
        int find, found;
        // init
        find = 0;
        found = 0;
        // find ID in data
        System.out.println("\n\n### DELETE DATA ###");
        System.out.print("Masukkan ID mahasiswa yang ingin dihapus :");
        try {
            find = sc.nextInt();
        } catch (Exception e) {
            System.out.println("The input is invalid!");
        }
        for (int i = 0; i < n; i++) {
            // record that has same id
            if (find == m[i].getId()) {
                // shift record to maks
                for (int j = i; j < n; j++) {
                    m[j] = m[j+1];
                }
                // sign that the current record was deleted
                System.out.println("\n\n### Data successfully deleted ###");
                // new line after
                System.out.println("\n");
                // it means that the record has found
                found = 1;
                break;
            }
        }
        // if the ID is not found in data
        if (found  == 0) {
            System.out.println("\n\n### ID is nout found ###");
            System.out.println("\n");
        }
    }
}