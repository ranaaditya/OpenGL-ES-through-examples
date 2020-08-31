package com.ranaaditya.opengl_es_through_examples.opengl

import android.opengl.GLES20
import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10
import kotlin.math.sin


/**
 * @author Aditya Rana
 */
open class openglRenderer : GLSurfaceView.Renderer {

    private val flash_duration = 1000.0
    var red = 1.0f

    /**
     * empty constructor
     */
    constructor() {}

    override fun onDrawFrame(gl: GL10?) {

        GLES20.glClearColor(red, 0.0f, 0.0f, 1.0f)
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT)

        /**
         * calculating the value for red color depends on time and flash time
         */
        red =
            ((sin(System.currentTimeMillis() * 2 * Math.PI / flash_duration) * 0.5) + 0.5).toFloat()

    }

    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {

    }

    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {

        /**
         *  your color  in RGBA format for rendering goes here
         *  flashing the red and black color at an interval of 1000 milliseconds
         */
        GLES20.glClearColor(red, 0.0f, 0.0f, 1.0f)

    }

}