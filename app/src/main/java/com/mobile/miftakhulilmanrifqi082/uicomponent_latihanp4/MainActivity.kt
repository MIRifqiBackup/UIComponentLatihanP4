package com.mobile.miftakhulilmanrifqi082.uicomponent_latihanp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mobile.miftakhulilmanrifqi082.uicomponent_latihanp4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val imgButton = binding.imgButtonAdd
        val txtNama = binding.editNama
        val txtPanggilan = binding.editPanggilan
        val txtUmur = binding.editUmur
        //
        val radioGroupGol = binding.radioGroupGol
        val radioButtonGolA = binding.radioButtonGolA
        val radioButtonGolB = binding.radioButtonGolB
        val radioButtonGolAB = binding.radioButtonGolAB
        val radioButtonGolO = binding.radioButtonGolO
        //
        val radioGroupGender = binding.radioGroupGender
        val radioButtonPria = binding.radioButtonPria
        val radioButtonWanita = binding.radioButtonWanita
        //
        val checkBoxBakso = binding.checkBoxBakso
        val checkBoxSate = binding.checkBoxSate
        val checkBoxSeblak = binding.checkBoxSeblak





        imgButton.setOnClickListener {
            Toast.makeText(this, "Nama : " + txtNama.text.toString(), Toast.LENGTH_LONG).show()
            Toast.makeText(this, "Panggilan : " + txtPanggilan.text.toString(), Toast.LENGTH_LONG).show()
            Toast.makeText(this, "Umur : " + txtUmur.text.toString(), Toast.LENGTH_LONG).show()

            //Golongan Darah
            when (radioGroupGol.checkedRadioButtonId) {
                radioButtonGolA.id -> {
                    Toast.makeText(this, "Golongan Darah : " + radioButtonGolA.text.toString(), Toast.LENGTH_LONG).show()
                }
                radioButtonGolB.id -> {
                    Toast.makeText(this, "Golongan Darah : " + radioButtonGolB.text.toString(), Toast.LENGTH_LONG).show()
                }
                radioButtonGolAB.id -> {
                    Toast.makeText(this, "Golongan Darah : " + radioButtonGolAB.text.toString(), Toast.LENGTH_LONG).show()
                }
                radioButtonGolAB.id -> {
                    Toast.makeText(this, "Golongan Darah : " + radioButtonGolAB.text.toString(), Toast.LENGTH_LONG).show()
                }
                radioButtonGolO.id -> {
                    Toast.makeText(this, "Golongan Darah : " + radioButtonGolO.text.toString(), Toast.LENGTH_LONG).show()
                }
                else -> {
                    Toast.makeText(this, "Golongan Darah : ", Toast.LENGTH_LONG).show()
                }
            }


            //Gender
            when (radioGroupGender.checkedRadioButtonId) {
                radioButtonPria.id -> {
                    Toast.makeText(this, "Gender : " + radioButtonPria.text.toString(), Toast.LENGTH_LONG).show()
                }
                radioButtonWanita.id -> {
                    Toast.makeText(this, "Gender : " + radioButtonWanita.text.toString(), Toast.LENGTH_LONG).show()
                }
                else -> {
                    Toast.makeText(this, "Gender : ", Toast.LENGTH_LONG).show()
                }
            }

            //Favorit
                 //Melihat Status Kondisi Pada Pilihan Menu checkBoxBakso

                    Toast.makeText(this,"Favorit : " + checkBoxBakso.text.toString(), Toast.LENGTH_LONG).show()

            if (checkBoxSate.isChecked) {
                Toast.makeText(this,"Favorit : " + checkBoxSate.text.toString(), Toast.LENGTH_LONG).show()
            }
            if (checkBoxSeblak.isChecked) {
                Toast.makeText(this,"Favorit : " + checkBoxSeblak.text.toString(), Toast.LENGTH_LONG).show()
            }




        }
    }
}
