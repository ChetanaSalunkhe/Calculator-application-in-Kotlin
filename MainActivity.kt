package com.chetana.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.edtval

class MainActivity : AppCompatActivity() {
    var value1:Float = 0f
    var value2:Float = 0f

    var mainValue : Float =0f

    var addition:Boolean=false
    var substraction:Boolean=false
    var multiplication:Boolean=false
    var division:Boolean=false

    var focusBtn :Int = 0
    var operator=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        setListeners()
    }

    private fun init(){

    }

    private fun setListeners() {
        btn_1.setOnClickListener {
            focusBtn = 1

            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_1.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 1)
                btn_1.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_2.setOnClickListener {
            focusBtn = 2

            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_2.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 2)
                btn_2.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_3.setOnClickListener {
            focusBtn = 3
            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_3.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 3)
                btn_3.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_4.setOnClickListener {
            focusBtn = 4
            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_4.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 4)
                btn_4.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_5.setOnClickListener {
            focusBtn = 5
            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_5.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 5)
                btn_5.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_6.setOnClickListener {
            focusBtn = 6
            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_6.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 6)
                btn_6.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_7.setOnClickListener {
            focusBtn = 7
            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_7.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 7)
                btn_7.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_8.setOnClickListener {
            focusBtn = 8
            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_8.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 8)
                btn_8.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_9.setOnClickListener {
            focusBtn = 9
            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_9.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 9)
                btn_9.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_0.setOnClickListener {
            focusBtn = 0
            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_0.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 0)
                btn_0.setBackgroundResource(R.drawable.border_buttons_focus)

        }

        btn_decimal.setOnClickListener {
            focusBtn = 17
            //set btnnumber to edittext by appending edttextvalue
            edtval.setText(edtval.text.toString()+btn_decimal.text.toString())

            if(value1 == 0f){
                txtval.setText(edtval.text.toString())
            }else{
                txtval.setText(value1.toString()+" "+operator+" "+edtval.text.toString())
            }

            setDefaultColor()
            if(focusBtn == 17)
                btn_decimal.setBackgroundResource(R.drawable.border_buttons_focus)

        }

        //add
        btn_plus.setOnClickListener {
            operator ="+"
            focusBtn = 11
            value1 += (edtval.text.toString()).toFloat()
            edtval.setText("")

            txtval.setText(value1.toString()+" + "+edtval.text.toString())

            addition = true

            setDefaultColor()
            if(focusBtn == 11)
                btn_plus.setBackgroundResource(R.drawable.border_buttons_focus)

        }

        //minus
        btn_minus.setOnClickListener {
            operator ="-"
            focusBtn = 12

            if(value1>=0f)
                value1 = (edtval.text.toString()).toFloat()
            else
                value1 = (edtval.text.toString()).toFloat()

            edtval.setText("")

            txtval.setText(value1.toString()+" - "+edtval.text.toString())

            substraction = true

            setDefaultColor()
            if(focusBtn == 12)
                btn_minus.setBackgroundResource(R.drawable.border_buttons_focus)

        }

        //multiply
        btn_multiply.setOnClickListener {
            operator ="*"
            focusBtn = 13

            if(value1>=0f)
                value1 = (edtval.text.toString()).toFloat()
            else
                value1 = (edtval.text.toString()).toFloat()
            edtval.setText("")

            txtval.setText(value1.toString()+" * "+edtval.text.toString())

            multiplication = true

            setDefaultColor()

            if(focusBtn == 13)
                btn_multiply.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        //divide
        btn_divide.setOnClickListener {
            operator ="/"
            focusBtn = 14
            value1 = (edtval.text.toString()).toFloat()
            edtval.setText("")

            txtval.setText(value1.toString()+" / "+edtval.text.toString())

            division = true

            setDefaultColor()
            if(focusBtn == 14)
                btn_divide.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_sqrt.setOnClickListener {
            focusBtn = 18
            value1 = (edtval.text.toString()).toFloat()
            //(Math.sqrt(value1.toDouble())).toString()
            edtval.setText((Math.sqrt(value1.toDouble())).toString())

            txtval.setText("sqrt("+value1.toString()+")")

            setDefaultColor()
            if(focusBtn == 18)
                btn_sqrt.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_percentage.setOnClickListener {
            focusBtn = 19
            value1 = (edtval.text.toString()).toFloat()

            var pctg = (value1 *1/100)

            edtval.setText(pctg.toString())

            txtval.setText(value1.toString()+" + "+pctg.toString())

            setDefaultColor()
            if(focusBtn == 19)
                btn_percentage.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        //equal
        btn_result.setOnClickListener {
            focusBtn = 15
            value2 = (edtval.text.toString()).toFloat()

            if(addition == true){

                mainValue = value1 + value2

                addition = false

            }else if(substraction == true){
                mainValue = value1 - value2

                substraction = false

            }else if(multiplication == true){
                mainValue = value1 * value2

                multiplication = false

            }else if(division == true){
                mainValue = value1 / value2

                division = false

            }

            edtval.setText(mainValue.toString())

            setDefaultColor()

            if(focusBtn == 15)
                btn_result.setBackgroundResource(R.drawable.border_buttons_focus)
        }

        btn_clear.setOnClickListener {
            focusBtn = 16
            edtval.setText("")
            value1 =0f
            value2 =0f
            txtval.setText("")

            setDefaultColor()
            if(focusBtn == 16)
                btn_clear.setBackgroundResource(R.drawable.border_buttons_focus)
        }

    }

    fun setDefaultColor(){

        btn_1.setBackgroundResource(R.drawable.border_buttons_2)
        btn_2.setBackgroundResource(R.drawable.border_buttons_2)
        btn_3.setBackgroundResource(R.drawable.border_buttons_2)
        btn_4.setBackgroundResource(R.drawable.border_buttons_2)
        btn_5.setBackgroundResource(R.drawable.border_buttons_2)
        btn_6.setBackgroundResource(R.drawable.border_buttons_2)
        btn_7.setBackgroundResource(R.drawable.border_buttons_2)
        btn_8.setBackgroundResource(R.drawable.border_buttons_2)
        btn_9.setBackgroundResource(R.drawable.border_buttons_2)
        btn_0.setBackgroundResource(R.drawable.border_buttons_2)
        btn_plus.setBackgroundResource(R.drawable.border_buttons_2)
        btn_minus.setBackgroundResource(R.drawable.border_buttons_2)
        btn_multiply.setBackgroundResource(R.drawable.border_buttons_2)
        btn_divide.setBackgroundResource(R.drawable.border_buttons_2)
        btn_result.setBackgroundResource(R.drawable.border_buttons_2)
        btn_decimal.setBackgroundResource(R.drawable.border_buttons_2)
        btn_clear.setBackgroundResource(R.drawable.border_buttons_2)
        btn_sqrt.setBackgroundResource(R.drawable.border_buttons_2)
        btn_percentage.setBackgroundResource(R.drawable.border_buttons_2)

    }

}
