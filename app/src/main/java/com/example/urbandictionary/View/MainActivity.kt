package com.example.urbandictionary.View

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.urbandictionary.R

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var editText: EditText
    lateinit var order: Spinner
    lateinit var searchBtn: Button
    var keyWord = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()

        searchBtn.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                if(editText.text != null)
                    Toast.makeText(this@MainActivity, "Please Enter A Word", Toast.LENGTH_LONG)

                else{
                    keyWord = editText.text.toString()

                }
            }
        })
    }



    private fun initUI() {
        editText = findViewById(R.id.et_key_word)
        recyclerView = findViewById(R.id.recyclerView)
        searchBtn = findViewById(R.id.btn_search)
        order.setAdapter(
            ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                resources.getStringArray(R.array.sp_order)
            )
        )
        val adapter = CustomAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }


}
