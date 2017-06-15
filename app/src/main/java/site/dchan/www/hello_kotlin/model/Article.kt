package site.dchan.www.hello_kotlin.model

/**
 * Created by DaichiSaito on 2017/06/15.
 */
data class Article(val id: String,
                   val title: String,
                   val url: String,
                   val user: User)