package com.vedatakcan.kelimedeneme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class OynaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oyna)
    }

    object sorularclas {
        var sorular = arrayOf(
            "Ankara Ne Zaman Bbaşkent Oldu ?",
            "Çanakkale Zaferinin dahil olduğu savaş hangisidir ?",
            "Hangi Gezegende Yaşıyoruz ?",
            "Dünyanın en büyük Okyanusu hangisidir ?",
            "Bir Gün kaç saniyedir ?",
            "“Sinekli Bakkal” Romanının Yazarı Aşağıdakilerden Hangisidir?",
            "Aşağıda Verilen İlk Çağ Uygarlıklarından Hangisi Yazıyı İcat Etmiştir?",
            "Tsunami Felaketinde En Fazla Zarar Gören Güney Asya Ülkesi Aşağıdakilerden Hangisidir?",
            "Mustafa Kemal Atatürk’ün Nüfusa Kayıtlı Olduğu İl Hangisidir?",
            "Aşağıdakilerden Hangisi Dünya Sağlık Örgütünün Kısaltılmış İsmidir?",
            "Hangi İlimizde Demiryolu Yoktur?",
            "Hangi Ülkenin İki Tane Başkenti Vardır?"
        )
        var sıklar = arrayOf(
            arrayOf("1924", "1921", "1923", "1929"),
            arrayOf("1.Dünya Savaşı", "2.Dünya Savaşı", "Trablusgarp Savaşı", "İnönü Savaşı"),
            arrayOf("Venüs", "Merkür", "Dünya", "Mars"),
            arrayOf("Atlantik Okyanus", "Kuzey Bus Okyanusu", "Pasifik Okyanusu", "Hint Okyanusu"),
            arrayOf("86000", "88600", "86400", "84600"),
            arrayOf("Reşat Nuri Güntekin", "Halide Edip Adıvar", "Ziya Gökalp", " Ömer Seyfettin"),
            arrayOf("Hititler", "Elamlar", "Sümerler", "Urartular"),
            arrayOf("Endonezya", "Srilanka", "Tayland ", "Hindistan"),
            arrayOf("Bursa ", " Ankara", "İstanbul", "Gaziantep"),
            arrayOf("Uhw", "Unıcef", "Who", "Nato"),
            arrayOf("Batman", "Kütahya", "Aydın", "Muğla"),
            arrayOf("Güney Afrika", "Senegal", "El Salvador", "Venezuela")
        )
        var cevap = arrayOf(
            "1923",
            "1.Dünya Savaşı",
            "Dünya",
            "Pasifik Okyanusu",
            "86400",
            "Halide Edip Adıvar",
            "Sümerler",
            " Endonezya",
            "Gaziantep",
            "Unıcef",
            "Muğla",
            "Güney Afrika"
        )
    }


}