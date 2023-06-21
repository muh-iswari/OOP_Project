# App
## App.java
Didalam 'App.java' terdapat beberapa tombol yaitu :
1. btn_tambah : untuk menambah data ke tabel.
2. btn_edit : untuk mengedit data pada tabel.
3. btn_delete : untuk mendelete data di tabel.
4. btn_clear : untuk membersihkan in_nama, in_harga, dan in_jumlah.
5. btn_total : untuk menampilkan nilai total (harga x jumlah) setiap produk yang ada pada tabel.
6. btn_hitung : untuk menghitung kembalian.
7. btn_simpan : untuk menyimpan data pada tabel ke database.

Didalam 'App.java' juga terdapat beberapa method yaitu :
1. clear() :untuk mengubah nilai in_nama, in_jumlah, in_harga menjadi string kosong ("") .
2. insertData() : Untuk menambahkan data ke tabel.


# com 
terdapat beberapa package yaitu:
1. composition
2. config
3. database
4. reference


## 1.composition
DeleteData : Untuk penghapus data pada database.
UpdateData : Untuk memperbaharui data pada database.
CreateData :Untuk menampilkan menu insert (penambahan) data ke database.
ReadData : Untuk menampilkan semua data yang ada di database.

## 2. config
MyConnection : Untuk menghubungkan program dengan local host

## 3. database
DataBase : Sebagai pengontrol akses ke database

## 4. reference
Product : Class yang merepresentasikan data produk.