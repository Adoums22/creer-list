package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfirstapp.adapters.CustomAdapter
import com.example.myfirstapp.models.Tasks


// Define a Kotlin class named ListActivity that extends AppCompatActivity
class ListActivity : AppCompatActivity() {
    // Declare class properties for UI components and task list
    private lateinit var add_button: Button          // Button for adding tasks
    private lateinit var edit_task: EditText         // EditText for task input
    private val itemsList = mutableListOf<Tasks>()     // List to store tasks
    private lateinit var customAdapter: CustomAdapter // Adapter to display tasks in RecyclerView

    // Override the onCreate method to initialize the activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list) // Set the activity layout

        // Initialize UI elements by finding their respective views
        add_button = findViewById(R.id.add_button)    // Button to add tasks
        edit_task = findViewById(R.id.edit_task)      // EditText for task input

        // Set a click listener for the add_button
        add_button.setOnClickListener {
            // Retrieve the text from the edit_task EditText
            val taskText = edit_task.text.toString()
            // Create a Task object with the entered text
            val task = Tasks(taskText)
            // Add the new task to the itemsList
            itemsList.add(task)
            // Notify the adapter to update the RecyclerView
            customAdapter.notifyDataSetChanged()
        }

        // Initialize a RecyclerView and its customAdapter for displaying tasks
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        customAdapter = CustomAdapter(itemsList) // Make sure to import the CustomAdapter class
        val layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = customAdapter
    }
}
