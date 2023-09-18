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
import com.itextpdf.text.pdf.PdfPTable
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
    lateinit var numbering: TextView
    lateinit var number20Text: TextView
    lateinit var number20EditText: EditText
    lateinit var number21Text: TextView
    lateinit var number21EditText: EditText
    lateinit var number22Text: TextView
    lateinit var number22EditText: EditText
    lateinit var number23Text: TextView
    lateinit var number23EditText: EditText
    lateinit var number24Text: TextView
    lateinit var number24EditText: EditText
    lateinit var number25Text: TextView
    lateinit var number25EditText: EditText
    lateinit var number26Text: TextView
    lateinit var number26EditText: EditText
    lateinit var number27Text: TextView
    lateinit var number27EditText: EditText
    lateinit var number28Text: TextView
    lateinit var number28EditText: EditText
    lateinit var number29Text: TextView
    lateinit var number29EditText: EditText
    lateinit var number30Text: TextView
    lateinit var number30EditText: EditText
    lateinit var number31Text: TextView
    lateinit var number31EditText: EditText
    lateinit var number32Text: TextView
    lateinit var number32EditText: EditText
    lateinit var number33Text: TextView
    lateinit var number33EditText: EditText
    lateinit var number34Text: TextView
    lateinit var number34EditText: EditText
    lateinit var number35Text: TextView
    lateinit var number35EditText: EditText
    lateinit var number36Text: TextView
    lateinit var number36EditText: EditText
    lateinit var number37Text: TextView
    lateinit var number37EditText: EditText
    lateinit var number38Text: TextView
    lateinit var number38EditText: EditText
    lateinit var number39Text: TextView
    lateinit var number39EditText: EditText
    lateinit var number40Text: TextView
    lateinit var number40EditText: EditText
    lateinit var number41Text: TextView
    lateinit var number41EditText: EditText
    lateinit var number42Text: TextView
    lateinit var number42EditText: EditText
    lateinit var number43Text: TextView
    lateinit var number43EditText: EditText
    lateinit var number44Text: TextView
    lateinit var number44EditText: EditText
    lateinit var number45Text: TextView
    lateinit var number45EditText: EditText
    lateinit var number46Text: TextView
    lateinit var number46EditText: EditText
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
        numbering = findViewById<TextView>(R.id.main_tv_numbering)
        number20Text = findViewById<TextView>(R.id.main_tv_number_20)
        number20EditText = findViewById<EditText>(R.id.main_ed_number_20)
        number21Text = findViewById<TextView>(R.id.main_tv_number_21)
        number21EditText = findViewById<EditText>(R.id.main_ed_number_21)
        number22Text = findViewById<TextView>(R.id.main_tv_number_22)
        number22EditText = findViewById<EditText>(R.id.main_ed_number_22)
        number23Text = findViewById<TextView>(R.id.main_tv_number_23)
        number23EditText = findViewById<EditText>(R.id.main_ed_number_23)
        number24Text = findViewById<TextView>(R.id.main_tv_number_24)
        number24EditText = findViewById<EditText>(R.id.main_ed_number_24)
        number25Text = findViewById<TextView>(R.id.main_tv_number_25)
        number25EditText = findViewById<EditText>(R.id.main_ed_number_25)
        number26Text = findViewById<TextView>(R.id.main_tv_number_26)
        number26EditText = findViewById<EditText>(R.id.main_ed_number_26)
        number27Text = findViewById<TextView>(R.id.main_tv_number_27)
        number27EditText = findViewById<EditText>(R.id.main_ed_number_27)
        number28Text = findViewById<TextView>(R.id.main_tv_number_28)
        number28EditText = findViewById<EditText>(R.id.main_ed_number_28)
        number29Text = findViewById<TextView>(R.id.main_tv_number_29)
        number29EditText = findViewById<EditText>(R.id.main_ed_number_29)
        number30Text = findViewById<TextView>(R.id.main_tv_number_30)
        number30EditText = findViewById<EditText>(R.id.main_ed_number_30)
        number31Text = findViewById<TextView>(R.id.main_tv_number_31)
        number31EditText = findViewById<EditText>(R.id.main_ed_number_31)
        number32Text = findViewById<TextView>(R.id.main_tv_number_32)
        number32EditText = findViewById<EditText>(R.id.main_ed_number_32)
        number33Text = findViewById<TextView>(R.id.main_tv_number_33)
        number33EditText = findViewById<EditText>(R.id.main_ed_number_33)
        number34Text = findViewById<TextView>(R.id.main_tv_number_34)
        number34EditText = findViewById<EditText>(R.id.main_ed_number_34)
        number35Text = findViewById<TextView>(R.id.main_tv_number_35)
        number35EditText = findViewById<EditText>(R.id.main_ed_number_35)
        number36Text = findViewById<TextView>(R.id.main_tv_number_36)
        number36EditText = findViewById<EditText>(R.id.main_ed_number_36)
        number37Text = findViewById<TextView>(R.id.main_tv_number_37)
        number37EditText = findViewById<EditText>(R.id.main_ed_number_37)
        number38Text = findViewById<TextView>(R.id.main_tv_number_38)
        number38EditText = findViewById<EditText>(R.id.main_ed_number_38)
        number39Text = findViewById<TextView>(R.id.main_tv_number_39)
        number39EditText = findViewById<EditText>(R.id.main_ed_number_39)
        number40Text = findViewById<TextView>(R.id.main_tv_number_40)
        number40EditText = findViewById<EditText>(R.id.main_ed_number_40)
        number41Text = findViewById<TextView>(R.id.main_tv_number_41)
        number41EditText = findViewById<EditText>(R.id.main_ed_number_41)
        number42Text = findViewById<TextView>(R.id.main_tv_number_42)
        number42EditText = findViewById<EditText>(R.id.main_ed_number_42)
        number43Text = findViewById<TextView>(R.id.main_tv_number_43)
        number43EditText = findViewById<EditText>(R.id.main_ed_number_43)
        number44Text = findViewById<TextView>(R.id.main_tv_number_44)
        number44EditText = findViewById<EditText>(R.id.main_ed_number_44)
        number45Text = findViewById<TextView>(R.id.main_tv_number_45)
        number45EditText = findViewById<EditText>(R.id.main_ed_number_45)
        number46Text = findViewById<TextView>(R.id.main_tv_number_46)
        number46EditText = findViewById<EditText>(R.id.main_ed_number_46)

        exportButton.setOnClickListener {
            requestWriteExternalPermission()
            number20EditText.text.clear()
            number40EditText.text.clear()
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
        var refTyped = refEditText.text.toString().trim()
        val pair = pairText.text.toString().trim()
        var pairTyped = pairEditText.text.toString().trim()
        val color = colorText.text.toString().trim()
        var colorTyped = colorEditText.text.toString().trim()
        val numbering = numbering.text.toString().trim()
        val number20 = number20Text.text.toString().trim()
        var number20Typed = number20EditText.text.toString().trim()
        val number21 = number21Text.text.toString().trim()
        val number21Typed = number21EditText.text.toString().trim()
        val number22 = number22Text.text.toString().trim()
        val number22Typed = number22EditText.text.toString().trim()
        val number23 = number23Text.text.toString().trim()
        val number23Typed = number23EditText.text.toString().trim()
        val number24 = number24Text.text.toString().trim()
        val number24Typed = number24EditText.text.toString().trim()
        val number25 = number25Text.text.toString().trim()
        val number25Typed = number25EditText.text.toString().trim()
        val number26 = number26Text.text.toString().trim()
        val number26Typed = number26EditText.text.toString().trim()
        val number27 = number27Text.text.toString().trim()
        val number27Typed = number27EditText.text.toString().trim()
        val number28 = number28Text.text.toString().trim()
        val number28Typed = number28EditText.text.toString().trim()
        val number29 = number29Text.text.toString().trim()
        val number29Typed = number29EditText.text.toString().trim()
        val number30 = number30Text.text.toString().trim()
        val number30Typed = number30EditText.text.toString().trim()
        val number31 = number31Text.text.toString().trim()
        val number31Typed = number31EditText.text.toString().trim()
        val number32 = number32Text.text.toString().trim()
        val number32Typed = number32EditText.text.toString().trim()
        val number33 = number33Text.text.toString().trim()
        val number33Typed = number33EditText.text.toString().trim()
        val number34 = number34Text.text.toString().trim()
        val number34Typed = number34EditText.text.toString().trim()
        val number35 = number35Text.text.toString().trim()
        val number35Typed = number35EditText.text.toString().trim()
        val number36 = number36Text.text.toString().trim()
        val number36Typed = number36EditText.text.toString().trim()
        val number37 = number37Text.text.toString().trim()
        val number37Typed = number37EditText.text.toString().trim()
        val number38 = number38Text.text.toString().trim()
        val number38Typed = number38EditText.text.toString().trim()
        val number39 = number39Text.text.toString().trim()
        val number39Typed = number39EditText.text.toString().trim()
        val number40 = number40Text.text.toString().trim()
        val number40Typed = number40EditText.text.toString().trim()
        val number41 = number41Text.text.toString().trim()
        val number41Typed = number41EditText.text.toString().trim()
        val number42 = number42Text.text.toString().trim()
        val number42Typed = number42EditText.text.toString().trim()
        val number43 = number43Text.text.toString().trim()
        val number43Typed = number43EditText.text.toString().trim()
        val number44 = number44Text.text.toString().trim()
        val number44Typed = number44EditText.text.toString().trim()
        val number45 = number45Text.text.toString().trim()
        val number45Typed = number45EditText.text.toString().trim()
        val number46 = number46Text.text.toString().trim()
        var number46Typed = number46EditText.text.toString().trim()


//        refTyped $pairTyped $colorTyped

        if (refTyped.isEmpty()) {
            refTyped = "   "
        }

        if (pairTyped.isEmpty()) {
            pairTyped = "                "
        }

        if (colorTyped.isEmpty()) {
            colorTyped = " "
        }





        if (number20Typed.isEmpty()) {
            number20Typed = "0"
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


//            val glue = Chunk(VerticalPositionMark())
//            val p = Paragraph("Text to the left")
//            p.add(Chunk(glue))
//            p.add("Text to the right")
//            document.add(p)

            val titleTableFrom20To26 = PdfPTable(10)
            titleTableFrom20To26.widthPercentage = 100f
            titleTableFrom20To26.addCell(ref)
            titleTableFrom20To26.addCell(pair)
            titleTableFrom20To26.addCell(color)
            titleTableFrom20To26.addCell(number20)
            titleTableFrom20To26.addCell(number21)
            titleTableFrom20To26.addCell(number22)
            titleTableFrom20To26.addCell(number23)
            titleTableFrom20To26.addCell(number24)
            titleTableFrom20To26.addCell(number25)
            titleTableFrom20To26.addCell(number26)
            document.add(titleTableFrom20To26)

            val order1From20To26 = PdfPTable(10)
            order1From20To26.widthPercentage = 100f
            order1From20To26.addCell(refTyped)
            order1From20To26.addCell(pairTyped)
            order1From20To26.addCell(colorTyped)
            order1From20To26.addCell(number20Typed)
            order1From20To26.addCell(number21Typed)
            order1From20To26.addCell(number22Typed)
            order1From20To26.addCell(number23Typed)
            order1From20To26.addCell(number24Typed)
            order1From20To26.addCell(number25Typed)
            order1From20To26.addCell(number26Typed)
            document.add(order1From20To26)


            val order2From20To26 = PdfPTable(10)
            order2From20To26.widthPercentage = 100f
            order2From20To26.addCell(refTyped)
            order2From20To26.addCell(pairTyped)
            order2From20To26.addCell(colorTyped)
            order2From20To26.addCell(number20Typed)
            order2From20To26.addCell(number21Typed)
            order2From20To26.addCell(number22Typed)
            order2From20To26.addCell(number23Typed)
            order2From20To26.addCell(number24Typed)
            order2From20To26.addCell(number25Typed)
            order2From20To26.addCell(number26Typed)
            document.add(order2From20To26)

            val order3From20To26 = PdfPTable(10)
            order3From20To26.widthPercentage = 100f
            order3From20To26.addCell(refTyped)
            order3From20To26.addCell(pairTyped)
            order3From20To26.addCell(colorTyped)
            order3From20To26.addCell(number20Typed)
            order3From20To26.addCell(number21Typed)
            order3From20To26.addCell(number22Typed)
            order3From20To26.addCell(number23Typed)
            order3From20To26.addCell(number24Typed)
            order3From20To26.addCell(number25Typed)
            order3From20To26.addCell(number26Typed)
            document.add(order3From20To26)

            document.add(Paragraph(" "))
            document.add(Paragraph(" "))

            val titleTableFrom27To33 = PdfPTable(10)
            titleTableFrom27To33.widthPercentage = 100f
            titleTableFrom27To33.addCell(ref)
            titleTableFrom27To33.addCell(pair)
            titleTableFrom27To33.addCell(color)
            titleTableFrom27To33.addCell(number27)
            titleTableFrom27To33.addCell(number28)
            titleTableFrom27To33.addCell(number29)
            titleTableFrom27To33.addCell(number30)
            titleTableFrom27To33.addCell(number31)
            titleTableFrom27To33.addCell(number32)
            titleTableFrom27To33.addCell(number33)
            document.add(titleTableFrom27To33)

            val order1From27To33 = PdfPTable(10)
            order1From27To33.widthPercentage = 100f
            order1From27To33.addCell(refTyped)
            order1From27To33.addCell(pairTyped)
            order1From27To33.addCell(colorTyped)
            order1From27To33.addCell(number27Typed)
            order1From27To33.addCell(number28Typed)
            order1From27To33.addCell(number29Typed)
            order1From27To33.addCell(number30Typed)
            order1From27To33.addCell(number31Typed)
            order1From27To33.addCell(number32Typed)
            order1From27To33.addCell(number33Typed)
            document.add(order1From27To33)


            val order2From27To33 = PdfPTable(10)
            order2From27To33.widthPercentage = 100f
            order2From27To33.addCell(refTyped)
            order2From27To33.addCell(pairTyped)
            order2From27To33.addCell(colorTyped)
            order2From27To33.addCell(number27Typed)
            order2From27To33.addCell(number28Typed)
            order2From27To33.addCell(number29Typed)
            order2From27To33.addCell(number30Typed)
            order2From27To33.addCell(number31Typed)
            order2From27To33.addCell(number32Typed)
            order2From27To33.addCell(number33Typed)
            document.add(order2From27To33)

            val order3From27To33 = PdfPTable(10)
            order3From27To33.widthPercentage = 100f
            order3From27To33.addCell(refTyped)
            order3From27To33.addCell(pairTyped)
            order3From27To33.addCell(colorTyped)
            order3From27To33.addCell(number27Typed)
            order3From27To33.addCell(number28Typed)
            order3From27To33.addCell(number29Typed)
            order3From27To33.addCell(number30Typed)
            order3From27To33.addCell(number31Typed)
            order3From27To33.addCell(number32Typed)
            order3From27To33.addCell(number33Typed)
            document.add(order3From27To33)

            document.add(Paragraph(" "))
            document.add(Paragraph(" "))

            val titleTableFrom34To40 = PdfPTable(10)
            titleTableFrom34To40.widthPercentage = 100f
            titleTableFrom34To40.addCell(ref)
            titleTableFrom34To40.addCell(pair)
            titleTableFrom34To40.addCell(color)
            titleTableFrom34To40.addCell(number34)
            titleTableFrom34To40.addCell(number35)
            titleTableFrom34To40.addCell(number36)
            titleTableFrom34To40.addCell(number37)
            titleTableFrom34To40.addCell(number38)
            titleTableFrom34To40.addCell(number39)
            titleTableFrom34To40.addCell(number40)
            document.add(titleTableFrom34To40)

            val order1From34To40 = PdfPTable(10)
            order1From34To40.widthPercentage = 100f
            order1From34To40.addCell(refTyped)
            order1From34To40.addCell(pairTyped)
            order1From34To40.addCell(colorTyped)
            order1From34To40.addCell(number34Typed)
            order1From34To40.addCell(number35Typed)
            order1From34To40.addCell(number36Typed)
            order1From34To40.addCell(number37Typed)
            order1From34To40.addCell(number38Typed)
            order1From34To40.addCell(number39Typed)
            order1From34To40.addCell(number40Typed)
            document.add(order1From34To40)

            val order2From34To40 = PdfPTable(10)
            order2From34To40.widthPercentage = 100f
            order2From34To40.addCell(refTyped)
            order2From34To40.addCell(pairTyped)
            order2From34To40.addCell(colorTyped)
            order2From34To40.addCell(number34Typed)
            order2From34To40.addCell(number35Typed)
            order2From34To40.addCell(number36Typed)
            order2From34To40.addCell(number37Typed)
            order2From34To40.addCell(number38Typed)
            order2From34To40.addCell(number39Typed)
            order2From34To40.addCell(number40Typed)
            document.add(order2From34To40)

            val order3From34To40 = PdfPTable(10)
            order3From34To40.widthPercentage = 100f
            order3From34To40.addCell(refTyped)
            order3From34To40.addCell(pairTyped)
            order3From34To40.addCell(colorTyped)
            order3From34To40.addCell(number34Typed)
            order3From34To40.addCell(number35Typed)
            order3From34To40.addCell(number36Typed)
            order3From34To40.addCell(number37Typed)
            order3From34To40.addCell(number38Typed)
            order3From34To40.addCell(number39Typed)
            order3From34To40.addCell(number40Typed)
            document.add(order3From34To40)

            document.add(Paragraph(" "))
            document.add(Paragraph(" "))


            val titleTableFrom41To47 = PdfPTable(10)
            titleTableFrom41To47.widthPercentage = 100f
            titleTableFrom41To47.addCell(ref)
            titleTableFrom41To47.addCell(pair)
            titleTableFrom41To47.addCell(color)
            titleTableFrom41To47.addCell(number41)
            titleTableFrom41To47.addCell(number42)
            titleTableFrom41To47.addCell(number43)
            titleTableFrom41To47.addCell(number44)
            titleTableFrom41To47.addCell(number45)
            titleTableFrom41To47.addCell(number46)
            titleTableFrom41To47.addCell("47")
            document.add(titleTableFrom41To47)

            val order1From41To47 = PdfPTable(10)
            order1From41To47.widthPercentage = 100f
            order1From41To47.addCell(refTyped)
            order1From41To47.addCell(pairTyped)
            order1From41To47.addCell(colorTyped)
            order1From41To47.addCell(number41Typed)
            order1From41To47.addCell(number42Typed)
            order1From41To47.addCell(number43Typed)
            order1From41To47.addCell(number44Typed)
            order1From41To47.addCell(number45Typed)
            order1From41To47.addCell(number46Typed)
            order1From41To47.addCell(" ")
            document.add(order1From41To47)


            val order2From41To47 = PdfPTable(10)
            order2From41To47.widthPercentage = 100f
            order2From41To47.addCell(refTyped)
            order2From41To47.addCell(pairTyped)
            order2From41To47.addCell(colorTyped)
            order2From41To47.addCell(number41Typed)
            order2From41To47.addCell(number42Typed)
            order2From41To47.addCell(number43Typed)
            order2From41To47.addCell(number44Typed)
            order2From41To47.addCell(number45Typed)
            order2From41To47.addCell(number46Typed)
            order2From41To47.addCell(" ")
            document.add(order2From41To47)

            val order3From41To47 = PdfPTable(10)
            order3From41To47.widthPercentage = 100f
            order3From41To47.addCell(refTyped)
            order3From41To47.addCell(pairTyped)
            order3From41To47.addCell(colorTyped)
            order3From41To47.addCell(number41Typed)
            order3From41To47.addCell(number42Typed)
            order3From41To47.addCell(number43Typed)
            order3From41To47.addCell(number44Typed)
            order3From41To47.addCell(number45Typed)
            order3From41To47.addCell(number46Typed)
            order3From41To47.addCell(" ")
            document.add(order3From41To47)




//            document.add(Paragraph("$ref  $pair $color $number20 $number21 $number22 $number23 $number24 $number25 $number26"))
//            document.add(Paragraph("$refTyped $pairTyped $colorTyped $number20Typed $number21Typed $number22Typed $number23Typed $number24Typed $number25Typed $number26Typed"))

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