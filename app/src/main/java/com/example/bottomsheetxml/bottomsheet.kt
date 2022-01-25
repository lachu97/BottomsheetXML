package com.example.bottomsheetxml

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ModalBottomSheet : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.model_sheet, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bt1= view.findViewById<Button>(R.id.click)
        val bt2= view.findViewById<Button>(R.id.click1)
        val bt3= view.findViewById<Button>(R.id.click3)
        bt1.setOnClickListener {
            Toast.makeText(requireContext(),"Clicked Me ",Toast.LENGTH_LONG).show()
        }
        bt2.setOnClickListener {
            Toast.makeText(requireContext(),"Fucked Me ",Toast.LENGTH_LONG).show()
        }
        bt3.setOnClickListener {
            Toast.makeText(requireContext(),"Striped Me",Toast.LENGTH_LONG).show()
        }
    }
    companion object {
        const val TAG = "ModalBottomSheet"
    }

}