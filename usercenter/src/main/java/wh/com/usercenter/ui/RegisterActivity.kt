package wh.com.usercenter.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast
import wh.com.usercenter.R

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        btnHaveCode.setOnClickListener{
//            Toast.makeText(this,"123456",Toast.LENGTH_SHORT).show()
            toast("123456")
//            startActivity(intentFor<TestActivity>("id" to 5))
//            startActivity<TestActivity>("id" to 10)
        }
    }
}
