package com.brainx.clientdex.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.brainx.clientdex.repository.AuthenticatorRepository
import com.zahid.otpview.AuthenticatorViewModel

class AuthenticatorViewModelFactory (  private val repository: AuthenticatorRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AuthenticatorViewModel(repository) as T
    }
}