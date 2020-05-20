package util

import android.content.Context
import android.widget.Toast

fun ToastUtil(context: Context, message:String) {
    Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
}