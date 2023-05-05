package com.example.mad_ind05_murray_mitchell

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    val stateSquareMileage = mapOf(
        "Alabama" to "52,419",
        "Alaska" to "665,384",
        "Arizona" to "113,990",
        "Arkansas" to "53,179",
        "California" to "163,696",
        "Colorado" to "104,094",
        "Connecticut" to "5,543",
        "Delaware" to "2,489",
        "Florida" to "65,758",
        "Georgia" to "59,425",
        "Hawaii" to "10,931",
        "Idaho" to "83,569",
        "Illinois" to "57,914",
        "Indiana" to "36,418",
        "Iowa" to "56,272",
        "Kansas" to "82,278",
        "Kentucky" to "40,408",
        "Louisiana" to "52,378",
        "Maine" to "35,385",
        "Maryland" to "12,406",
        "Massachusetts" to "10,565",
        "Michigan" to "96,716",
        "Minnesota" to "86,936",
        "Mississippi" to "48,430",
        "Missouri" to "69,704",
        "Montana" to "147,040",
        "Nebraska" to "77,347",
        "Nevada" to "110,572",
        "New Hampshire" to "9,349",
        "New Jersey" to "8,723",
        "New Mexico" to "121,590",
        "New York" to "54,556",
        "North Carolina" to "53,819",
        "North Dakota" to "70,698",
        "Ohio" to "44,825",
        "Oklahoma" to "69,899",
        "Oregon" to "98,381",
        "Pennsylvania" to "46,054",
        "Rhode Island" to "1,545",
        "South Carolina" to "32,020",
        "South Dakota" to "77,121",
        "Tennessee" to "42,146",
        "Texas" to "268,596",
        "Utah" to "84,898",
        "Vermont" to "9,616",
        "Virginia" to "42,775",
        "Washington" to "71,362",
        "West Virginia" to "24,230",
        "Wisconsin" to "65,496",
        "Wyoming" to "97,818"
    )
    val stateIndex = mapOf(
        "Alabama" to 1,
        "Alaska" to 2,
        "Arizona" to 3,
        "Arkansas" to 4,
        "California" to 5,
        "Colorado" to 6,
        "Connecticut" to 7,
        "Delaware" to 8,
        "Florida" to 9,
        "Georgia" to 10,
        "Hawaii" to 11,
        "Idaho" to 12,
        "Illinois" to 13,
        "Indiana" to 14,
        "Iowa" to 15,
        "Kansas" to 16,
        "Kentucky" to 17,
        "Louisiana" to 18,
        "Maine" to 19,
        "Maryland" to 20,
        "Massachusetts" to 21,
        "Michigan" to 22,
        "Minnesota" to 23,
        "Mississippi" to 24,
        "Missouri" to 25,
        "Montana" to 26,
        "Nebraska" to 27,
        "Nevada" to 28,
        "New Hampshire" to 29,
        "New Jersey" to 30,
        "New Mexico" to 31,
        "New York" to 32,
        "North Carolina" to 33,
        "North Dakota" to 34,
        "Ohio" to 35,
        "Oklahoma" to 36,
        "Oregon" to 37,
        "Pennsylvania" to 38,
        "Rhode Island" to 39,
        "South Carolina" to 40,
        "South Dakota" to 41,
        "Tennessee" to 42,
        "Texas" to 43,
        "Utah" to 44,
        "Vermont" to 45,
        "Virginia" to 46,
        "Washington" to 47,
        "West Virginia" to 48,
        "Wisconsin" to 49,
        "Wyoming" to 50
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val state = intent.getStringExtra("name")
        val stateName = findViewById<TextView>(R.id.stateName)
        val stateSize = findViewById<TextView>(R.id.stateSize)
        stateSize.text = stateSquareMileage[state] + " Sq. Miles"
        stateName.text = state
        val stateNum = stateIndex[state]
        val stateMap = findViewById<ImageView>(R.id.stateMap)
        val stateFlag = findViewById<ImageView>(R.id.stateFlag)
        val mapID = resources.getIdentifier("m$stateNum", "drawable", packageName)
        val flagID = resources.getIdentifier("f$stateNum", "drawable", packageName)
        stateMap.setImageResource(mapID)
        stateFlag.setImageResource(flagID)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}