# Data diri
NIM               : 2108067<br />
Nama              : Villeneuve Andhira Suwandhi<br />
Program Studi     : Ilmu Komputer C1 2021<br />

# LATIHAN1DPBO2023
Program berbasis OOP mengunakan bahasa pemrograman C++, Java, Python, dan PHP yang menampilkan informasi daftar mahasiswa (sekumpulan objek mahasiswa) dan memiliki fitur menambah, mengubah, dan menghapus data.
Setiap mahasiswa memiliki data nama, NIM, program studi, fakultas, dan foto profil (khusus bahasa PHP).
<br />
Note:
- Boleh menambahkan properti/atribut baru<br />
- Tampilkan data selengkap-lengkapnya dalam bentuk list/tabel<br />
- Program dikumpulkan pada repository GitHub yang dibuat public dengan nama "LATIHAN1DPBO2023"<br />
- Hanya program pada branch Main yang akan dinilai dan diperiksa<br />
- Jika waktu pengumpulan sudah habis dan ingin mengupdate kode program, update pada branch lain karena mengupdate branch Main setelah waktu pengumpulan terlewat maka program tidak akan dinilai<br />
- Struktur folder :<br />
      &nbsp;+ CPP<br />
          &nbsp;&nbsp;- program<br />
          &nbsp;&nbsp;- screenshot<br />
      &nbsp;+ Java<br />
      &nbsp;Python<br />
      &nbsp;PHP<br />
      &nbsp;README.md<br />

# Desain Program () {}
Latihan 1 DPBO -> buat kelas mahasiswa dan fiturnya:<br />
Class 'Mahasiswa' {<br />
      &nbsp;-> constructor<br />
      &nbsp;-> private atr :<br />
            &nbsp;&nbsp;- Nama,<br />
            &nbsp;&nbsp;- NIM,<br />
            &nbsp;&nbsp;- Program studi,<br />
            &nbsp;&nbsp;- Fakultas,<br />
            &nbsp;&nbsp;- id untuk nomor setiap data.<br />
      &nbsp;-> public (setter-getter, dan methods) :<br />
            &nbsp;&nbsp;a. set<br />
            &nbsp;&nbsp;b. get<br />
            &nbsp;&nbsp;c. method/fitur:<br />
                  &nbsp;&nbsp;&nbsp;- menampilkan     (display/show),<br />
                  &nbsp;&nbsp;&nbsp;- menambah        (add/insert),<br />
                  &nbsp;&nbsp;&nbsp;- mengubah        (update/edit),<br />
                  &nbsp;&nbsp;&nbsp;- menghapus       (delete/erase).<br />
      &nbsp;-> destructor (ex. Java, Py)<br />
}<br />
Main program {<br />
      &nbsp;- clear/cls (optional) // supaya bersih aja<br />
      &nbsp;- 'new'/instansiasi,<br />
      &nbsp;- init (jika perlu),<br />
      &nbsp;- tampilan :<br />
            &nbsp;&nbsp;1. loop pakai switch-case,<br />
            &nbsp;&nbsp;2. exit/out sampai pilihan user,<br />
            &nbsp;&nbsp;3. case(s) ;<br />
                  &nbsp;&nbsp;&nbsp;3.1.) show,<br />
                  &nbsp;&nbsp;&nbsp;3.2.) insert,<br />
                  &nbsp;&nbsp;&nbsp;3.3.) update,<br />
                  &nbsp;&nbsp;&nbsp;3.4.) delete,<br />
                  &nbsp;&nbsp;&nbsp;3.5.) exit.<br />
}

# Documentation () {}
Untuk dokumentasi menggunakan snapshot/screenshot saat menjalankan program,
dan yang dipilih salah satu yaitu dengan bahasa C++.<br />

Kemudian, ada penjelasan alur programnya:<br />
1. compile file sesuai bahasa (c++, java, python, php) e.g. :<br />
      &nbsp;(C++) :<br />
            &nbsp;&nbsp;-> g++ -c *.cpp<br />
            &nbsp;&nbsp;-> g++ main.cpp -o main.exe<br />
2. run programnya e.g. :<br />
            &nbsp;&nbsp;-> .\main (powershell)<br />
3. setelah itu, akan muncul judul ('latihan-1-dpbo-2023') beserta pilihan opsinya dengan angka satu sampai lima<br />
4. pilih salah satu opsi untuk memulai program CRUD sederhana dengan file lokal<br />
5. pilihannya ada lima mulai dari;<br />
      &nbsp;a. show<br />
            &nbsp;&nbsp;ini untuk menampilkan semua data informasi mahasiswa yang dimasukkan tapi,
            apabila belum ada masukkan setelah program di-run maka tidak akan muncul datanya,
            atau ada message/pesan warning tidak ada data.<br />
      &nbsp;b. insert<br />
            &nbsp;&nbsp;dipilihan ke-dua untuk menambahkan data mahasiswa,
            pertama akan diminta untuk memasukkan nomor id, dilanjut nim, nama, prodi, dan fakultas,
            di akhir akan ada pesan bahwa data berhasil dimasukkan.<br />
      &nbsp;c. update<br />
            &nbsp;&nbsp;disini pilihan untuk mengubah data yang ada,
            sebelum mengubah akan ditampilkan data yang ada saat ini,
            kemudian diminta nomor id tujuan yang akan diubah,
            lalu mulai mengubah data setiap atributnya satu per satu.<br />
      &nbsp;d. delete<br />
            &nbsp;&nbsp;hampir sama dengan update akan ditampilkan terlebih dahulu data saat ini,
            akan tetapi berbeda disini fitur untuk menghapus data dengan nomor id tujuan yang dimasukkan user,
            setelah itu langsung data akan terhapus sesuai tujuan nomor id.<br />
      &nbsp;e. terminate<br />
            &nbsp;&nbsp;ini opsi untuk langsung mengakhiri program yang sedang berjalan.<br />

# Format janji
Saya Villeneuve Andhira Suwandhi NIM 2108067 mengerjakan latihan 1<br />
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.<br />
Aamiin.<br />
