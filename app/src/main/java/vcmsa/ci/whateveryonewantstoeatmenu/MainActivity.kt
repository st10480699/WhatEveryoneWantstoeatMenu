package vcmsa.ci.whateveryonewantstoeatmenu

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



abstract class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }// code starts here//

        val switchButton: Button = findViewById(R.id.switch1)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            // Start the TimeofdayActivity
            val intent = Intent(this, TimeofdayActivity::class.java)
            startActivity(intent)
            switchButton.setOnClickListener {
                if (switchButton.isEnabled) {}//"(timeofday activity will open xml" else "timeofday activity will close"
            }
        }
        //code ends here//


    }
}










