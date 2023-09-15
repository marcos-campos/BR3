package com.example.br3

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import com.itextpdf.text.Document
import com.itextpdf.text.Image
import com.itextpdf.text.Paragraph
import com.itextpdf.text.pdf.PdfWriter
import com.itextpdf.text.pdf.draw.LineSeparator
import java.io.File
import java.io.FileOutputStream


class MainActivity : AppCompatActivity() {

    lateinit var exportButton: Button
    lateinit var nameEditText: EditText
    lateinit var nameText: TextView
    lateinit var orderEditText: EditText
    lateinit var orderText: TextView
    lateinit var adressEditText: EditText
    lateinit var adressText: TextView
    lateinit var cityEditText: EditText
    lateinit var cityText: TextView
    lateinit var cepEditText: EditText
    lateinit var cepText: TextView
    lateinit var stateEditText: EditText
    lateinit var stateText: TextView
    lateinit var phoneEditText: EditText
    lateinit var phoneText: TextView
    lateinit var cnpjEditText: EditText
    lateinit var cnpjText: TextView
    lateinit var conditionsEditText: EditText
    lateinit var conditionsText: TextView
    lateinit var commentsEditText: EditText
    lateinit var commentsText: TextView
    lateinit var refEditText: EditText
    lateinit var refText: TextView
    lateinit var pairEditText: EditText
    lateinit var pairText: TextView
    lateinit var colorEditText: EditText
    lateinit var colorText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exportButton = findViewById<Button>(R.id.main_btn_export)
        nameEditText = findViewById<EditText>(R.id.main_ed_name)
        nameText = findViewById<TextView>(R.id.main_tv_name)
        orderEditText = findViewById<EditText>(R.id.main_ed_order)
        orderText = findViewById<TextView>(R.id.main_tv_order)
        adressEditText = findViewById<EditText>(R.id.main_ed_adress)
        adressText = findViewById<TextView>(R.id.main_tv_adress)
        cityEditText = findViewById<EditText>(R.id.main_ed_city)
        cityText = findViewById<TextView>(R.id.main_tv_city)
        cepEditText = findViewById<EditText>(R.id.main_ed_cep)
        cepText = findViewById<TextView>(R.id.main_tv_cep)
        stateEditText = findViewById<EditText>(R.id.main_ed_state)
        stateText = findViewById<TextView>(R.id.main_tv_state)
        phoneEditText = findViewById<EditText>(R.id.main_ed_phone)
        phoneText = findViewById<TextView>(R.id.main_tv_phone)
        cnpjEditText = findViewById<EditText>(R.id.main_ed_cnpj)
        cnpjText = findViewById<TextView>(R.id.main_tv_cnpj)
        conditionsEditText = findViewById<EditText>(R.id.main_ed_conditions)
        conditionsText = findViewById<TextView>(R.id.main_tv_conditions)
        commentsEditText = findViewById<EditText>(R.id.main_ed_comments)
        commentsText = findViewById<TextView>(R.id.main_tv_comments)
        refEditText = findViewById<EditText>(R.id.main_ed_ref)
        refText = findViewById<TextView>(R.id.main_tv_ref)
        pairEditText = findViewById<EditText>(R.id.main_ed_pair)
        pairText = findViewById<TextView>(R.id.main_tv_pair)
        colorEditText = findViewById<EditText>(R.id.main_ed_color)
        colorText = findViewById<TextView>(R.id.main_tv_color)

        exportButton.setOnClickListener {
            requestWriteExternalPermission()
        }
    }

    private fun exportToPDF() {

        val order = orderText.text.toString().trim()
        val orderTyped = orderEditText.text.toString().trim()
        val name = nameText.text.toString().trim()
        val nameTyped = nameEditText.text.toString().trim()
        val adress = adressText.text.toString().trim()
        val adressTyped = adressEditText.text.toString().trim()
        val city = cityText.text.toString().trim()
        val cityTyped = cityEditText.text.toString().trim()
        val cep = cepText.text.toString().trim()
        val cepTyped = cepEditText.text.toString().trim()
        val state = stateText.text.toString().trim()
        val stateTyped = stateEditText.text.toString().trim()
        val phone = phoneText.text.toString().trim()
        val phoneTyped = phoneEditText.text.toString().trim()
        val cnpj = cnpjText.text.toString().trim()
        val cnpjTyped = cnpjEditText.text.toString().trim()
        val conditions = conditionsText.text.toString().trim()
        val conditionsTyped = conditionsEditText.text.toString().trim()
        val comments = commentsText.text.toString().trim()
        val commentsTyped = commentsEditText.text.toString().trim()
        val ref = refText.text.toString().trim()
        val refTyped = refEditText.text.toString().trim()
        val pair = pairText.text.toString().trim()
        val pairTyped = pairEditText.text.toString().trim()
        val color = colorText.text.toString().trim()
        val colorTyped = colorEditText.text.toString().trim()

        if (nameTyped.isEmpty()) {
            Toast.makeText(this, "Escreva algo", Toast.LENGTH_LONG).show()
        }

        try {
            val fileName = System.currentTimeMillis().toString() + ".pdf"

            val pdfFile = File(
                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS),
                fileName
            )

            val outputStream: FileOutputStream = FileOutputStream(pdfFile)
            val document = Document()
            PdfWriter.getInstance(document, outputStream)

            val pdfUri = FileProvider.getUriForFile(
                this,
                "com.example.br3" + ".provider",
                pdfFile
            )

            val intent = Intent(Intent.ACTION_VIEW)
            intent.setDataAndType(pdfUri, "application/pdf")

            intent.flags =
                Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_ACTIVITY_NO_HISTORY
            startActivity(intent)

            document.open()
            document.add(Paragraph("$order $orderTyped"))
            document.add(Paragraph("$name $nameTyped"))
            document.add(Paragraph("$adress $adressTyped"))
            document.add(Paragraph("$city $cityTyped"))
            document.add(Paragraph("$cep $cepTyped"))
            document.add(Paragraph("$state $stateTyped"))
            document.add(Paragraph("$phone $phoneTyped"))
            document.add(Paragraph("$cnpj $cnpjTyped"))
            document.add(Paragraph("$conditions $conditionsTyped"))
            document.add(Paragraph("$comments $commentsTyped"))

            document.add(Paragraph(" "))
            document.add(LineSeparator())
            document.add(Paragraph(" "))

            document.add(Paragraph("$ref $refTyped"))
            document.add(Paragraph("$pair $pairTyped"))
            document.add(Paragraph("$color $colorTyped"))

            document.close()

            Toast.makeText(this, "PDF exportado com sucesso", Toast.LENGTH_LONG).show()


        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun requestWriteExternalPermission() {
        val permission = android.Manifest.permission.WRITE_EXTERNAL_STORAGE
        val isGranted = ContextCompat.checkSelfPermission(this, permission)

        if (isGranted != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(permission), 1)

            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.WRITE_EXTERNAL_STORAGE
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                exportToPDF()
            }

        } else {
//            Toast.makeText(this, "permission already granted", Toast.LENGTH_LONG).show()
            exportToPDF()
        }

    }
}