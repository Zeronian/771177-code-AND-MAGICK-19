package com.myapp.rishabhrawat.cryptocurrencytracker.Model

class CoinModel {

    var id:String?=null
    var name:String?=null
    var symbol:String?=null
    var price_usd:String?=null
    var percent_change_1h:String?=null
    var percent_change_24h:String?=null
    var percent_change_7d:String?=null

    constructor()

    constructor(id: String?, name: String?, symbol: String?, price_usd: String?, percent_change_1h: String?, percentage_change_24h: String?,