package cn.visual.todo.addedittask

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import cn.visual.todo.R
import com.google.android.material.textfield.TextInputLayout

class AddEditTaskActivity : AppCompatActivity() {

    private lateinit var title: TextInputLayout
    private lateinit var toolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_edit_task)

        initView()
    }

    private fun initView() {
        title = findViewById(R.id.title)

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}