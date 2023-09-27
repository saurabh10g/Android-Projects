package com.saurabh.texttospeech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Toast
import com.saurabh.texttospeech.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() , TextToSpeech.OnInitListener{

    private var tts : TextToSpeech? = null
    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        tts = TextToSpeech(this,this)

        binding?.btnSpeak?.setOnClickListener{
            if(binding?.etEnteredText?.text!!.isEmpty())
            {
                Toast.makeText(this,"Please Enter Some Text.",Toast.LENGTH_LONG).show()
            }
            else
            {
                speakOut(binding?.etEnteredText?.text.toString())
            }
        }
    }

    override fun onInit(status:Int)
    {
        if(status == TextToSpeech.SUCCESS)
        {
            var result = tts!!.setLanguage(Locale.US)

            if(result == TextToSpeech.LANG_MISSING_DATA ||
                    result == TextToSpeech.LANG_NOT_SUPPORTED)
            {
                Log.e("TTS","The Language Specified is not Supportive.")
            }
        }
        else
        {
            Log.e("TTS","Initialization Failed !!!")
        }
    }

    private fun speakOut(text:String)
    {
        tts?.speak(text,TextToSpeech.QUEUE_FLUSH,null," ")
    }

    override fun onDestroy() {
        super.onDestroy()
        if(tts != null)
        {
            tts?.stop()
            tts?.shutdown()
        }
        binding = null
    }
}