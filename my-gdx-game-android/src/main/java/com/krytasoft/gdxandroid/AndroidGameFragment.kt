package com.krytasoft.gdxandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.badlogic.gdx.backends.android.AndroidFragmentApplication
import com.krytasoft.mygdxgame.core.MyGdxGame

class AndroidGameFragment : AndroidFragmentApplication() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val config = AndroidApplicationConfiguration()
        return initializeForView(MyGdxGame(), config)
    }
}
