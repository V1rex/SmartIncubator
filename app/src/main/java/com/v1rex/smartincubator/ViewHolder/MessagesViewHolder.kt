package com.v1rex.smartincubator.ViewHolder

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.v1rex.smartincubator.R

class MessagesViewHolder (private val mView: View) : RecyclerView.ViewHolder(mView) {

    private val nameTextView: TextView
    private val messageTextView: TextView


    init {
        nameTextView = mView.findViewById<View>(R.id.name_receiver_text) as TextView
        messageTextView = mView.findViewById<View>(R.id.message_receiver_text) as TextView
    }

    fun setNameTextView(name: String) {
        nameTextView.setText(name)
    }

    fun setMessageEditText(message: String){
        messageTextView.setText(message)
    }


}