/*
Saya Villeneuve Andhira Suwandhi NIM 2108067 mengerjakan Latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/

/* Import library */
#include <iostream>
#include <string>

/* Using standard namespace */
using namespace std;

/* Class declaration */
class Mahasiswa {
    private:
        int id;             // Nomor data
        string MHS_NUM;     // NIM mahasiswa
        string MHS_NAME;    // Nama mahasiswa
        string MHS_PRODI;   // Program studi
        string MHS_FAC;     // Fakultas

    public:
        // constructor
        Mahasiswa() {
            this->id = 0;
            this->MHS_NUM = "";
            this->MHS_NAME = "";
            this->MHS_PRODI = "";
            this->MHS_FAC = "";
        }
        //constructor
        Mahasiswa(int n, string nim, string nama, string prodi, string fakultas) {
            this->id = n;
            this->MHS_NUM = nim;
            this->MHS_NAME = nama;
            this->MHS_PRODI = prodi;
            this->MHS_FAC = fakultas;
        }

        // setter
        void setId(int n) {
            this->id = n;
        }
        void setMHS_ID(string nim) {
            this->MHS_NUM = nim;
        }
        void setMHS_NAME(string nama) {
            this->MHS_NAME = nama;
        }
        void setMHS_PRODI(string prodi) {
            this->MHS_PRODI = prodi;
        }
        void setMHS_FAC(string fakultas) {
            this->MHS_FAC = fakultas;
        }

        // getter
        int getId() {
            return this->id;
        }
        string getMHS_ID() {
            return this->MHS_NUM;
        }
        string getMHS_NAME() {
            return this->MHS_NAME;
        }
        string getMHS_PRODI(){
            return this->MHS_PRODI;
        }
        string getMHS_FAC(){
            return this->MHS_FAC;
        }

        // methods
        /* to ADD data */
        void Insert() {
            system("cls");
            cout << "### INSERT DATA ###" << endl;
            cout << "--- No space allowed!" << endl;
            // ID data
            cout << "ID                         : ";
            cin >> this->id;
            // NIM mahasiswa
            cout << "Masukkan NIM mahasiswa     : ";
            cin >> this->MHS_NUM;
            // Nama mahasiswa
            cout << "Masukkan Nama mahasiswa    : ";
            cin >> this->MHS_NAME;
            // Program studi
            cout << "Masukkan Program studi     : ";
            cin >> this->MHS_PRODI;
            // Fakultas
            cout << "Masukkan Fakultas          : ";
            cin >> this->MHS_FAC;
            cout << "\n### Data added ... ###\n" << endl;
            cout << "\n\n";
        }

        /* to DISPLAY all data */
        void Show(Mahasiswa m[], int n) {
            system("cls");
            cout << "########## Daftar Mahasiswa ##########" << endl;
            // if there isn't data yet
            if (n == 0) {
                cout << "!!!No data!!!" << endl;
            }
            // if at least 1 record in data
            else {
                for (int i = 0; i < n; i++) {
                    cout << "ID         : " << m[i].id << endl;
                    cout << "NIM        : " << m[i].MHS_NUM << endl;
                    cout << "NAMA       : " << m[i].MHS_NAME << endl;
                    cout << "PRODI      : " << m[i].MHS_PRODI << endl;
                    cout << "FAKULTAS   : " << m[i].MHS_FAC << endl;
                    cout << "========================================" << endl;
                }
            }
            // new line after
            cout << "\n\n";
        }

        /* to EDIT a data by id */
        void Update(Mahasiswa m[], int n) {
            system("cls");
            // print all data
            Show(m, n);
            // instantiate
            int find, found;
            // find ID in data
            cout << "\n\n### UPDATE DATA ###" << endl;
            cout << "Masukkan ID mahasiswa yang ingin diubah :";
            cin >> find;
            // init
            found = 0;
            // update each attribute
            for (int i = 0; i < n; i++) {
                // record that has same id
                if (find == m[i].getId()) {
                    cout << "\n\n### updating ... ###" << endl;
                    cout << "Masukkan NIM baru mahasiswa     : ";
                    cin >> m[i].MHS_NUM;
                    cout << "Masukkan Nama baru mahasiswa    : ";
                    cin >> m[i].MHS_NAME;
                    cout << "Masukkan Program studi baru     : ";
                    cin >> m[i].MHS_PRODI;
                    cout << "Masukkan Fakultas baru          : ";
                    cin >> m[i].MHS_FAC;
                    // sign that the current record was updated
                    cout << "\n\n### Data updated ###" << endl;
                    // new line after
                    cout << "\n\n";
                    // it means that the record has found
                    found = 1;
                    break;
                }
            }
            // if the ID is not found in data
            if (found == 0) {
                cout << "### ID is nout found ###" << endl;
            }
        }

        /* to DELETE a data by id */
        void Delete(Mahasiswa m[], int &n) {
            system("cls");
            // print all data
            Show(m, n);
            // instantiate
            int find, found;
            // find ID in data
            cout << "\n\n### DELETE DATA ###" << endl;
            cout << "Masukkan ID mahasiswa yang ingin dihapus :";
            cin >> find;
            // init
            found = 0;
            for (int i = 0; i < n; i++) {
                // record that has same id
                if (find == m[i].getId()) {
                    // shift record to maks
                    for (int j = i; j < n; j++) {
                        m[j] = m[j+1];
                    }
                    // delete record
                    n--;
                    // sign that the current record was deleted
                    cout << "\n\n### Data successfully deleted ###" << endl;
                    // new line after
                    cout << "\n\n";
                    // it means that the record has found
                    found = 1;
                    break;
                }
            }
            // if the ID is not found in data
            if (found  == 0) {
                cout << "\n\n### ID is nout found ###" << endl;
                cout << "\n\n";
            }

        }
    
        // destructor
        ~Mahasiswa() {
        }
};