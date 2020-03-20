package com.game.joker.tic.toe.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.game.joker.tic.toe.R
import com.game.joker.tic.toe.contract.MenuContract
import com.game.joker.tic.toe.presenter.MenuPresenter

class MenuActivity : AppCompatActivity(), MenuContract {

    private lateinit var presenter: MenuPresenter
    private lateinit var play: ImageView
    private lateinit var settings: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        presenter = MenuPresenter(this)

        init()
        setOnClickListener()
    }

    private fun setOnClickListener() {
        play.setOnClickListener {
            presenter.onPlayClick()
        }
        settings.setOnClickListener {
            presenter.onSettingsClick()
        }
    }

    fun init(){
        play = findViewById(R.id.playButton)
        settings = findViewById(R.id.settingsButton)
    }

    override fun startGameActivity() {
        startActivity(Intent(this, GameActivity::class.java))
    }

    override fun startSettings() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun startwebView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

