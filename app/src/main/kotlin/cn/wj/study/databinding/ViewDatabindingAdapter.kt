package cn.wj.study.databinding

import android.view.View
import androidx.databinding.BindingAdapter

class ViewDatabindingAdapter {

    companion object {

        @JvmStatic
        @BindingAdapter("android:onClick")
        fun setOnClickListener(v: View, onClick: () -> Unit) {
            v.setOnClickListener {
                onClick.invoke()
            }
        }
    }
}