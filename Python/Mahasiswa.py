"""
Saya Villeneuve Andhira Suwandhi NIM 2108067 mengerjakan Latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
"""

# Import library #
import os

# Class declaration #
class Mahasiswa:
    # constructor #
    def __init__(self, n = 0, nim = "", nama = "", prodi = "", fakultas = ""):
        self.id = n               # Nomor data
        self.MHS_NUM = nim        # NIM mahasiswa
        self.MHS_NAME = nama      # Nama mahasiswa
        self.MHS_PRODI = prodi    # Program studi
        self.MHS_FAC = fakultas   # Fakultas
        
    # methods
    # to DISPLAY all data #
    def Show(self, obj, n):
        os.system('cls' if os.name == 'nt' else 'clear')
        print("########## Daftar Mahasiswa ##########")
        # if there isn't data yet
        if n == 0:
            print("!!!No data!!!")
        # if at least 1 record in data
        else:
            for i in range(n):
                print("ID         : ", obj[i].id)
                print("NIM        : ", obj[i].MHS_NUM)
                print("NAMA       : ", obj[i].MHS_NAME)
                print("PRODI      : ", obj[i].MHS_PRODI)
                print("FAKULTAS   : ", obj[i].MHS_FAC)
                print("========================================\n")
        # new line after
        print("\n")

    # ---------------------------------------------------------------- #

    # to ADD data #
    def Insert(self):
        os.system('cls' if os.name == 'nt' else 'clear')
        print("### INSERT DATA ###")
        print("--- No space allowed!")
        # ID data
        self.id = input("ID                         : ")
        # NIM mahasiswa
        self.MHS_NUM = input("Masukkan NIM mahasiswa     : ")
        # Nama mahasiswa
        self.MHS_NAME = input("Masukkan Nama mahasiswa    : ")
        # Program studi
        self.MHS_PRODI = input("Masukkan Program studi     : ")
        # Fakultas
        self.MHS_FAC = input("Masukkan Fakultas          : ")
        print("\n### Data added ... ###\n\n\n")

    # ---------------------------------------------------------------- #

    # to EDIT a data by id #
    def Update(self, obj, n):
        os.system('cls' if os.name == 'nt' else 'clear')
        # print all data
        temp = Mahasiswa()
        temp.Show(obj, n)
        # init
        find = 0
        found = 0
        # find ID in data
        print("\n\n### UPDATE DATA ###")
        find = input("Masukkan ID mahasiswa yang ingin diubah :")
        # update each attribute
        for i in range(n):
            # record that has same id
            if find == obj[i].id:
                print("\n\n### updating ... ###")
                obj[i].MHS_NUM = input("Masukkan NIM baru mahasiswa     : ")
                obj[i].MHS_NAME = input("Masukkan Nama baru mahasiswa    : ")
                obj[i].MHS_PRODI = input("Masukkan Program studi baru     : ")
                obj[i].MHS_FAC = input("Masukkan Fakultas baru          : ")
                # sign that the current record was updated
                print("\n\n### Data updated ###\n\n")
                # it means that the record has found
                found = 1
                return
            
        # if the ID is not found in data
        if found == 0:
            print("### ID is nout found ###")

    # ---------------------------------------------------------------- #

    # to DELETE a data by id #
    def Delete(self, obj, n):
        os.system('cls' if os.name == 'nt' else 'clear')
        # print all data
        temp = Mahasiswa()
        temp.Show(obj, n)
        # init
        find = 0
        found = 0
        # find ID in data
        print("\n\n### DELETE DATA ###")
        find = input("Masukkan ID mahasiswa yang ingin dihapus :")
        for i in range(n):
            # record that has same id
            if find == obj[i].id:
                # shift record to maks
                for j in range(i, n-1):
                    obj[j] = obj[j+1]
                # sign that the current record was deleted
                print("\n\n### Data successfully deleted ###\n\n")
                # it means that the record has found
                found = 1
                return
        
        # if the ID is not found in data
        if found  == 0:
            print("\n\n### ID is nout found ###\n\n")