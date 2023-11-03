package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ListActivity : AppCompatActivity() {
    // Declaring the button as a class property
    private lateinit var add_button: Button
    private lateinit var edit_task: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        // Button initialization using its ID
        val add_button = findViewById<Button>(R.id.add_button)
        val edit_task = findViewById<EditText>(R.id.edit_task)
        add_button.setOnClickListener {
            // Code pour récupérer le texte de l'EditText
            val taskText = edit_task.text.toString()

            // Vous pouvez maintenant utiliser la valeur de taskText comme vous le souhaitez
            // Par exemple, vous pouvez l'afficher dans une autre vue ou la traiter de quelque manière que vous préférez
        }
    }
}