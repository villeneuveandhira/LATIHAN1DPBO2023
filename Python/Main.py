"""
Saya Villeneuve Andhira Suwandhi NIM 2108067 mengerjakan Latihan 1
dalam mata kuliah Desain Pemrograman Berorientasi Objek untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.
Aamiin.
"""

# Import library #
# import os
from os import system
from Mahasiswa import Mahasiswa

# Program #
def main():
    system("cls")
    # os.system('cls' if os.name == 'nt' else 'clear')

    # Instantiate
    obj = [Mahasiswa() for i in range(99)]
    temp = Mahasiswa()

    # Initialize
    menu = 0
    n = 0

    # Output
    while True:
        print("*** LATIHAN 1 DPBO 2023 ***")
        print("=== Informasi Daftar Mahasiswa ===")
        print("\nChoose option :")
        print("1. Show Data")
        print("2. Insert Data")
        print("3. Update Data")
        print("4. Delete Data")
        print("5. Terminate")
        print("\n\nOption : ")
        # user input
        menu = int(input())
        if menu == 1:
            # to display all records
            temp = Mahasiswa()
            system("cls")
            temp.Show(obj, n)
        elif menu == 2:
            # to add data
            temp = Mahasiswa()
            system("cls")
            temp.Insert()
            obj[n] = temp
            n += 1
        elif menu == 3:
            # to edit data
            temp = Mahasiswa()
            system("cls")
            temp.Update(obj, n)
        elif menu == 4:
            # to delete data
            temp = Mahasiswa()
            system("cls")
            temp.Delete(obj, n)
            n -= 1
        elif menu == 5:
            # to terminate or close the program
            break
        else:
            # any num other than the case(s)
            system("cls")
            print("### WARNING!! Please choose from 1-5 .. ###\n\n\n")

if __name__ == "__main__":
    main()