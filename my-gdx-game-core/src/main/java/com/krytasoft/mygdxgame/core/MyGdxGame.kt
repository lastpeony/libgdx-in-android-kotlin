package com.krytasoft.mygdxgame.core

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Sprite
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class MyGdxGame : ApplicationAdapter() {
    lateinit var batch: SpriteBatch
    lateinit var img: Texture
    lateinit var sprite:Sprite


    override fun create() {
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
        sprite = Sprite(img)
        println("create done from libgdx")
    }

    override fun render() {
        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        batch.draw(sprite, 50f, 50f)
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        img.dispose()
    }

   fun moveRight(){
      sprite.x +=50f;    // throws lateinit var sprite is uninitialzied error.



    }


}