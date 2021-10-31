package com.kaal.taskstodo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.kaal.taskstodo.R
import com.kaal.taskstodo.models.Todo

class TodoAdapter(
    private val todos: ArrayList<Todo>
): Adapter<TodoAdapter.TodoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val li = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = li.inflate(R.layout.list_item_todo, parent, false)
        return TodoViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.tvTodoTask.text = todos[position].task
    }

    class  TodoViewHolder(item: View): RecyclerView.ViewHolder(item){
        val tvTodoTask: TextView = item.findViewById(R.id.tvTodoTask)
    }
}