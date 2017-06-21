package site.dchan.www.hello_kotlin.client

import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable
import site.dchan.www.hello_kotlin.model.Article

interface ArticleClient {
    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}