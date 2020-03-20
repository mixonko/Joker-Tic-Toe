package com.game.joker.tic.toe.view

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.game.joker.tic.toe.R
import com.game.joker.tic.toe.contract.GameContract

class GameActivity: AppCompatActivity(), GameContract{
    override fun recreateActivity() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showImage(imageView: ImageView) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }
}
