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
import com.itextpdf.text.Paragraph
import com.itextpdf.text.pdf.PdfWriter
import java.io.File
import java.io.FileOutputStream


class MainActivity : AppCompatActivity() {

    lateinit var exportButton: Button
    lateinit var nameEditText: EditText
    lateinit var nameText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        exportButton = findViewById<Button>(R.id.main_btn_export)
        nameEditText = findViewById<EditText>(R.id.main_ed_name)
        nameText = findViewById<TextView>(R.id.main_tv_name)

        exportButton.setOnClickListener {
            requestWriteExternalPermission()
        }
    }

    private fun exportToPDF() {
        val name = nameText.text.toString().trim()
        val textName = nameEditText.text.toString().trim()

        if (textName.isEmpty()) {
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
            document.add(Paragraph(name + textName))
            document.add(Paragraph(name + textName))
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