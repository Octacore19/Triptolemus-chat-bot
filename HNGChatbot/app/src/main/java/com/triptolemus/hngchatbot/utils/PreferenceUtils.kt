package com.triptolemus.hngchatbot.utils

import android.content.Context
import android.content.SharedPreferences

object PreferenceUtils {
    private lateinit var preferences: SharedPreferences

    fun initSharedPreference(context: Context) {
        preferences = context.getSharedPreferences("User", Context.MODE_PRIVATE)
    }

    fun saveUser(username: String) {
        val editor = preferences.edit()
        editor.putString("username", username)
        editor.apply()
    }

    fun getUser(): String? {
        return preferences.getString("username", "")
    }
}