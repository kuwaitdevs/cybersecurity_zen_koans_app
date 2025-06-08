package com.kuwaitdevs.cybersecurityzenkoans.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kuwaitdevs.cybersecurityzenkoans.data.KoanWithExplanation
import com.kuwaitdevs.cybersecurityzenkoans.data.KoansRepository

/**
 * ViewModel for handling the logic related to displaying and refreshing Koans
 */
class KoanViewModel : ViewModel() {
    private val koansRepository = KoansRepository()
    
    // LiveData for the current koan with explanation
    private val _currentKoanWithExplanation = MutableLiveData<KoanWithExplanation>()
    val currentKoanWithExplanation: LiveData<KoanWithExplanation> = _currentKoanWithExplanation
    
    // Animation flag
    private val _showAnimation = MutableLiveData<Boolean>()
    private val _showShakeMessage = MutableLiveData<Boolean>(true)

    val showAnimation: LiveData<Boolean> = _showAnimation
    val showShakeMessage: LiveData<Boolean> = _showShakeMessage
    
    init {
        refreshKoan()
    }

    fun refreshKoan() {
        _showAnimation.value = true
        val newKoan = koansRepository.getRandomKoanWithExplanation()
        _currentKoanWithExplanation.value = newKoan
    }

    fun getKoanById(id: Int): KoanWithExplanation? {
        return koansRepository.getKoanById(id)
    }

    fun resetAnimation() {
        _showAnimation.value = false
    }

    fun hideShakeMessage() {
        _showShakeMessage.value = false
    }
}
