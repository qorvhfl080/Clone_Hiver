package com.gecko.clone_hiver.utils

import android.content.Context

class ContextUtil() {

    companion object {

        private val prefName = "CloneHiverPref"

        val TOKEN = "TOKEN"

        fun setToken(context: Context, token: String) {

            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            pref.edit().putString(TOKEN, token).apply()

        }

        fun getToken(context: Context): String {

            val pref = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
            return pref.getString(TOKEN, "")!!

        }

    }

}