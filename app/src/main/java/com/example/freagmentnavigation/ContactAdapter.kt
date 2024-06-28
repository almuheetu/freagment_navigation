package com.example.freagmentnavigation

import User
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(
    private val dataSet: ArrayList<User>,
    private val listener: ItemClickListener
) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textViewName: TextView

        init {
            textViewName = view.findViewById(R.id.tv_name_id)
        }

        val textViewNumber: TextView

        init {
            textViewNumber = view.findViewById(R.id.tv_number_id)
        }

    }

    override fun onCreateViewHolder(
        viewGroup: ViewGroup,
        viewType: Int,
    ): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context)
                .inflate(R.layout.contract_layout, viewGroup, false)

        Log.d("Log404", "Created")

        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        viewHolder: ViewHolder,
        position: Int,
    ) {
        Log.d("Log404", "binding")

        viewHolder.textViewName.text = dataSet[position].name
        viewHolder.textViewNumber.text = dataSet[position].phoneNumber


        viewHolder.textViewName.setOnClickListener {
            listener.onItemClick(dataSet[position])
        }
    }

    override fun getItemCount() = dataSet.size

    interface ItemClickListener {
        fun onItemClick(user: User)
    }
}
