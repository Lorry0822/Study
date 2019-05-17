package cn.wj.study.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import cn.wj.study.R

class NormalActivity : AppCompatActivity() {

    companion object {
        /**
         * 界面入口
         *
         * @param context Context 对象
         */
        fun actionStart(context: Context) {
            context.startActivity(Intent(context, NormalActivity::class.java))
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_normal)

        Log.e("--Study--" + this.localClassName, "onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("--Study--" + this.localClassName, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.e("--Study--" + this.localClassName, "onStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("--Study--" + this.localClassName, "onRestoreInstanceState")
    }

    override fun onResume() {
        super.onResume()
        Log.e("--Study--" + this.localClassName, "onResume")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        Log.e("--Study--" + this.localClassName, "onCreateOptionsMenu")
        return super.onCreateOptionsMenu(menu)
    }

    override fun onPause() {
        super.onPause()
        Log.e("--Study--" + this.localClassName, "onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.e("--Study--" + this.localClassName, "onSaveInstanceState")
    }

    override fun onStop() {
        super.onStop()
        Log.e("--Study--" + this.localClassName, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("--Study--" + this.localClassName, "onDestroy")
    }
}
