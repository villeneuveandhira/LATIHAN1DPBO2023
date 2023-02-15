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
      + CPP<br />
          - program<br />
          - screenshot<br />
      + Java<br />
      + Python<br />
      + PHP<br />
      + README.md<br />

# Desain Program () {}
Latihan 1 DPBO -> buat kelas mahasiswa dan fiturnya:<br />
Class 'Mahasiswa' {<br />
      -> constructor<br />
      -> private atr :<br />
            - Nama,<br />
            - NIM,<br />
            - Program studi,<br />
            - Fakultas,<br />
            - id untuk nomor setiap data.<br />
      -> public (setter-getter, dan methods) :<br />
            a. set<br />
            b. get<br />
            c. method/fitur:<br />
                  - menampilkan     (display/show),<br />
                  - menambah        (add/insert),<br />
                  - mengubah        (update/edit),<br />
                  - menghapus       (delete/erase).<br />
      -> destructor (ex. Java, Py)<br />
}<br />
Main program {<br />
      - clear/cls (optional) // supaya bersih aja<br />
      - 'new'/instansiasi,<br />
      - init (jika perlu),<br />
      - tampilan :<br />
            1. loop pakai switch-case,<br />
            2. exit/out sampai pilihan user,<br />
            3. case(s) ;<br />
                  3.1.) show,<br />
                  3.2.) insert,<br />
                  3.3.) update,<br />
                  3.4.) delete,<br />
                  3.5.) exit.<br />
}

# Documentation () {}
Untuk dokumentasi menggunakan snapshot/screenshot saat menjalankan program,
dan yang dipilih salah satu yaitu dengan bahasa C++.<br />

Kemudian, ada penjelasan alur programnya:
1. compile file sesuai bahasa (c++, java, python, php) e.g. :
      (C++) :
            -> g++ -c *.cpp
            -> g++ main.cpp -o main.exe
2. run programnya e.g. :
            -> .\main (powershell)
3. setelah itu, akan muncul judul ('latihan-1-dpbo-2023') beserta pilihan opsinya dengan angka satu sampai lima
4. pilih salah satu opsi untuk memulai program CRUD sederhana dengan file lokal
5. pilihannya ada lima mulai dari;
      a. show
            ini untuk menampilkan semua data informasi mahasiswa yang dimasukkan tapi,
            apabila belum ada masukkan setelah program di-run maka tidak akan muncul datanya,
            atau ada message/pesan warning tidak ada data.
      b. insert
            dipilihan ke-dua untuk menambahkan data mahasiswa,
            pertama akan diminta untuk memasukkan nomor id, dilanjut nim, nama, prodi, dan fakultas,
            di akhir akan ada pesan bahwa data berhasil dimasukkan.
      c. update
            disini pilihan untuk mengubah data yang ada,
            sebelum mengubah akan ditampilkan data yang ada saat ini,
            kemudian diminta nomor id tujuan yang akan diubah,
            lalu mulai mengubah data setiap atributnya satu per satu.
      d. delete
            hampir sama dengan update akan ditampilkan terlebih dahulu data saat ini,
            akan tetapi berbeda disini fitur untuk menghapus data dengan nomor id tujuan yang dimasukkan user,
            setelah itu langsung data akan terhapus sesuai tujuan nomor id.
      e. terminate
            ini opsi untuk langsung mengakhiri program yang sedang berjalan.
