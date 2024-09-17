package com.nlu.readanywhere.model.user

open class User : Anonymous() {
    var username :String?= null
    var password :String?= null
    var email:String?= null
    var phoneNumber :String?= null
    override val canBuy = true

    fun login() : User{
        return User()
    }
    fun register() : User{
        return User()
    }
}