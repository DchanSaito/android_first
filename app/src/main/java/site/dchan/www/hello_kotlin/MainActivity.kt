package site.dchan.www.hello_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import site.dchan.www.hello_kotlin.model.Article
import site.dchan.www.hello_kotlin.model.User
import site.dchan.www.hello_kotlin.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listAdapter = ArticleListAdapter(applicationContext)
        listAdapter.articles = listOf(dummyArticle("Kotlin", "hogeo"), dummyArticle("Java", "foo"))

        val listView: ListView = findViewById(R.id.list_view) as ListView
        listView.adapter = listAdapter
    }

    private fun dummyArticle(title: String, userName: String): Article =
            Article(id = "",
                    title = title,
                    url = "https://kotlinlang.org/",
                    user = User(id = "", name = userName, profileImageUrl = ""))
}
