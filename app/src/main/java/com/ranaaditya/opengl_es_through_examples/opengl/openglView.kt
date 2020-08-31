/**
 * @author Aditya Rana
 *
 *
 */

package com.ranaaditya.opengl_es_through_examples.opengl

import android.opengl.GLSurfaceView
import android.content.Context
import android.util.AttributeSet

/**
 * @author Aditya Rana
 */
open class openglView : GLSurfaceView {

    /**
     * constructor
     *
     * @param context
     *
     */
    constructor(context: Context): super(context) {
        initialize()
    }

    /**
     * constructor
     *
     * @param context
     * @param attributeSet
     */
    constructor(context: Context, attributeSet: AttributeSet) : super(context,attributeSet) {
        initialize()
    }

    fun initialize() {

        /**
         * using opengl 2.0
         */
        setEGLContextClientVersion(2)

        /**
         * setting opengl contextonPause
         */
        preserveEGLContextOnPause = true

        /**
         * set opengl renderer
         */
        setRenderer(openglRenderer())
    }
}