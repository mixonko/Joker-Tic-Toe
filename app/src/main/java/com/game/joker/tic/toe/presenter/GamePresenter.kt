package com.game.joker.tic.toe.presenter

import android.widget.ImageView
import android.widget.Toast
import com.game.joker.tic.toe.model.WinnerCheck
import com.game.joker.tic.toe.util.MyAppContext.Companion.gatAppContext
import com.game.joker.tic.toe.view.GameActivity

class GamePresenter(private val view: GameActivity, private val winnerCheck: WinnerCheck = WinnerCheck()) {

    private var side: Int = 1
    private var gameArray: Array<Array<Int>> = Array(3) { Array(3) {0} }
    private var winner = 0

    fun onImageClick(imageView: ImageView, tag: Int) {

        updateArray(tag)
        winnerCheck()
        if (side == 1) {
            side = 2
            view.setImageFirstPlayer(imageView)
        }
        else if(side == 2){
            side = 1
            view.setImageSecondPlayer(imageView)
        }
        view.setDisabled(imageView)

    }

    fun resetGameClicked() {
        view.recreateActivity()
    }

    private fun updateArray(tag: Int){
        when (tag){
            11 -> gameArray[0][0] = side
            12 -> gameArray[0][1] = side
            13 -> gameArray[0][2] = side
            21 -> gameArray[1][0] = side
            22 -> gameArray[1][1] = side
            23 -> gameArray[1][2] = side
            31 -> gameArray[2][0] = side
            32 -> gameArray[2][1] = side
            33 -> gameArray[2][2] = side
        }
    }

    private fun winnerCheck(){
        winner = winnerCheck.check(gameArray)
        if (winner != 0){
            view.setAllDisabled()
            if (winner == 1){Toast.makeText(gatAppContext(), "1", Toast.LENGTH_SHORT).show()}
            if (winner == 2){Toast.makeText(gatAppContext(), "2", Toast.LENGTH_SHORT).show()}
        }

    }

}
