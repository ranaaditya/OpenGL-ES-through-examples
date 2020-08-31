package com.ranaaditya.opengl_es_through_examples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author Aditya Rana
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * calling onPause of the openglview ported in layout
     */
    override fun onPause() {
        super.onPause()
        openglview.onPause()
    }

    /**
     * calling onResume of the openglView ported in layout
     */
    override fun onResume() {
        super.onResume()
        openglview.onResume()
    }
}