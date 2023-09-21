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
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date


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
    lateinit var orderItens: ArrayList<Item>
    lateinit var newItemBtn: Button
    lateinit var adultUnitaryValueEditText: EditText
    lateinit var childrensUnitaryValueEditText: EditText
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
        orderItens = arrayListOf<Item>()
        newItemBtn = findViewById<Button>(R.id.main_btn_new_item)
        adultUnitaryValueEditText = findViewById<EditText>(R.id.main_ed_adult_unitary_value)
        childrensUnitaryValueEditText = findViewById<EditText>(R.id.main_ed_childrens_unitary_value)

        exportButton.setOnClickListener {
            requestWriteExternalPermission()
        }

        newItemBtn.setOnClickListener {

            orderItens.add(
                Item(
                    refEditText.text.toString(),
                    pairEditText.text.toString(),
                    colorEditText.text.toString(),
                    childrensUnitaryValueEditText.text.toString(),
                    adultUnitaryValueEditText.text.toString(),
                    number20EditText.text.toString(),
                    number21EditText.text.toString(),
                    number22EditText.text.toString(),
                    number23EditText.text.toString(),
                    number24EditText.text.toString(),
                    number25EditText.text.toString(),
                    number26EditText.text.toString(),
                    number27EditText.text.toString(),
                    number28EditText.text.toString(),
                    number29EditText.text.toString(),
                    number30EditText.text.toString(),
                    number31EditText.text.toString(),
                    number32EditText.text.toString(),
                    number33EditText.text.toString(),
                    number34EditText.text.toString(),
                    number35EditText.text.toString(),
                    number36EditText.text.toString(),
                    number37EditText.text.toString(),
                    number38EditText.text.toString(),
                    number39EditText.text.toString(),
                    number40EditText.text.toString(),
                    number41EditText.text.toString(),
                    number42EditText.text.toString(),
                    number43EditText.text.toString(),
                    number44EditText.text.toString(),
                    number45EditText.text.toString(),
                    number46EditText.text.toString()
                )
            )

            Toast.makeText(this, "Item adicionado com sucesso", Toast.LENGTH_LONG).show()

            clear()
        }
    }

    private fun exportToPDF() {
        val order = orderText.text.toString().trim()
        var orderTyped = orderEditText.text.toString().trim()
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
        val pair = pairText.text.toString().trim()
        val color = colorText.text.toString().trim()
        val number20 = number20Text.text.toString().trim()
        val number21 = number21Text.text.toString().trim()
        val number22 = number22Text.text.toString().trim()
        val number23 = number23Text.text.toString().trim()
        val number24 = number24Text.text.toString().trim()
        val number25 = number25Text.text.toString().trim()
        val number26 = number26Text.text.toString().trim()
        val number27 = number27Text.text.toString().trim()
        val number28 = number28Text.text.toString().trim()
        val number29 = number29Text.text.toString().trim()
        val number30 = number30Text.text.toString().trim()
        val number31 = number31Text.text.toString().trim()
        val number32 = number32Text.text.toString().trim()
        val number33 = number33Text.text.toString().trim()
        val number34 = number34Text.text.toString().trim()
        val number35 = number35Text.text.toString().trim()
        val number36 = number36Text.text.toString().trim()
        val number37 = number37Text.text.toString().trim()
        val number38 = number38Text.text.toString().trim()
        val number39 = number39Text.text.toString().trim()
        val number40 = number40Text.text.toString().trim()
        val number41 = number41Text.text.toString().trim()
        val number42 = number42Text.text.toString().trim()
        val number43 = number43Text.text.toString().trim()
        val number44 = number44Text.text.toString().trim()
        val number45 = number45Text.text.toString().trim()
        val number46 = number46Text.text.toString().trim()

        try {
            if (orderTyped.isEmpty()){
                orderTyped = "1"
            }

            val currentTime: Date = Calendar.getInstance().time
            println(currentTime)

            val date: String = SimpleDateFormat("dd.MM.yyyy").format(currentTime)
            println(date)

            val fileName = "$date - Pedido BR3 nº$orderTyped.pdf"

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
            document.add(Paragraph(" "))

            orderItens.forEach { item ->

                checkIfTheNumberingIsEmpty(item)

                val titleTable = PdfPTable(3)
                titleTable.widthPercentage = 100f
                titleTable.addCell(ref + " " + item.reference)
                titleTable.addCell(pair + " " + item.pairs)
                titleTable.addCell(color + " " + item.color)
                document.add(titleTable)

                document.add(Paragraph(" "))

                val titleAdultNumbering = PdfPTable(13)
                titleAdultNumbering.widthPercentage = 100f
                titleAdultNumbering.addCell("nº $number33")
                titleAdultNumbering.addCell("nº $number34")
                titleAdultNumbering.addCell("nº $number35")
                titleAdultNumbering.addCell("nº $number36")
                titleAdultNumbering.addCell("nº $number37")
                titleAdultNumbering.addCell("nº $number38")
                titleAdultNumbering.addCell("nº $number39")
                titleAdultNumbering.addCell("nº $number40")
                titleAdultNumbering.addCell("nº $number41")
                titleAdultNumbering.addCell("nº $number42")
                titleAdultNumbering.addCell("nº $number43")
                titleAdultNumbering.addCell("nº $number44")
                titleAdultNumbering.addCell("nº $number45")
                document.add(titleAdultNumbering)

                val adultNumbering = PdfPTable(13)
                adultNumbering.widthPercentage = 100f
                adultNumbering.addCell(item.amountNumber33)
                adultNumbering.addCell(item.amountNumber34)
                adultNumbering.addCell(item.amountNumber35)
                adultNumbering.addCell(item.amountNumber36)
                adultNumbering.addCell(item.amountNumber37)
                adultNumbering.addCell(item.amountNumber38)
                adultNumbering.addCell(item.amountNumber39)
                adultNumbering.addCell(item.amountNumber40)
                adultNumbering.addCell(item.amountNumber41)
                adultNumbering.addCell(item.amountNumber42)
                adultNumbering.addCell(item.amountNumber43)
                adultNumbering.addCell(item.amountNumber44)
                adultNumbering.addCell(item.amountNumber45)
                document.add(adultNumbering)


                val (totalAmountAdult, resultAdult) = valueTotalAdult(item)


                val finalAdultTable = PdfPTable(3)
                finalAdultTable.widthPercentage = 100f
                finalAdultTable.addCell("Total: $totalAmountAdult").toString()
                finalAdultTable.addCell("Valor Unitário: R$" + item.adultUnitaryValue)
                finalAdultTable.addCell("Valor Total: R$$resultAdult")
                document.add(finalAdultTable)

                document.add(Paragraph(" "))

                val titleChildrenNumbering = PdfPTable(13)
                titleChildrenNumbering.widthPercentage = 100f
                titleChildrenNumbering.addCell("nº $number20")
                titleChildrenNumbering.addCell("nº $number21")
                titleChildrenNumbering.addCell("nº $number22")
                titleChildrenNumbering.addCell("nº $number23")
                titleChildrenNumbering.addCell("nº $number24")
                titleChildrenNumbering.addCell("nº $number25")
                titleChildrenNumbering.addCell("nº $number26")
                titleChildrenNumbering.addCell("nº $number27")
                titleChildrenNumbering.addCell("nº $number28")
                titleChildrenNumbering.addCell("nº $number29")
                titleChildrenNumbering.addCell("nº $number30")
                titleChildrenNumbering.addCell("nº $number31")
                titleChildrenNumbering.addCell("nº $number32")
                document.add(titleChildrenNumbering)

                val childrenNumbering = PdfPTable(13)
                childrenNumbering.widthPercentage = 100f
                childrenNumbering.addCell(item.amountNumber20)
                childrenNumbering.addCell(item.amountNumber21)
                childrenNumbering.addCell(item.amountNumber22)
                childrenNumbering.addCell(item.amountNumber23)
                childrenNumbering.addCell(item.amountNumber24)
                childrenNumbering.addCell(item.amountNumber25)
                childrenNumbering.addCell(item.amountNumber26)
                childrenNumbering.addCell(item.amountNumber27)
                childrenNumbering.addCell(item.amountNumber28)
                childrenNumbering.addCell(item.amountNumber29)
                childrenNumbering.addCell(item.amountNumber30)
                childrenNumbering.addCell(item.amountNumber31)
                childrenNumbering.addCell(item.amountNumber32)
                document.add(childrenNumbering)


                val (totalAmountChildren, resultChildren) = valueTotalChildren(item)

                val finalChildrenTable = PdfPTable(3)
                finalChildrenTable.widthPercentage = 100f
                finalChildrenTable.addCell("Total: $totalAmountChildren").toString()
                finalChildrenTable.addCell("Valor Unitário: R$" + item.childrensUnitaryValue)
                finalChildrenTable.addCell("Valor Total: R$$resultChildren")
                document.add(finalChildrenTable)

                document.add(Paragraph(" "))
                document.add(Paragraph(" "))
                document.add(LineSeparator())
                document.add(Paragraph(" "))
                document.add(Paragraph(" "))
            }

            document.close()
            Toast.makeText(this, "PDF exportado com sucesso", Toast.LENGTH_LONG).show()

        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun valueTotalChildren(item: Item): Pair<Int, Int> {
        val totalAmountChildren = item.amountNumber20.toString()
            .toInt() + item.amountNumber21.toString().toInt() +
                item.amountNumber22.toString().toInt() + item.amountNumber23.toString()
            .toInt() + item.amountNumber24.toString().toInt() +
                item.amountNumber25.toString().toInt() + item.amountNumber26.toString()
            .toInt() + item.amountNumber27.toString().toInt() +
                item.amountNumber28.toString().toInt() + item.amountNumber29.toString()
            .toInt() + item.amountNumber30.toString().toInt() +
                item.amountNumber31.toString().toInt() + item.amountNumber32.toString()
            .toInt()
        val unitaryValueChildren = item.childrensUnitaryValue.toString().toInt()
        val resultChildren = totalAmountChildren * unitaryValueChildren
        return Pair(totalAmountChildren, resultChildren)
    }

    private fun valueTotalAdult(item: Item): Pair<Int, Int> {
        val totalAmountAdult = item.amountNumber33.toString()
            .toInt() + item.amountNumber34.toString().toInt() +
                item.amountNumber35.toString().toInt() + item.amountNumber36.toString()
            .toInt() + item.amountNumber37.toString().toInt() +
                item.amountNumber38.toString().toInt() + item.amountNumber39.toString()
            .toInt() + item.amountNumber40.toString().toInt() +
                item.amountNumber41.toString().toInt() + item.amountNumber42.toString()
            .toInt() + item.amountNumber43.toString().toInt() +
                item.amountNumber44.toString().toInt() + item.amountNumber45.toString()
            .toInt()
        val unitaryValueAdult = item.adultUnitaryValue.toString().toInt()
        val resultAdult = totalAmountAdult * unitaryValueAdult
        return Pair(totalAmountAdult, resultAdult)
    }

    private fun checkIfTheNumberingIsEmpty(item: Item) {
        if (item.amountNumber20.isEmpty()) {
            item.amountNumber20 = "0"
        }

        if (item.amountNumber21.isEmpty()) {
            item.amountNumber21 = "0"
        }

        if (item.amountNumber22.isEmpty()) {
            item.amountNumber22 = "0"
        }

        if (item.amountNumber23.isEmpty()) {
            item.amountNumber23 = "0"
        }

        if (item.amountNumber24.isEmpty()) {
            item.amountNumber24 = "0"
        }

        if (item.amountNumber25.isEmpty()) {
            item.amountNumber25 = "0"
        }

        if (item.amountNumber26.isEmpty()) {
            item.amountNumber26 = "0"
        }

        if (item.amountNumber27.isEmpty()) {
            item.amountNumber27 = "0"
        }

        if (item.amountNumber28.isEmpty()) {
            item.amountNumber28 = "0"
        }

        if (item.amountNumber29.isEmpty()) {
            item.amountNumber29 = "0"
        }

        if (item.amountNumber30.isEmpty()) {
            item.amountNumber30 = "0"
        }

        if (item.amountNumber31.isEmpty()) {
            item.amountNumber31 = "0"
        }

        if (item.amountNumber32.isEmpty()) {
            item.amountNumber32 = "0"
        }

        if (item.amountNumber33.isEmpty()) {
            item.amountNumber33 = "0"
        }

        if (item.amountNumber34.isEmpty()) {
            item.amountNumber34 = "0"
        }

        if (item.amountNumber35.isEmpty()) {
            item.amountNumber35 = "0"
        }

        if (item.amountNumber36.isEmpty()) {
            item.amountNumber36 = "0"
        }

        if (item.amountNumber37.isEmpty()) {
            item.amountNumber37 = "0"
        }

        if (item.amountNumber38.isEmpty()) {
            item.amountNumber38 = "0"
        }

        if (item.amountNumber39.isEmpty()) {
            item.amountNumber39 = "0"
        }

        if (item.amountNumber40.isEmpty()) {
            item.amountNumber40 = "0"
        }

        if (item.amountNumber41.isEmpty()) {
            item.amountNumber41 = "0"
        }

        if (item.amountNumber42.isEmpty()) {
            item.amountNumber42 = "0"
        }

        if (item.amountNumber43.isEmpty()) {
            item.amountNumber43 = "0"
        }

        if (item.amountNumber44.isEmpty()) {
            item.amountNumber44 = "0"
        }

        if (item.amountNumber45.isEmpty()) {
            item.amountNumber45 = "0"
        }

        if (item.amountNumber46.isEmpty()) {
            item.amountNumber46 = "0"
        }

        if (item.adultUnitaryValue.isEmpty()) {
            item.adultUnitaryValue = "0"
        }

        if (item.childrensUnitaryValue.isEmpty()) {
            item.childrensUnitaryValue = "0"
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

    private fun clear() {
        refEditText.text.clear()
        pairEditText.text.clear()
        colorEditText.text.clear()
        number20EditText.text.clear()
        number21EditText.text.clear()
        number22EditText.text.clear()
        number23EditText.text.clear()
        number24EditText.text.clear()
        number25EditText.text.clear()
        number26EditText.text.clear()
        number27EditText.text.clear()
        number28EditText.text.clear()
        number29EditText.text.clear()
        number30EditText.text.clear()
        number31EditText.text.clear()
        number32EditText.text.clear()
        number33EditText.text.clear()
        number34EditText.text.clear()
        number35EditText.text.clear()
        number36EditText.text.clear()
        number37EditText.text.clear()
        number38EditText.text.clear()
        number39EditText.text.clear()
        number40EditText.text.clear()
        number41EditText.text.clear()
        number42EditText.text.clear()
        number43EditText.text.clear()
        number44EditText.text.clear()
        number45EditText.text.clear()
        number46EditText.text.clear()
        childrensUnitaryValueEditText.text.clear()
        adultUnitaryValueEditText.text.clear()
    }
}