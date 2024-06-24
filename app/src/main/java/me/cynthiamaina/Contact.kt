package me.cynthiamaina

import android.provider.ContactsContract.CommonDataKinds.Email

data class Contact(
    var name:String,
    var phoneNUmber:String,
    var email: String,
    var avator:String
)
