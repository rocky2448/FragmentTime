package com.example.fregmenttime

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import java.util.Date


class FirstFragment : Fragment() {
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("First Fragment", "OnAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("First Fragment", "OnCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("First Fragment111", "OnCreateView")
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val dateTV: TextView = view.findViewById(R.id.dateTV)
        val updateBTN: Button = view.findViewById(R.id.updateBTN)
        updateBTN.setOnClickListener {
            Log.d("First Fragment111", "OnViewCreated")
            val date = Date().toString()
            dateTV.text = date
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("First Fragment111", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("First Fragment111", "OnResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("First Fragment", "OnStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("First Fragment", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("First Fragment", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("First Fragment", "onDetach")
    }




}