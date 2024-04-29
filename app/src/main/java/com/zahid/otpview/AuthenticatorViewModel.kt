package com.zahid.otpview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.brainx.clientdex.repository.AuthenticatorRepository

class AuthenticatorViewModel(repository: AuthenticatorRepository) : ViewModel() {

    val optField1 = MutableLiveData<String>()
    val optField2 = MutableLiveData<String>()
    val optField3 = MutableLiveData<String>()
    val optField4 = MutableLiveData<String>()
    val optField5 = MutableLiveData<String>()
    val optField6 = MutableLiveData<String>()
    val opt = MutableLiveData<String>()
    var isOnSms = false


}