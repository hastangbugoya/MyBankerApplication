package com.example.mybankerapplication.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mybankerapplication.R
import com.example.mybankerapplication.model.Card
import com.example.mybankerapplication.model.DrawRecepient
import com.example.mybankerapplication.model.Suits

class BaccaratViewModel : ViewModel() {
    private val deck = mutableListOf<Card>()
    private val _bankerHand = mutableListOf<Card>()
    val bankerHand = mutableStateOf(_bankerHand as List<Card>)
    private val _playerHand = mutableListOf<Card>()
    val playerHand = mutableStateOf(_playerHand as List<Card>)

    fun drawCard(recipient: DrawRecepient) {
        val index = (1..1000000).random().mod(deck.size)
        val card = deck.get(index)
        when (recipient) {
            DrawRecepient.BANKER -> {
                _bankerHand.add(card)
            }
            DrawRecepient.PLAYER -> {
                _playerHand.add(card)
            }
        }
        deck.remove(card)
    }

    init {
        addDeck()
        drawCard(DrawRecepient.PLAYER)
        drawCard(DrawRecepient.BANKER)
        drawCard(DrawRecepient.PLAYER)
        drawCard(DrawRecepient.BANKER)
    }

    private fun addDeck() {
        deck.add(Card(Suits.CLUB, R.drawable.clubs_ace, 1))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_2, 2))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_3, 3))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_4, 4))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_5, 5))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_6, 6))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_7, 7))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_8, 8))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_9, 9))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_10, 0))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_jack, 0))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_queen, 0))
        deck.add(Card(Suits.CLUB, R.drawable.clubs_king, 0))

        deck.add(Card(Suits.SPADE, R.drawable.spades_ace, 1))
        deck.add(Card(Suits.SPADE, R.drawable.spades_2, 2))
        deck.add(Card(Suits.SPADE, R.drawable.spades_3, 3))
        deck.add(Card(Suits.SPADE, R.drawable.spades_4, 4))
        deck.add(Card(Suits.SPADE, R.drawable.spades_5, 5))
        deck.add(Card(Suits.SPADE, R.drawable.spades_6, 6))
        deck.add(Card(Suits.SPADE, R.drawable.spades_7, 7))
        deck.add(Card(Suits.SPADE, R.drawable.spades_8, 8))
        deck.add(Card(Suits.SPADE, R.drawable.spades_9, 9))
        deck.add(Card(Suits.SPADE, R.drawable.spades_10, 0))
        deck.add(Card(Suits.SPADE, R.drawable.spades_jack, 0))
        deck.add(Card(Suits.SPADE, R.drawable.spades_queen, 0))
        deck.add(Card(Suits.SPADE, R.drawable.spades_king, 0))

        deck.add(Card(Suits.HEART, R.drawable.hearts_ace, 1))
        deck.add(Card(Suits.HEART, R.drawable.hearts_2, 2))
        deck.add(Card(Suits.HEART, R.drawable.hearts_3, 3))
        deck.add(Card(Suits.HEART, R.drawable.hearts_4, 4))
        deck.add(Card(Suits.HEART, R.drawable.hearts_5, 5))
        deck.add(Card(Suits.HEART, R.drawable.hearts_6, 6))
        deck.add(Card(Suits.HEART, R.drawable.hearts_7, 7))
        deck.add(Card(Suits.HEART, R.drawable.hearts_8, 8))
        deck.add(Card(Suits.HEART, R.drawable.hearts_9, 9))
        deck.add(Card(Suits.HEART, R.drawable.hearts_10, 0))
        deck.add(Card(Suits.HEART, R.drawable.hearts_jack, 0))
        deck.add(Card(Suits.HEART, R.drawable.hearts_queen, 0))
        deck.add(Card(Suits.HEART, R.drawable.hearts_king, 0))

        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_ace, 1))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_2, 2))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_3, 3))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_4, 4))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_5, 5))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_6, 6))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_7, 7))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_8, 8))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_9, 9))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_10, 0))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_jack, 0))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_queen, 0))
        deck.add(Card(Suits.DIAMOND, R.drawable.diamonds_king, 0))
    }
}
