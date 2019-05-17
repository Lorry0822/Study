package cn.wj.study.activity

import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import cn.wj.study.R

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: cn.wj.study.databinding.ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.model = Model()


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

    inner class Model {

        /** 普通 Activity */
        val onNormalActivityClick: () -> Unit = {
            NormalActivity.actionStart(this@MainActivity)
        }

        /** 透明背景 Activity */
        val onTransparentActivityClick: () -> Unit = {
            TransparentActivity.actionStart(this@MainActivity)
        }

        /** Dialog  */
        val onDialogClick: () -> Unit = {
            AlertDialog.Builder(this@MainActivity)
                    .setTitle("Dialog")
                    .setNegativeButton("取消", { dialog, _ ->
                        Log.e("--Study--" + this.javaClass.simpleName, "Dialog dismiss")
                        dialog.dismiss()
                    })
                    .create()
                    .show()
            Log.e("--Study--" + this.javaClass.simpleName, "Dialog show")
        }
    }
}
