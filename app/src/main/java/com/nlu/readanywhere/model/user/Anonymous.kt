package com.nlu.readanywhere.model.user

open class Anonymous {
    open val role = "anonymous"
    open val canBuy = false
    open val managerUser = false
    open val managerProducts = false
    open val managerOrders = false
}