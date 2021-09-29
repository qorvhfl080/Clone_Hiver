package com.gecko.clone_hiver.utils

import android.content.Context
import android.graphics.Typeface
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class FontChanger {

    companion object {

        fun setGlobalFont(context: Context, view: View) {

            if (view is ViewGroup) {
                for (i in 0 until view.childCount) {

                    val childView = view.getChildAt(i)

                    if (childView is TextView) {
                        childView.typeface = Typeface.createFromAsset(context.assets, "HSNewTown.ttf")
                    }

                    setGlobalFont(context, childView)

                }
            }

        }

    }

}