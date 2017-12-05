package healthhealer.com.listviewdemo

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.lvMain)
        val redColor = Color.parseColor("#ff0000")
        listView.setBackgroundColor(redColor)
        listView.adapter = MyAdapter(this)//
    }

    private class MyAdapter(context: Context) : BaseAdapter() {
        private val mContext: Context

        init {
            mContext = context
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val tv = TextView(mContext)
            tv.text = "hi"
            return tv
        }

        override fun getItem(position: Int): Any {
            return "Test String"

        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount(): Int {
            return 10
        }

    }

}
