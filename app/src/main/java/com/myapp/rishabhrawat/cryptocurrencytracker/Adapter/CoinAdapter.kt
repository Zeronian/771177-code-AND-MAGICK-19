
package com.myapp.rishabhrawat.cryptocurrencytracker.Adapter

import android.app.Activity
import android.graphics.Color
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.myapp.rishabhrawat.cryptocurrencytracker.Common.Common
import com.myapp.rishabhrawat.cryptocurrencytracker.Interface.ILoadMore
import com.myapp.rishabhrawat.cryptocurrencytracker.Model.CoinModel
import com.myapp.rishabhrawat.cryptocurrencytracker.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.coin_layout.view.*
import kotlin.math.sign

class CoinViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){

    //this is card view layout item
    var coinIcon=itemView.coinIcon
    var coinsymbol=itemView.coin_symbol
    var coinname=itemView.coin_name
    var coinPrice=itemView.price_usd
    var oneHourChange=itemView.one_hour
    var twentyFourChange=itemView.twenty_four_hour
    var sevenDayChange=itemView.seven_day

}

class CoinAdapter(recyclerView: RecyclerView,internal var activity: Activity,var items:List<CoinModel>): RecyclerView.Adapter<CoinViewHolder>()