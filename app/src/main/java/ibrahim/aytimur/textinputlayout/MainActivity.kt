package ibrahim.aytimur.textinputlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnuyeol.setOnClickListener {
            val yenikullaniciadi = kullaniciadi.text.toString()
            val yeniparola = parola.text.toString()
            Toast.makeText(applicationContext,"Kullanıcı Adı:$yenikullaniciadi,"+
            "Parola:$yeniparola",Toast.LENGTH_SHORT).show()
        }
    }
}
