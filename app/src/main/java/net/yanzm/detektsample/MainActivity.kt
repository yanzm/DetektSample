package net.yanzm.detektsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(find3rd(listOf("a", "b", "c", "d", "e"))) // c
    }

    fun find3rd(list: List<String>): String {
        if (list.isEmpty()) {
            return ""
        }

        if (list.size < THIRD_INDEX) {
            return ""
        }

        return list[2]
    }
}

private const val THIRD_INDEX = 3
