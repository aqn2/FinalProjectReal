package com.example.learningnavigation.ui.Instruction

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.example.learningnavigation.MainActivity
import com.example.learningnavigation.R
import com.example.learningnavigation.databinding.FragmentInstructionsDetailBinding
import com.example.learningnavigation.ui.Chores.ChoresFragment
import com.example.learningnavigation.ui.Instruction.Instructions

class InstructionDetail : AppCompatActivity() {

    private lateinit var binding: FragmentInstructionsDetailBinding

    companion object {
        val EXTRA_INSTRUCTION = "The instruction"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentInstructionsDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val instructions = intent.getParcelableExtra<Instructions>(EXTRA_INSTRUCTION)
        binding.textViewInstructionsDetailName.text = instructions?.name
        binding.textViewInstructionsDetailDescription.text = instructions?.instructions


        binding.buttonInstructionBack.setOnClickListener{

            //findNavController().navigate(R.id.nav_chores)
            //findNavController(R.id.nav_chores)
            //NavHostFragment.findNavController(InstructionFragment)
            val i = Intent(this@InstructionDetail, MainActivity::class.java)
            startActivity(i)





        }

    }
}


