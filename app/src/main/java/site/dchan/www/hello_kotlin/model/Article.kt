package site.dchan.www.hello_kotlin.model

data class Article(val id: String,
                   val title: String,
                   val url: String,
                   val user: User)