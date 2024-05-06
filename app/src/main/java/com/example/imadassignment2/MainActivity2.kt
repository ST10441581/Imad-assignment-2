package com.example.imadassignment2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        //this is wherewe will have our code for the actual app
        //we will first declare the varibles we are going to use including the buttons and textviews
        //then we will write code for each of the 3 buttons we will be using in the app
        val feed = findViewById<Button>(R.id.button2)
        val play = findViewById<Button>(R.id.button5)
        val clean = findViewById<Button>(R.id.button4)

        val feed2 = findViewById<TextView>(R.id.textView6)
        val play2 = findViewById<TextView>(R.id.textView5)
        val clean2 = findViewById<TextView>(R.id.textView4)
        val output = findViewById<TextView>(R.id.textView8)

        val image = findViewById<ImageView>(R.id.imageView)

        var petHunger = 60
        var petCleanlisness = 60
        var petHappiness = 60
        val num1 = 100
        val num2 = 0

        feed2.text = petHunger.toString()
        play2.text = petHappiness.toString()
        clean2.text = petCleanlisness.toString()

            play?.setOnClickListener {
                if (petHappiness >= 100) {
                    play2.text = petHappiness.toString()
                }
                petHappiness += 10
                petCleanlisness -= 5
                petHunger -= 5
                feed2.text = petHunger.toString()
                play2.text = petHappiness.toString()
                clean2.text = petCleanlisness.toString()

                if (petHappiness == 100)
                    output.text = "the pet is happy"
                image.setImageResource(R.drawable.aa74bbc296a92e75daa92181a96a54db8a330f41)

                if (petCleanlisness <= 0) {
                    clean2.text = "0"

                }
                if (petHunger <= 0) {
                    clean2.text = "0"
                }
            }
            feed?.setOnClickListener {
                if (petHunger >= 100) {
                    feed2.text = petHunger.toString()
                }
                petHappiness -=5
                petCleanlisness -= 5
                petHunger += 10
                feed2.text = petHunger.toString()
                play2.text = petHappiness.toString()
                clean2.text = petCleanlisness.toString()

                if (petHunger == 100)
                    output.text = "the pet is fed"
                image.setImageResource(R.drawable.d40cd4ef39a438f8a459645d1e90991f9867718d)

                if (petCleanlisness <= 0) {
                    clean2.text = "0"
                }
                if (petHappiness <= 0) {
                    clean2.text = "0"
                }
            }
            clean?.setOnClickListener {
                if (petCleanlisness >= 100) {
                    clean2.text = petCleanlisness.toString()
                }
                petHappiness-=5
                petCleanlisness += 10
                petHunger -=5
                feed2.text = petHunger.toString()
                play2.text = petHappiness.toString()
                clean2.text = petCleanlisness.toString()

                if (petCleanlisness == 100)
                    output.text = "the pet is clean"
                image.setImageResource(R.drawable.c5d277094ccbd86e2ff681ea32d1ea02c2403e01)

                if (petHunger <= 0) {
                    feed2.text = "0"
                }
                if (petHappiness <= 0) {
                    play2.text = "0"
                }
            }


        }


    }


