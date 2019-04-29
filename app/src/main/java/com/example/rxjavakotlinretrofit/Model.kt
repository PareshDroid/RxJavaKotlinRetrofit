package com.example.rxjavakotlinretrofit

object Model {
    data class Result(val query: Query,val batchcomplete:String)
    data class Query(val searchinfo: SearchInfo,val search: ArrayList<SearchList>)
    data class SearchInfo(val totalhits: Int)
    data class SearchList(val ns: Int,val title: String,val pageid: Double,val size: Double,val wordcount: Double,val snippet: String,val timestamp: String)
}