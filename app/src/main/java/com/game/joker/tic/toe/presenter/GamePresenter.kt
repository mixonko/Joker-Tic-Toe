package com.game.joker.tic.toe.presenter

import com.game.joker.tic.toe.view.GameActivity

class GamePresenter(private val view: GameActivity) {
    private var gameArray: Array<Array<Int>> = Array(3) { Array(3) {0} }
}
