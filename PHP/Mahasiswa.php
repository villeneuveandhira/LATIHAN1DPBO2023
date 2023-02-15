<?php

/*
Saya Villeneuve Andhira Suwandhi NIM 2108067 mengerjakan Latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/

/* Class declaration */
class Mahasiswa {
    private $id = 0 ;          // Nomor data
    private $MHS_NUM = "";     // NIM mahasiswa
    private $MHS_NAME = "";    // Nama mahasiswa
    private $MHS_PRODI = "";   // Program studi
    private $MHS_FAC = "";     // Fakultas
    
    // constructor
    public function __construct($n = 0, $nim = "", $nama = "", $prodi = "", $fakultas = "") {
        $this->id = $n;
        $this->MHS_NUM = $nim;
        $this->MHS_NAME = $nama;
        $this->MHS_PRODI = $prodi;
        $this->MHS_FAC = $fakultas;
    }
    
    // setter
    public function setId($n) {
        $this->id = $n;
    }
    public function setMHS_ID($nim) {
        $this->MHS_NUM = $nim;
    }
    public function setMHS_NAME($nama) {
        $this->MHS_NAME = $nama;
    }
    public function setMHS_PRODI($prodi) {
        $this->MHS_PRODI = $prodi;
    }
    public function setMHS_FAC($fakultas) {
        $this->MHS_FAC = $fakultas;
    }

    // getter
    public function getId() {
        return $this->id;
    }
    public function getMHS_ID() {
        return $this->MHS_NUM;
    }
    public function getMHS_NAME() {
        return $this->MHS_NAME;
    }
    public function getMHS_PRODI(){
        return $this->MHS_PRODI;
    }
    public function getMHS_FAC(){
        return $this->MHS_FAC;
    }

    // methods
    /* to DISPLAY all data */
    public function Show($m, $n) {
        system('clear');
        echo '########## Daftar Mahasiswa ##########<br>';
        // if there isn't data yet
        if ($n == 0) {
            echo '!!!No data!!!<br>';
        }
        // if at least 1 record in data
        else {
            for ($i = 0; $i < $n; $i++) {
                echo "ID          : ".$m[$i]->id . "<br>";
                echo "NIM         : ".$m[$i]->MHS_NUM . "<br>";
                echo "NAMA        : ".$m[$i]->MHS_NAME . "<br>";
                echo "PRODI       : ".$m[$i]->MHS_PRODI . "<br>";
                echo "FAKULTAS    : ".$m[$i]->MHS_FAC . "<br>";
                echo '========================================<br>';
            }
        }
        // new line after
        echo '<br><br>';
    }

    /*----------------------------------------------------------------*/

    /* to ADD data */
    public function Insert() {
        system('clear');
        echo '### INSERT DATA ###<br>';
        echo '--- No space allowed!<br>';
        // ID data
        $this->id = (int)readline("ID                         : ");
        echo '<br>';
        // NIM mahasiswa
        $this->MHS_NUM = readline("Masukkan NIM mahasiswa     : ");
        echo '<br>';
        // Nama mahasiswa
        $this->MHS_NAME = readline("Masukkan Nama mahasiswa    : ");
        echo '<br>';
        // Program studi
        $this->MHS_PRODI = readline("Masukkan Program studi     : ");
        // Fakultas
        $this->MHS_FAC = readline("Masukkan Fakultas          : ");
        echo '<br>';
        echo '<br>### Data added ... ###<br><br><br><br>';
    }

    /*----------------------------------------------------------------*/

    /* to EDIT a data by id */
    public function Update($m, $n) {
        system('clear');
        // print all data
        $this->Show($m, $n);
        // init
        $find = 0;
        $found = 0;
        // find ID in data
        echo '<br>### UPDATE DATA ###<br>';
        $find = (int)readline('Masukkan ID mahasiswa yang ingin diubah :');
        // update each attribute
        for ($i = 0; $i < $n; $i++) {
            // record that has same id
            if ($find == $m[$i]->getId()) {
                echo '<br>### updating ... ###<br>';
                $m[$i]->MHS_NUM = readline("Masukkan NIM baru mahasiswa     : ");
                $m[$i]->MHS_NAME = readline("Masukkan Nama baru mahasiswa    : ");
                $m[$i]->MHS_PRODI = readline("Masukkan Program studi baru     : ");
                $m[$i]->MHS_FAC = readline("Masukkan Fakultas baru          : ");
                // sign that the current record was updated
                echo '<br>### Data updated ###<br>';
                // new line after
                echo '<br><br>';
                // it means that the record has found
                $found = 1;
                break;
            }
        }
        // if the ID is not found in data
        if ($found == 0) {
            echo '### ID is nout found ###<br><br><br>';
        }
    }

    /*----------------------------------------------------------------*/

    /* to DELETE a data by id */
    public function Delete($m, $n) {
        system('clear');
        // print all data
        $this->Show($m, $n);
        // init
        $find = 0;
        $found = 0;
        // find ID in data
        echo '<br>### DELETE DATA ###<br>';
        $find = (int)readline("Masukkan ID mahasiswa yang ingin dihapus :");
        for ($i = 0; $i < $n; $i++) {
            // record that has same id
            if ($find == $m[$i]->getId()) {
                // shift record to maks
                for ($j = $i; $j < $n; $j++) {
                    $m[$j] = $m[$j+1];
                }
                // sign that the current record was deleted
                echo '<br>### Data successfully deleted ###<br><br><br>';
                // it means that the record has found
                $found = 1;
                break;
            }
        }
        // if the ID is not found in data
        if ($found  == 0) {
            echo '<br>### ID is nout found ###<br><br><br>';
        }
    }
}

?>