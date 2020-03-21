package com.game.joker.tic.toe.presenter

import com.game.joker.tic.toe.view.MenuActivity

class MenuPresenter(private val view : MenuActivity) {
    fun onPlayClick() {
        view.startGameActivity()
    }

    fun onSettingsClick() {
        view.startSettings()
    }

    fun onWebViewClick() {
        view.startWebViewActivity()
    }
}
