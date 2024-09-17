package com.nlu.readanywhere.model.user

class Admin : User() {
    override val role = "admin"
    override val managerProducts = true
    override val managerOrders = true
    override val managerUser = true
}