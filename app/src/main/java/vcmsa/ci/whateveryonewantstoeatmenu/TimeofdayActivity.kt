package vcmsa.ci.whateveryonewantstoeatmenu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TimeofdayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.timeofday)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            //code starts here//
//initialize the buttons
            val morningButton = findViewById<Button>(R.id.button2)
            val afternoonButton = findViewById<Button>(R.id.button3)
            val dinnerButton = findViewById<Button>(R.id.button4)

            //set onclick listeners for the buttonssetonclicklistener{each button will open a new activity}


            morningButton.setOnClickListener {
                val intent = Intent(this, MorningbreakfastmealactivityMain2Activity::class.java)
                startActivity(intent)
            };

            afternoonButton.setOnClickListener {
                val intent = Intent(this, AfternoonlunchmealactivityMain3Activity::class.java)
                startActivity(intent)
            }
            dinnerButton.setOnClickListener {
                val intent = Intent(this, DinnermainmealactivityMain4Activity::class.java)
                startActivity(intent)


            }

        //for further development// easier solution / meal Suggestions //




//method to suggest meal based on time of day(string suggestion time of day)

var suggestionTimeOfDay = ""
    if (suggestionTimeOfDay.equals("Morning")) {"why dont you have fruits or food bowl in the morning?"}
        //also suggestion = "Breakfast"

        else
        if (suggestionTimeOfDay.equals("Afternoon")) {" why dont you have pancakes and sandwiches in the afternoon?)"
            val also = "Lunch"
            //var value = also Suggestion = it

        }

            else
            if (suggestionTimeOfDay.equals("Dinner")) {"why dont you have pasta and steak also finish with desert in the dinner?"}
                //val value ="Dinner"

}}
            //get the meal suggestions from the three buttons which lead to different activities based on the time of day

     //method to suggest meal based on time of day encoded ends here //











