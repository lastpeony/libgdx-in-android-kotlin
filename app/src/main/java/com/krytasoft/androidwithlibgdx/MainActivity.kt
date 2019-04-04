package com.krytasoft.androidwithlibgdx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//import android.support.v4.app.Fragment  throws unresolved error.without this compiles fine and works but shows type mismatch error.

import com.badlogic.gdx.backends.android.AndroidFragmentApplication
import com.krytasoft.gdxandroid.AndroidGameFragment

class MainActivity : AppCompatActivity(), AndroidFragmentApplication.Callbacks {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.openFlexBoxTestButton)


        //never mind if this supportFragmentManager... shows type mismatch error.Its working. this line puts libgdx into fragment.fragment is similar to component in react.
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, AndroidGameFragment(), AndroidGameFragment::class.java.simpleName).commit()

        button.setOnClickListener{
            val intent = Intent(this, FlexBoxTestActivity::class.java)
               startActivity(intent)

        }
    }




    override fun exit() {

    }
}
