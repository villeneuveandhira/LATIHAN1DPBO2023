<?php

/*
Saya Villeneuve Andhira Suwandhi NIM 2108067 mengerjakan Latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
*/

/* Import library */
require ('Mahasiswa.php');

/* Program */
system('clear');

// Instantiate
$obj = array();             // array of objects
$temp = new Mahasiswa();    // object

// Initialize
$menu = 0;
$n = 0;

// Output
echo "*** LATIHAN 1 DPBO 2023 ***<br>";
echo "=== Informasi Daftar Mahasiswa ===<br>";
// to add and read data (hardcoded data)
$temp = new Mahasiswa(); // 'new' or instantiate
$temp->Insert();
$obj[$n] = $temp;
$n++;

/*
echo "<br>Choose option :<br>";
echo "1. Show Data<br>";
echo "2. Insert Data<br>";
echo "3. Update Data<br>";
echo "4. Delete Data<br>";
echo "5. Terminate<br>";
// user input
$menu = (int) readline("<br>Option : ");
switch($menu) {
    // to display all records
    case 1:
        // 'new' / reset object
        $temp = new Mahasiswa();
        system('clear');
        $temp->Show($obj, $n);
        break;
    // to add data
    case 2:
        // 'new' / reset object
        $temp = new Mahasiswa();
        system('clear');
        $temp->Insert();
        $obj[$n] = $temp;
        $n++;
        break;
    // to edit data
    case 3:
        // 'new' / reset object
        $temp = new Mahasiswa();
        system('clear');
        $temp->Update($obj, $n);
        break;
    // to delete data
    case 4:
        // 'new' / reset object
        $temp = new Mahasiswa();
        system('clear');
        $temp->Delete($obj, $n);
        $n--;
        break;
    // to terminate or close the program
    case 5:
        exit(0);
    // any num other than the case(s)
    default:
        system('clear');
        echo "### WARNING!! Please choose from 1-5 .. ###\n\n\n";
    }
// do {
// } while ($menu != 5); // still looping as long as it's not case 5 or exit
*/

?>
