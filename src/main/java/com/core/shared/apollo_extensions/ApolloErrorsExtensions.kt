package com.core.shared.apollo_extensions

//import com.apollographql.apollo3.api.ApolloResponse
//import com.core.shared.base_repository.CODE
//
//
//fun ApolloResponse<*>.getApolloErrorList() = this.errors
//
//fun ApolloResponse<*>.getApolloErrorMessage(): String? {
//    return getApolloErrorList()?.find { it.message != "" }?.message
//}
//
//fun ApolloResponse<*>.getApolloErrorCode(): Any? {
//    return getApolloErrorList()?.find { it.extensions != null }?.extensions?.get(CODE)
//}