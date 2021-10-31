   package com.kaal.taskstodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kaal.taskstodo.adapters.TodoAdapter
import com.kaal.taskstodo.models.Todo
import kotlinx.android.synthetic.main.activity_main.*

   class MainActivity : AppCompatActivity() {

    private val todos: ArrayList<Todo> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvTodos.layoutManager = LinearLayoutManager(this)

        val todoAdapter = TodoAdapter(todos)
        rvTodos.adapter = todoAdapter

        btnAdd.setOnClickListener {
            val newTodo = etNewTask.text.toString()
            todos.add(Todo(newTodo, false))
            todoAdapter.notifyDataSetChanged()
        }
    }
}