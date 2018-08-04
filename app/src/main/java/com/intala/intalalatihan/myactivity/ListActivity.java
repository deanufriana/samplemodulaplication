package com.intala.intalalatihan.myactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.intala.intalalatihan.R;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    public static final String JUDUL_KEY = "judul.key";
    public static final String SH_DESC_KEY = "shdesk.key";
    public static final String DESKRIPSI_KEY = "deskripsi.key";

    RecyclerView news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        news = findViewById(R.id.news);

        BeritaListAdapter adapter = new BeritaListAdapter(new OnClickListInterface() {
            @Override
            public void detailberita(Berita detail) {
                /*Toast.makeText(ListActivity.this, detail.getJudul(), Toast.LENGTH_SHORT).show();*/
                Intent detailberita = new Intent(ListActivity.this, DetailBeritaActivity.class);
                detailberita.putExtra(JUDUL_KEY, detail.getJudul());
                detailberita.putExtra(SH_DESC_KEY, detail.getShortDesc());
                detailberita.putExtra(DESKRIPSI_KEY, detail.getDeskripsi());
                startActivity(detailberita);
            }
        });
        news.setLayoutManager(new LinearLayoutManager(this));
        news.setAdapter(adapter);
        adapter.updateberitas(getjudul());
    }

    ArrayList<Berita> getjudul = new ArrayList<>();

    public ArrayList<Berita> getjudul() {
        getjudul.add(new Berita("Anies ke JK: Kali Item Tak Bau, yang Busuk itu di Media Sosial", " \"Hal tersebut diungkapkan Gubernur DKI Jakarta Anies Baswedan, seusai mendampingi JK meninjau Wisma Atlet, Jumat (3/8/2018).\\n\" ", "Suara.com - Wakil Presiden RI Jusuf Kalla mengakui senang melihat pembangunan Wisma Atlet Kemayoran yang sudah rampung jelang Asian Games 2018.\n" +
                "\n" +
                "Hal tersebut diungkapkan Gubernur DKI Jakarta Anies Baswedan, seusai mendampingi JK meninjau Wisma Atlet, Jumat (3/8/2018).\n" +
                "\n" +
                "\"Alhamdulillah, JK senang tadi juga lihat Wisma Atlet,\" ujar Anies di Balai Kota, Jakarta, Jumat (3/8/2018).\n" +
                "\n" +
                "JK, kata Anies, mengakui penasaran setelah membaca berita mengenai Kali Sentiong alias Kali Item. Karena itu, ia mengajak JK untuk membuktikan Kali Item sudah tidak berbau tak sedap seperti yang tersebar di media sosial.\n" +
                "\n" +
                "Saat melakukan peninjauan, JK juga sempat bertanya kepada Anies sumber bau tak sedap di Kali Item.\n" +
                "\n" +
                "Namun, kata Anies, dirinya menjelaskan Kali Item sudah tidak berbau lantaran sudah dipasang kain waring dan disemprot cairan penghilang bau.\n" +
                "\n" +
                "Anies juga mengakui sempat melontarkan candaan, bahwa yang masih bau yakni di media sosial.\n" +
                "\n" +
                "\"Kan (JK)  bilang 'apa itu Nies, kok ramai betul soal Kali Item, coba kita ke sana saja'. Tadi dia bertanya, ’mana yang bau, apa yang bau’. Saya jawab, ’iya pak, memang sudah tak bau, yang masih bau itu di medsos’,\" kata dia.\n" +
                "\n" +
                "Anies dan JK juga sempat menikmati buah pisang di pingiran Kali Item untuk membuktikan kawasan itu tak lagi berbau.\n" +
                "\n" +
                "\"Setelah itu bilang sini ambil pisang saya coba, buktikan kalau sudah tidak bau,\" tutur Anies menirukan ucapan JK."));
        getjudul.add(new Berita("Fahri Hamzah: Kalau PKS Memimpin, Bisa Rusak Negara, Sebab...", "TEMPO.CO, Jakarta - Politikus Partai Keadilan Sejahtera (PKS) Fahri Hamzah, mengatakan PKS menuju ambang kehancuran karena banyak kadernya yang selalu menganggap kalimat pimpinan PKS adalah hukum tertinggi atau taklid.", "TEMPO.CO, Jakarta - Politikus Partai Keadilan Sejahtera (PKS) Fahri Hamzah, mengatakan PKS menuju ambang kehancuran karena banyak kadernya yang selalu menganggap kalimat pimpinan PKS adalah hukum tertinggi atau taklid. \"Memang ada kesalahan berpikir dari awal yang menganggap seolah-olah kata-kata pimpinan PKS itu pasti lebih tinggi dari hukum negara,\" ujar Fahri di Kompleks Parlemen, Jakarta, Jumat 3 Agustus 2018."));
        getjudul.add(new Berita("Cucu Kedua Jokowi Diberi Nama Sedah Mirah, Ini Arti Nama Anak dari Kahiyang dan Bobby\n", "SERAMBINEWS.COM, JAKARTA - Cucu kedua Presiden Joko Widodo dari pasangan Kahiyang Ayu dan Bobby Nasution sudah diberi nama.\n", "SERAMBINEWS.COM, JAKARTA - Cucu kedua Presiden Joko Widodo dari pasangan Kahiyang Ayu dan Bobby Nasution sudah diberi nama.\n" +
                "\n" +
                "Pengumuman nama tersebut disampaikan oleh Kahiyang dan Bobby di Rumah Saki t YPK Mandiri, Jakarta, Jumat (3/8/2018).\n" +
                "\n" +
                "\"Nama Putri kami, Sedah Mirah Nasution,\" kata Kahiyang.\n" +
                "\n" +
                "Kahiyang menjelaskan, Sedah Mirah berasal dari bahasa Jawa.\n" +
                "\n" +
                "Sementara Nasution diambil dari marga Bobby.\n" +
                "\n" +
                "\"Artinya semoga putri kami menjadi anak yang menawan, soleha dan dermawan bagi orang-orang sekitarnya,\"\n"));
        getjudul.add(new Berita("Wanita di Tegal Dicekoki Oplosan Sampai Mabuk, Motornya Dibawa Kabur Kenalan Baru\n", "TRIBUNJATENG.COM,TEGAL - Nasib apes dialami Septi (22), warga Kecamatan Talang, Kabupaten Tegal, Jawa Tengah.\n" +
                "\n" +
                "Perempuan yang masih berstatus mahasiswi ini kehilangan sepeda motor Beat warna hitam yang dibawa laki- laki kenalan baru.\n", "TRIBUNJATENG.COM,TEGAL - Nasib apes dialami Septi (22), warga Kecamatan Talang, Kabupaten Tegal, Jawa Tengah.\n" +
                "\n" +
                "Perempuan yang masih berstatus mahasiswi ini kehilangan sepeda motor Beat warna hitam yang dibawa laki- laki kenalan baru.\n" +
                "\n" +
                "Septi juga kehilangan satu ponsel dan uang tunai Rp 900 ribu.\n" +
                "\n" +
                "Kejadian itu dialaminya pada Minggu (29/7/2018).\n" +
                "\n" +
                "Dia diajak seorang laki-laki yang baru dikenalnya menginap di sebuah guest house atau penginapan di Kelurahan Panggung, Kecamatan Tegal Timur, Kota Tegal.\n"));
        return getjudul;
    }

}