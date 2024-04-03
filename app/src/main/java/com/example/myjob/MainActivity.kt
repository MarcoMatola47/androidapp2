package com.example.myjob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //declare
    private lateinit var matchButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var ageInput:EditText
    private lateinit var clearButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise
        matchButton= findViewById(R.id.matchbutton)
        clearButton= findViewById(R.id.clearbutton)
        ageInput= findViewById(R.id.ageInput)
        resultTextView= findViewById(R.id.resultTextView)


        matchButton.setOnClickListener {
            //create a variable of age to get value from user
            val age = ageInput.text.toString().toIntOrNull()

            //if age is not null and age is in the rage between
            if (age != null && age in 20..100) {

                //When age is 33 display Jesus Christ else when is..and so on

                val historyFamousFigureName = when (age) {
                    33 -> "Jesus Christ, Son of God \n Jesus is eternal and unchanging"
                    42 -> "Elvis Presley,King of Rock and Roll"
                    44 -> "Pablo escobar,El patron \nthe nickname of the leader of one drug cartel in the 1980s and early'90s"
                    50 -> "Michael jackson,King of Pop"
                    56 -> "Adolf Hitler,The Nazi leader during WW2"
                    96 -> "Queen Elizabeth II,First British monarch to regin for 70 years"
                    81 -> "Plato,Ancient Greek philosopher of the classical period"
                    82 -> "Niel Armstrong, First man stepping on the moon"
                    67 -> "Leonardo da Vinci,Premier painter and scientist and inventor"
                    84 -> "Isaac Newton,Brilliant scientist and formulator of laws of motion and gravitation"
                    else -> null


                }
                val message =
                    if (historyFamousFigureName != null) " The history famous figure name is $historyFamousFigureName"
                    else "No history famous figure with the entered age"
                resultTextView.text = message

            } else {
                resultTextView.text =
                    "Invalid input value, please enter a valid age between 20 and 100"

            }
        }

        clearButton.setOnClickListener {

            ageInput.text.clear()
            resultTextView.text =""
        }



        }

    }
