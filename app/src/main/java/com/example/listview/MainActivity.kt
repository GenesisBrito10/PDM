package com.example.listview
import android.widget.ArrayAdapter
import android.widget.ListView
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recycler View
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val itemList = (1..10).map{Item("Recyclier View - $it")}

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(itemList)
        ////////////////////////////////////////////////////////////


        //ListView
//        val arrayAdapter: ArrayAdapter<*>
//        val users = arrayOf(
//            "Virat Kohli", "Rohit Sharma", "Steve Smith",
//            "Kane Williamson", "Ross Taylor"
//        )
//
//
//        var mListView = findViewById<ListView>(R.id.userlist)
//        arrayAdapter = ArrayAdapter(
//            this,
//            android.R.layout.simple_list_item_1, users
//        )
//        mListView.adapter = arrayAdapter
//

    //Fragment
//        if(savedInstanceState == null) {
//
//            val ft = supportFragmentManager.beginTransaction()
//            val frag1 = Fragment()
//            ft.add(R.id.frameLayout, frag1, "AloFragmento").commit()
//        }
    }
}