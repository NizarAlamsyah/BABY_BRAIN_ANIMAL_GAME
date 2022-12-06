package com.babybrain.data;

import com.babybrain.R;

public class SoalPg {

    public Integer pertanyaan[] = {
            R.drawable.img_harimau,
            R.drawable.img_kuda,
            R.drawable.img_sapi,
            R.drawable.img_monyet,
            R.drawable.img_singa,
            R.drawable.img_kucing,
            R.drawable.img_bebek,
            R.drawable.img_ayam,
            R.drawable.img_ular,
            R.drawable.img_jerapah,
            R.drawable.img_kambing,
            R.drawable.img_gajah,
            R.drawable.img_anjing,
            R.drawable.img_zebra,
            R.drawable.img_burunghantu,
            R.drawable.img_unta,
            R.drawable.img_tikus,
            R.drawable.img_babi,
            R.drawable.img_serigala,
            R.drawable.img_katak,
    };

    public String soalku[] = {
            "Apa nama hewan diatas ini?",
            "Apa karakteristik hewan diatas ini?",
            "Apa jenis hewan diatas ini?",
            "Apa makanan hewan diatas ini?",
            "Apa karakteristik hewan diatas ini?",
            "Apa makanan hewan diatas ini?",
            "Apa nama hewan diatas ini?",
            "Apa jenis hewan diatas ini?",
            "Apa karakteristik hewan diatas ini?",
            "Apa jenis hewan diatas ini?",
            "Apa karakteristik hewan diatas ini?",
            "Apa nama hewan diatas ini?",
            "Apa jenis hewan diatas ini?",
            "Apa makanan hewan diatas ini?",
            "Apa karakteristik hewan diatas ini?",
            "Apa makanan hewan diatas ini?",
            "Apa nama hewan diatas ini?",
            "Apa jenis hewan diatas ini?",
            "Apa karakteristik hewan diatas ini?",
            "Apa jenis hewan diatas ini?",
    };

    private String pilihanJawaban[][] = {
            {"Harimau", "Sapi", "Monyet"},
            {"Mempunyai 4 kaki, Mempunyai cakar yang tajam", "Bentuk perototan sangat padat",  "Memiliki hidung besar. Memiliki lemak yang banyak"},
            {"Herbivora", "Omnivora", "Karnivora"},
            {"Buah-buahan dan umbi-umbian", "Daging", "Pemakan segala"},
            {"Bertubuh lebar dan besar, kulit kering, tebal dan kasar dan kaki relatif pendek", "Memiliki hidung besar, Memiliki lemak yang banyak", "Badan yang besar, kepala besar dan kaki pendek"},
            {"Buah-buahan", "Ikan, Daging", "Rumput"},
            {"Kucing", "Ayam", "Bebek"},
            {"Karnivora", "Omnivora", "Herbivora"},
            {"Kaki yang pendek, bentuk paruhnya yang mirip seperti sendok besar", "Tinggi dapat mencapai hampir 1 m", "Tidak berkaki dan bertubuh panjang"},
            {"Herbivora", "Omnivora", "Karnivora"},
            {"Bulunya lurus dan pendek, memiliki dua tanduk pendek", "Kaki yang pendek, bentuk paruhnya yang mirip seperti sendok besar", "Memiliki dua kaki, Sekujur tubuhnya kecuali bagian bawah kaki diliputi bulu"},
            {"Kambing", "Unta", "Gajah"},
            {"Omnivora", "Karnivora", "Herbivora"},
            {"Tumbuhan (rumput, dedaunan)", "Daging", "Biji-bijian"},
            {"Kepala besar dan bulat, memiliki kemampuan untuk memutar lehernya hingga 180 derajat ke belakang", "Memiliki hidung besar, Memiliki lemak yang banyak", "Tidak berkaki dan bertubuh panjang"},
            {"Daging", "Buah-buahan dan umbi-umbian", "Memakan hampir semua tanaman gurun"},
            {"Kuda", "Tikus", "Katak"},
            {"Omnivora", "Herbivora", "Karnivora"},
            {"Bentuk perototan sangat padat", "Badan tikus berukuran ±500 mm", "Tinggi dapat mencapai hampir 1 m"},
            {"Omnivora", "Amfibi Karnivora", "Reptil Karnivora"},

    };

    private String jawabanBenar[] = {
            "Harimau",
            "Bentuk perototan sangat padat",
            "Herbivora",
            "Buah-buahan dan umbi-umbian",
            "Badan yang besar, kepala besar dan kaki pendek",
            "Ikan, Daging",
            "Bebek",
            "Omnivora",
            "Tidak berkaki dan bertubuh panjang",
            "Herbivora",
            "Bulunya lurus dan pendek, memiliki dua tanduk pendek",
            "Gajah",
            "Karnivora",
            "Tumbuhan (rumput, dedaunan)",
            "Kepala besar dan bulat, memiliki kemampuan untuk memutar lehernya hingga 180 derajat ke belakang",
            "Memakan hampir semua tanaman gurun",
            "Tikus",
            "Omnivora",
            "Tinggi dapat mencapai hampir 1 m",
            "Amfibi Karnivora",

    };

    public Integer getPertanyaan(int x) {
        Integer soal = pertanyaan[x];
        return soal;
    }

    public String getSoalku(int x) {
        String ques = soalku[x];
        return ques;
    }

    public String getPilihanJawaban1(int x) {
        String jawaban1 = pilihanJawaban[x][0];
        return jawaban1;
    }

    public String getPilihanJawaban2(int x) {
        String jawaban2 = pilihanJawaban[x][1];
        return jawaban2;
    }

    public String getPilihanJawaban3(int x) {
        String jawaban3 = pilihanJawaban[x][2];
        return jawaban3;
    }

    public String getJawabanBenar(int x) {
        String jawaban = jawabanBenar[x];
        return jawaban;
    }
}
