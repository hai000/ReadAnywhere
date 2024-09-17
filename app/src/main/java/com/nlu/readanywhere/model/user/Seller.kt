package com.nlu.readanywhere.model.user

class Seller: User() {
    override val role = "seller"
    override val managerProducts = true
    override val managerOrders = true
}