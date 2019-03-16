package com.anwesh.uiprojects.linkedalldireclineview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.alldireclineview.AllDirecLineView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AllDirecLineView.create(this)
    }
}
