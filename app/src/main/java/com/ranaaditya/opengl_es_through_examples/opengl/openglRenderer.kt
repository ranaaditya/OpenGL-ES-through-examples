package com.ranaaditya.opengl_es_through_examples.opengl

import android.opengl.GLES20
import android.opengl.GLSurfaceView
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10


/**
 * @author Aditya Rana
 */
open class openglRenderer : GLSurfaceView.Renderer {

    /**
     * empty constructor
     */
    constructor() {}

    override fun onDrawFrame(gl: GL10?) {

        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);

    }

    override fun onSurfaceChanged(gl: GL10?, width: Int, height: Int) {

    }

    override fun onSurfaceCreated(gl: GL10?, config: EGLConfig?) {

        /**
         *  your color  in RGBA format for rendering goes here
         */
        GLES20.glClearColor(1.0f, 0.0f, 1.0f, 1.0f);

    }

}