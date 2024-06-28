package com.example.freagmentnavigation

import User
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val dataSet: ArrayList<User>, private val listener: ItemClickListener) :
    RecyclerView.Adapter<ContactAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView

        init {
            textView = view.findViewById(R.id.tv_name_id)
        }

        val textViewInt: TextView

        init {
            textViewInt = view.findViewById(R.id.tv_number_id)
        }

//        val textViewSecondFragment: TextView
//
//        init {
//            textViewSecondFragment = view.findViewById(R.id.tv_second_fragment_name_id)
//        }
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

        viewHolder.textView.text = dataSet[position].name
        viewHolder.textViewInt.text = dataSet[position].phoneNumber
//        viewHolder.textViewSecondFragment.text = dataSet[position].name

        viewHolder.textView.setOnClickListener {
            listener.onItemClick(dataSet[position])
        }


    }

    override fun getItemCount() = dataSet.size

    interface ItemClickListener {
        fun onItemClick(user: User)
    }
}
