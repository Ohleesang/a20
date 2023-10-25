package com.example.a20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(n: Long): Long {
                var answer: Long = 0
                var nToString : String = n.toString()
                var nToCharArray : CharArray = nToString.toCharArray()
                nToCharArray.sortDescending()
                //Char에서 String으로 변환해주는 함수는있지만 Char 에서 Long으로 변환해주는 함수는 없는듯하다.                for(index in 0..nToCharArray.size-1){
                    answer = answer + nToCharArray.get(index).toString().toLong()*
                            Math.pow(10.0,(nToCharArray.size-1-index).toDouble()).toLong()
                              }
                return answer
            }
        }
        val a = Solution()
        a.solution(118372)
    }

}