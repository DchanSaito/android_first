package site.dchan.www.hello_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import site.dchan.www.hello_kotlin.model.Article
import site.dchan.www.hello_kotlin.model.User
import site.dchan.www.hello_kotlin.view.ArticleView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // ArticleViewオブジェ作成
        val articleView = ArticleView(applicationContext)

        // ArticleObjを生成して、ArticleViewにセット
        articleView.setArticle(Article(id = "123",
                title = "Kotlin",
                url = "http://www.example.com/articles/123",
                user = User(id = "456", name = "hogeo", profileImageUrl = "")))

        // Layout
        setContentView(articleView)
    }
}
