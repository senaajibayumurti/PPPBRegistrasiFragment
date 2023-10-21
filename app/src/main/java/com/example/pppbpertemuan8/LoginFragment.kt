package com.example.pppbpertemuan8

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.pppbpertemuan8.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentLoginBinding.inflate(inflater, container, false)
        val bundle = arguments
        val username2 = bundle?.getString("username")
        val password2 = bundle?.getString("password")

        with(binding){
            buttonLogIn.setOnClickListener {
                if (editTextUsernameLogIn.text.toString() != username2 ||
                    editTextPasswordLogIn.text.toString() != password2){
                    Toast.makeText(
                        requireContext(),
                        "Please Fill with the Correct Credentials",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    val intent = Intent(requireContext(), WelcomeActivity::class.java)
                    startActivity(intent)
                }
            }
        }
        return binding.root
    }
}